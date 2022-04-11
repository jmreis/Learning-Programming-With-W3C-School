
interface Person {
    name: string,
    age: number
}

function personproperty(person: Person, property: keyof Person) {
    console.log(`${property} - ${person[property]}`)
}

let person = {
    name: "Max",
    age: 27
}

personproperty(person, "name")