var infoWindow;

/// Whether the browser supports HTML5 Geolocation services
var isGeoLocSupported;
/// The direction renderer which will be used to display directions on the map
var directionsDisplay;
/// Googlemaps direction service. Responds to direction requests
var directionsService = new google.maps.DirectionsService();
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



google.maps.event.addDomListener(document.getElementById('trackPathGeo'), 'click', TODO);



}

function TODO()
{

}


function handleLocationError(browserHasGeolocation, infoWindow, pos) {
    infoWindow.setPosition(pos);
    infoWindow.setContent(browserHasGeolocation ?
        'Error: The Geolocation service failed.' :
        'Error: Your browser doesn\'t support geolocation.');
    infoWindow.open(map);

}




