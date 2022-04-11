function printhello() {
    console.log("hello");
}
console.log(printhello());
function multiply(a, b) {
    return a * b;
}
console.log(multiply(2, 4));
function add(a, b, c) {
    return a + b + (c || 0);
}
console.log(add(20, 22));
console.log(add(2, 4, 5));
function pow(value, expoent) {
    if (expoent === void 0) { expoent = 10; }
    return Math.pow(value, expoent);
}
console.log(pow(123));
// named parameters
function divide(_a) {
    var dividend = _a.dividend, divisor = _a.divisor;
    return dividend / divisor;
}
console.log(divide({ dividend: 1000, divisor: 123 }));
// rest parameters
function add1(a, b) {
    var rest = [];
    for (var _i = 2; _i < arguments.length; _i++) {
        rest[_i - 2] = arguments[_i];
    }
    return a + b + rest.reduce(function (p, c) { return p + c; }, 0);
}
console.log(add1(10, 10, 10, 10, 10, 10));
