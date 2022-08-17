var global_x = 1;

console.log("outside of function global_x = ", global_x);

function foo() {

    var local_foo_x = 2;
    
    console.log( 'inside the foo, global_x ', global_x);
    console.log( 'inside the foo, local_foo_x ', local_foo_x);

    function bar() {

        var local_bar_x = 3;
        local_bar_y = 3;

        console.log( 'inside the bar, global_x ', global_x);
        console.log( 'inside the bar, local_foo_x ', local_foo_x);
        console.log( 'inside the bar, local_bar_x ', local_bar_x);
        console.log( 'inside the bar, local_bar_y ', local_bar_y);

    }

    bar();
    console.log( 'inside the foo, local_bar_y ', local_bar_y);


}

foo();
console.log( 'outside the foo, local_bar_y ', local_bar_y);
