
var saturday = false,  sunday = true;
var freeTime = true;

var weekend = saturday || sunday;
console.log(weekend);


weekend = freeTime && weekend;
console.log(weekend);

console.log(' Can I go to the park today ',weekend && freeTime);