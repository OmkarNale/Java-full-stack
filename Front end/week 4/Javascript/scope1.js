var global_x = 1;

console.log("outside of function global_x =", global_x);

function foo() {

    var local_x = 2;

    console.log( "inside the foo function local_x = ", local_x);
    console.log( "inside the foo function global_x =", global_x);

    function bar() {

        var local_bar_x = 3;
        
        console.log( "inside the foo function local_x = ", local_x);
        console.log( "inside the foo function global_x =", global_x);
        console.log( "inside the foo function local_bar_x =", local_bar_x);
    }

    bar();
    // console.log( "inside the foo function local_bar_x =", local_bar_x);   //acccing outside scope

}

foo();