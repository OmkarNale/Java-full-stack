var discount = function (price, rate) {
    if (rate === void 0) { rate = 10.12; }
    return price * rate;
};
discount(500);
discount(500, 12);
