var FromAirportSelectField = document.getElementById("FromAirportSelectField"); // Variable to Initialize FromAirport Selector Element (element with id = "FromAirportSelectField")
var FromAirportSelectFieldText = document.getElementById("FromAirportSelectFieldText"); // Variable to Initialize FromAirport Selector Element' Text (element with id = "FromAirportSelectFieldText")
var AirportsList = document.getElementsByClassName("AirportOption"); // Variable to Initialize all Airport Options (Elements in the HTML page with class="option")
var AirportsOptionList = document.getElementById("FromAirportOptionsList")

// FromAirport Select Field On Click Event
FromAirportSelectField.onclick = function() {
    AirportsOptionList.classList.toggle("FromAirportOptionsList"); // Toggle (hide) fromAirport Options List visibility
}


// ForEach Airport Loop in AiprortList
for(airport of AirportsList){
    airport.onclick = function(){ // On Click Event
        FromAirportSelectFieldText.innerHTML = this.textContent; // Change FromAirportSelectField' Text in HTML page to clicked Airport Option Element' Text
        AirportsOptionList.classList.toggle("FromAirportOptionsList"); // Toggle (hide) fromAirport Options List visibility
    }
}