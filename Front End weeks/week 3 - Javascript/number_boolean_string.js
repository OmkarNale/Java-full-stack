// There three basic data types : number (int + float), boolean and string


//-----------------------------------------------------------Number--------------------------------------------------------------

var x = 1, y, z = 2.3783; // x is number type || y is undefine type

console.log(x); // 1
console.log(y); // undefine


// typeOf operator is used to know type of variable

console.log( `Type of 1.5 : ${typeof 1.5}` );
console.log( `Type of x : ${typeof x }` );
console.log( `Type of y : ${typeof y}` );
console.log( `Type of y : ${typeof z}` );

//-----------------------------------------------------------Boolean------------------------------------------------------------

var isItRaining = true, isItPouring = false;

console.log( `Is It Pouring : ${isItPouring}` );
console.log( `Is It Raining : ${isItRaining}` );
console.log( `Typeof isItPouring : ${isItPouring}` );

//---------------------------------------------------------String---------------------------------------------------------------

var firstName = "omkar", message = "Good Morning !";

console.log(`Name is : ${firstName} !!`);
console.log( `Hi ${firstName} \n ${message} !!`);
console.log( `message length is : ${message.length}`);
console.log( message + ' ' + firstName);
