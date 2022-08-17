var global_a = 1;

console.log("outside the function foo global_a :", global_a);

function foo() {

    var local_b = 2;
    
    console.log("Inside the function foo local_b :", local_b);
    console.log("Inside the function foo global_a :", global_a);
}

foo();

// console.log("outside the function foo local_b :", local_b);