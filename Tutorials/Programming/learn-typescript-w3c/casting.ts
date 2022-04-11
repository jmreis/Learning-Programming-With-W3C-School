
let x: unknown = 'hello'
console.log((x as string).length)

let y: unknown = 'hello'
console.log((<string>x).length)

// let z = 'hello'
// console.log(((x as unknown) as number).length)