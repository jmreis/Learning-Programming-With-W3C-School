interface Point {
    x: number,
    y: number
}

let pointPart: Partial<Point> = {} // Partial
pointPart.x = 10
console.log(pointPart.x)

interface Car {
    make: string,
    model: string,
    mileage?: number
}

let mycar: Required<Car> = {
    make: 'Ford',
    model: 'Focus',
    mileage: 12000
}

console.log(mycar)

const nameAgeMap: Record<string, number> = {
    'alice': 21,
    'bob': 25
}

console.log(nameAgeMap)

interface Person {
    name: string,
    age: number,
    location?: string
}

const bob: Omit<Person, 'age' | 'location'> = {
    name: 'bob'
}

console.log(bob)

const bob1: Pick<Person, 'name'> = {
    name: 'bob'
}
console.log(bob1)

type Primitive = string | number | boolean
const value: Exclude<Primitive, string> = true
console.log(value)

type pointgenerator = () => { x: number; y: number; }
const point: ReturnType<pointgenerator> = {
    x: 10,
    y: 20
}

console.log(point)

type PointPrinter = (p: {x: number; y: number; }) => void
const point1: Parameters<PointPrinter>[0] = {
    x: 10,
    y: 20
}

console.log(point1)
