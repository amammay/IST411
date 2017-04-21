var infoWindow;

/// Whether the browser supports HTML5 Geolocation services
var isGeoLocSupported;
/// The direction renderer which will be used to display directions on the map
var directionsDisplay;
/// Googlemaps direction service. Responds to direction requests
var directionsService;
/// The googlemap object
var map;
/// A marker for the current geoposition
var currentGeoPosMarker;
/// A marker for the starting geoposition
var startingGeoPosMarker;
/// A marker for the start of any route or path
var startMarker;
/// A marker for the end of any route or path
var endMarker;


/**
 * Fire the map up
 */
function initialize() {
    map = new google.maps.Map(document.getElementById('map'), {
        zoom: 14
    });

    infoWindow = new google.maps.InfoWindow();
    var pos;
    // Try HTML5 geolocation.
    if (navigator.geolocation) {
        navigator.geolocation.getCurrentPosition(function (position) {
            pos = {
                lat: position.coords.latitude,
                lng: position.coords.longitude
            };

            map.setCenter(pos);
            startingGeoPosMarker = new google.maps.Marker({
                position: pos,
                map: map,
                title: "You started from here!"
            });

            // update current long/lat readouts
            document.getElementById("currentLatitude").innerHTML = pos.lat.toFixed(14);
            document.getElementById("currentLongitude").innerHTML = pos.lng.toFixed(14);

            var watchId = navigator.geolocation.watchPosition(updateMap);

            google.maps.event.addListener(startingGeoPosMarker, 'click', function (e) {
                infoWindow.setContent("You are here");
                infoWindow.open(map, this);
            });

        }, function () {
            handleLocationError(true, infoWindow, map.getCenter());
        });

    } else {
        // Browser doesn't support Geolocation
        handleLocationError(false, infoWindow, map.getCenter());
    }



    google.maps.event.addDomListener(document.getElementById('trackPathGeo'), 'click', calcRoute);



}


function handleLocationError(browserHasGeolocation, infoWindow, pos) {
    infoWindow.setPosition(pos);
    infoWindow.setContent(browserHasGeolocation ?
        'Error: The Geolocation service failed.' :
        'Error: Your browser doesn\'t support geolocation.');
    infoWindow.open(map);

}


/// Function to calculate and display the route the user has input in the start and end inputs, using the
/// travel method indicated in the mode selection.
function calcRoute() {

    directionsService = new google.maps.DirectionsService();
    var start = document.getElementById('start').value;
    var end = document.getElementById('end').value;
    var request = {
        origin: start,
        destination: end,
        travelMode: document.getElementById('mode').value
    };

    directionsService.route(request, function (response, status) {
        if (status == google.maps.DirectionsStatus.OK) {
            directionsDisplay.setDirections(response);
            //Create descriptive markers at start and destination
            var leg = response.routes[0].legs[0];

            if (startMarker != null) {
                startMarker.setMap(null);
                startMarker = null;
            }
            startMarker = new google.maps.Marker({
                position: leg.start_location,
                map: map,
                title: leg.start_address
            });

            if (endMarker != null) {
                endMarker.setMap(null);
                endMarker = null;
            }
            endMarker = new google.maps.Marker({
                position: leg.end_location,
                map: map,
                title: leg.end_address
            });

            // Set total distance
            document.getElementById("totalDistance").innerHTML =
                (google.maps.geometry.spherical.computeDistanceBetween(startLatLng, endLatLng) / 1000).toFixed(2) + " km";
        }
        else
            handleRouteResponseError(status);
    });

}


/// Function which updates the position of the map and the path details as the geolocation
/// changes
function updateMap(location) {
    var myLatlng = new google.maps.LatLng(location.coords.latitude, location.coords.longitude);
    map.setCenter(myLatlng);
    map.setZoom(14);

    // update current long/lat readouts
    document.getElementById("currentLatitude").innerHTML = location.coords.latitude.toFixed(14);
    document.getElementById("currentLongitude").innerHTML = location.coords.longitude.toFixed(14);



    // show current location on map
    if (currentGeoPosMarker != null) {
        currentGeoPosMarker.setMap(null);
        currentGeoPosMarker = null;
    }
    currentGeoPosMarker = new google.maps.Marker({
        position: myLatlng,
        map: map,
        title: "Current position"
    });

    // update distance remaining and covered if a path has been set
    if (endMarker == null || startMarker == null)
        return;

    document.getElementById("distanceTraveled").innerHTML =
        (google.maps.geometry.spherical.computeDistanceBetween(myLatlng, startMarker.getPosition()) / 1000).toFixed(2) + " km";

    document.getElementById("distanceRemaining").innerHTML =
        (google.maps.geometry.spherical.computeDistanceBetween(myLatlng, endMarker.getPosition()) / 1000).toFixed(2) + " km";

    // update the direction route to run from current location to destination
    var request = {
        origin: myLatlng,
        destination: endMarker.getPosition(),
        travelMode: document.getElementById('mode').value
    };

    directionsService.route(request, function (response, status) {
        if (status == google.maps.DirectionsStatus.OK) {
            directionsDisplay.setDirections(response);
            //Create descriptive markers at start and destination
            var leg = response.routes[0].legs[0];

            if (startMarker != null) {
                startMarker.setMap(null);
                startMarker = null;
            }
            startMarker = new google.maps.Marker({
                position: leg.start_location,
                map: map,
                title: leg.start_address
            });

            if (endMarker != null) {
                endMarker.setMap(null);
                endMarker = null;
            }
            endMarker = new google.maps.Marker({
                position: leg.end_location,
                map: map,
                title: leg.end_address
            });
        }
    });

}