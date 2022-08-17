//JavaScript Logical Operators

//Example 1
var isRaining = true, goingByWalk = false, goingByCar = true;
var takeUmbrella = isRaining && goingByWalk;
console.log(takeUmbrella);

//Example 2
var priceOfPhone = 42000, bankBalance = 60000, iAmInterested = true;
var willIBuyPhone = priceOfPhone < bankBalance && iAmInterested;
console.log(willIBuyPhone);

//Example 3
var priceOfPhone = 42000, bankBalance = 20000, firendsBankBalance = 80000, iAmInterested = true;
var willIBuyPhone = priceOfPhone < firendsBankBalance && iAmInterested;
console.log(willIBuyPhone);
console.log( priceOfPhone < bankBalance || priceOfPhone < firendsBankBalance);

console.log(!isRaining);

