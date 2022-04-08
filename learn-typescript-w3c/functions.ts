
function printhello(): void {
    console.log("hello")
}

console.log(printhello())

function multiply(a: number, b: number) {
    return a * b
}

console.log(multiply(2, 4))

function add(a: number, b: number, c?: number) {
    return a + b + (c || 0)
}

console.log(add(20, 22))
console.log(add(2, 4, 5))

function pow(value: number, expoent: number = 10) {
    return value ** expoent
}

console.log(pow(123))

// named parameters
function divide({dividend, divisor}: {dividend: number, divisor: number}) {
    return dividend / divisor
}

console.log(divide({dividend: 1000, divisor: 123}))

// rest parameters
function add1(a: number, b: number, ...rest: number[]) {
    return a + b + rest.reduce((p, c) => p + c, 0)
}

console.log(add1(10, 10, 10, 10, 10, 10))

