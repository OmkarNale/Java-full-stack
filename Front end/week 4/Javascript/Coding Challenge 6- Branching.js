
var smartphonePrice = 30000, bankBalance = 25000, creditLimit = 3000;

if( smartphonePrice < bankBalance){
    console.log( 'I can buy the phone' );
} else {
   console.log( "I can't buy the phone" );
}

if(smartphonePrice < bankBalance + creditLimit){
    console.log( 'I can buy the phone now' );
} else {

    var leftAmount = smartphonePrice - (bankBalance + creditLimit); 
    console.log("Still required money ", leftAmount);
}
