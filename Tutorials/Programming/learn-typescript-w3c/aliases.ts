type caryear = number
type cartype = string
type carmodel = string

type Car = {
    year: caryear,
    type: cartype,
    model: carmodel
}

const Caryear: caryear = 2001
const Cartype: cartype = "toyota"
const Carmodel: carmodel = "corola"

const car: Car = {
    year: Caryear,
    type: Cartype,
    model: Carmodel
}

console.log(car)