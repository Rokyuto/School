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
        clearToAirportFieldOnSameAirportChoice(this.textContent);
        SelectField_FromAirport_Text.value = this.id; // Change FromAirportSelectField's Text in HTML page to clicked From Airport Option Element's Text
        console.log(SelectField_FromAirport_Text)
        removeChosenAirport(this.id); // Call Function to remove from ToAirport Menu, the chosen (clicked) Airport from FromAirport Menu
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
        SelectField_ToAirport_Text.value = this.id; // Change ToAirportSelectField's Text in HTML page to clicked To Airport Option Element's Text
        OptionList_ToAirports.classList.toggle("OptionsList_ToAirport"); // Toggle (hide) ToAirport Options List Visibility
    }
}

// Switch Airports Choices Button's Function
function switchAirports(){
    if(SelectField_FromAirport_Text.value != "From" && SelectField_ToAirport_Text.value == "To"){ // If To Select Field is empty
        SelectField_ToAirport_Text.value = SelectField_FromAirport_Text.value;
        SelectField_FromAirport_Text.value = "From";
        
    }
    else if(SelectField_ToAirport_Text.value != "To" && SelectField_FromAirport_Text.value == "From"){ // If From Select Field is empty
        SelectField_FromAirport_Text.value = SelectField_ToAirport_Text.value;
        SelectField_ToAirport_Text.value = "To";
    }
    else if(SelectField_FromAirport_Text.value != "From" && SelectField_ToAirport_Text.value != "To"){ // If the two Select Fields are filled
        var temp = SelectField_FromAirport_Text.value;
        SelectField_FromAirport_Text.value = SelectField_ToAirport_Text.value;
        SelectField_ToAirport_Text.value = temp;
    }
}

// Function to Clear to default value ("To") ToAirportSelectField's Text when the choice in ToAirportSelect field is selected in FromAirportSelect field too
function clearToAirportFieldOnSameAirportChoice(airportCityName){
    if(SelectField_ToAirport_Text){ // If ToAirportSelectField's Text is initialize (has chosen Airport)
        if(airportCityName == SelectField_ToAirport_Text.innerHTML){ // If the Airport value in ToAirportSelectField is repeated in FromAirportSelectField
            SelectField_ToAirport_Text.innerHTML = "To"; // Return to default the value of ToAirport_SelectField's Text
        }
    }
}

var removedAirport = null; // Variable to store Old Removed Airport

// Funtion to remove from ToAirportMenu the chosen/selected Airport Option from FromAirportMenu
function removeChosenAirport(airportCityName){ // Airport's City Name = Airport's ID
    returnOldChosenAirport(); // Call Function to return Old Removed Airport
    var airports = document.getElementsByName(airportCityName); // Find all Airport Options with the given AirportID, which is also the Airport's City Name
    removedAirport = airports[1]; // Update Removed Airport Option Variable with the new Airport to remove data
    airports[1].parentNode.removeChild(airports[1]); // Remove the Airport Option from ToAirportMenu, equal to the chosen Airport Option from FromAirportMenu
}

// Function to return,removed, old Chosen Airport to ToAirportMenu
function returnOldChosenAirport(){ // Airport's City Name = Airport's ID
    if(removedAirport){ // Check If there has already been chosen Airport before (client choose Airport for 2 or more times)
        createAirportOption(); // Call function to return the old Airport Choice/Option
    }
}   

// Function to create ToAirport Menu Option
function createAirportOption(){
    var airportOption = document.createElement("li"); // Create element li (option in ul list later)
    airportOption.className="Option_ToAirport"; // Define option li's class value
    airportOption.setAttribute("name",removedAirport.id) // Define option li's name value
    airportOption.id=removedAirport.id; // Define option li's id value

    var airportCity = document.createElement("p"); // Create Paragraph Element
    airportCity.textContent = removedAirport.id; // Define paragraph element's value (Text Content)

    var aircraftImg = document.createElement("img"); // Create Image Element
    aircraftImg.src="Images/airplane.png"; // Define Image Element's image source
    aircraftImg.alt="Airpline Image Image"; // Define Image Element's image alternative text (when image can't be loaded)

    airportOption.appendChild(aircraftImg); // Append the Image element to li option element
    airportOption.appendChild(airportCity); // Append the paragraph element to li option element
    document.getElementById('OptionsList_ToAirport').appendChild(airportOption); // Append li element as option to ul list (to Airport Menu)
}
