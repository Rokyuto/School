var returnFlightDatePicker = document.getElementById("returnFlightDate"); // Get Return Flight Date Picker Element
var noReturnLabel = document.getElementById("Container_NoReturnFlightDate");
var flightType = document.getElementById("Selector_FlightType");

// Function to show/hide (toggle) Return Flight Date Picker | Function is called when Flight Type Selector's Value is changed (client choose Return Option)
function flightTypeChoice(){
    toggleNoReturn();
    returnFlightDatePicker.classList.toggle("returnFlightDate");
}

// Function to handle No Return Element visibility, when Flight Type is changed to Return
function toggleNoReturn(){
    if(Selector_FlightType.value == "Return"){
        noReturnLabel.style.display = "none";
    }
    else{
        noReturnLabel.style.display = "block";
    }
}
