// Variables to get From Airport Menu Elements (get them from the HTML page)
var SelectField_FromAirport = document.getElementById("SelectField_FromAirport"); // Initialize From Airport Selector Element
var SelectField_FromAirport_Text = document.getElementById("SelectField_FromAirport_Text"); // Initialize From Airport Selector Element's Text
var List_FromAirports = document.getElementsByClassName("Option_FromAirport"); // Initialize all From Airport Options
var OptionList_FromAirports = document.getElementById("OptionsList_FromAirport"); // Initialize Menu List Element with From Airports Options

// FromAirport Select Field On Click Event
SelectField_FromAirport.onclick = function() {
    OptionList_FromAirports.classList.toggle("OptionsList_FromAirport"); // Toggle (hide) FromAirport Options List Visibility
}

// ForEach Airport Loop in List with From Aiprort
for(FromAirport of List_FromAirports){
    FromAirport.onclick = function(){ // On Click Event
        SelectField_FromAirport_Text.innerHTML = this.textContent; // Change FromAirportSelectField's Text in HTML page to clicked From Airport Option Element's Text
        removeChosenAirport(this.id);
        OptionList_FromAirports.classList.toggle("OptionsList_FromAirport"); // Toggle (hide) FromAirport Options List Visibility
    }
}

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Variables to get To Airport Menu Elements (get them from the HTML page)
var SelectField_ToAirport = document.getElementById("SelectField_ToAirport"); // Initialize To Airport Selector Elemen
var SelectField_ToAirport_Text = document.getElementById("SelectField_ToAirport_Text"); // Initialize To Airport Selector Element's Text
var List_ToAirports = document.getElementsByClassName("Option_ToAirport"); // Initialize all To Airport Options
var OptionList_ToAirports = document.getElementById("OptionsList_ToAirport"); // Initialize Menu List Element with To Airports Options

// ToAirport Select Field On Click Event
SelectField_ToAirport.onclick = function() {
    OptionList_ToAirports.classList.toggle("OptionsList_ToAirport"); // Toggle (hide) ToAirport Options List Visibility
}

// ForEach Airport Loop in List with To Aiprort
for(toAirport of List_ToAirports){
    toAirport.onclick = function(){ // On Click Event
        SelectField_ToAirport_Text.innerHTML = this.textContent; // Change ToAirportSelectField's Text in HTML page to clicked To Airport Option Element's Text
        OptionList_ToAirports.classList.toggle("OptionsList_ToAirport"); // Toggle (hide) ToAirport Options List Visibility
    }
}

// Switch Airports Button's Function
function switchAirports(){
    if(SelectField_FromAirport_Text.innerHTML != "From" && SelectField_ToAirport_Text.innerHTML == "To"){
        SelectField_ToAirport_Text.innerHTML = SelectField_FromAirport_Text.innerHTML;
        SelectField_FromAirport_Text.innerHTML = "From";
        
    }
    else if(SelectField_ToAirport_Text.innerHTML != "To" && SelectField_FromAirport_Text.innerHTML == "From"){
        SelectField_FromAirport_Text.innerHTML = SelectField_ToAirport_Text.innerHTML;
        SelectField_ToAirport_Text.innerHTML = "To";
    }
    else if(SelectField_FromAirport_Text.innerHTML != "From" && SelectField_ToAirport_Text.innerHTML != "To"){
        var temp = SelectField_FromAirport_Text.innerHTML;
        SelectField_FromAirport_Text.innerHTML = SelectField_ToAirport_Text.innerHTML;
        SelectField_ToAirport_Text.innerHTML = temp;
    }
}

var removedAirport = null;

// Funtion to remove from ToAirportMenu the chosen/selected Airport Option from FromAirportMenu
function removeChosenAirport(airportName){ // Airport's City Name = Airport's ID
    returnOldChosenAirport();
    var airports = document.getElementsByName(airportName); // Find all Airport Options with the given AirportID, which is also the Airport's City Name
    removedAirport = airports[1]; // Update Removed Airport Option Variable
    airports[1].parentNode.removeChild(airports[1]); // Remove the Airport Option from ToAirportMenu, equal to the chosen Airport Option from FromAirportMenu
}

// Function to return old Airport Choice (the Airport choice before the new Airport Choice)
function returnOldChosenAirport(){ // Airport's City Name = Airport's ID
    if(removedAirport){ // Check If there has already been chosen Airport before (client choose Airport for 2 or more times)
        createAirportOption(); // Call function to return the old Airport Choice/Option
    }
}   

// Function to create ToAirport Menu Option
function createAirportOption(){
    var airportOption = document.createElement("li");
    airportOption.className="Option_ToAirport";
    airportOption.setAttribute("name",removedAirport.id)
    airportOption.id=removedAirport.id;
    var airportCity = document.createElement("p");
    airportCity.textContent = removedAirport.id;

    var aircraftImg = document.createElement("img");
    aircraftImg.src="Images/airplane.png";
    aircraftImg.alt="Airpline Image Image";
    airportOption.appendChild(aircraftImg);

    airportOption.appendChild(airportCity); // document.createTextNode('The man who mistook his wife for a hat')

    document.getElementById('OptionsList_ToAirport').appendChild(airportOption);
}
