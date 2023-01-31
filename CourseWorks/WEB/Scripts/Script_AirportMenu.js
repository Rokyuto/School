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
        return true;
    }
}

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
