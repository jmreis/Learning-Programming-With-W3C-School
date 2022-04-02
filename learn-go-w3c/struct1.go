package main

import "fmt"

/*
type struct_name struct {
  member1 datatype;
  member2 datatype;
  member3 datatype;
  ...
}
*/

type Person struct {
	name   string
	age    int
	job    string
	salary int
}

func printPerson(pers Person) {
	fmt.Println("Name: ", pers.name)
	fmt.Println("Age: ", pers.age)
	fmt.Println("Job: ", pers.job)
	fmt.Println("Salary: ", pers.salary)
}

func main() {
	var pers1 Person
	var pers2 Person

	// Pers1 specification
	pers1.name = "Hege"
	pers1.age = 45
	pers1.job = "Teacher"
	pers1.salary = 6000

	// Pers2 specification
	pers2.name = "Cecilie"
	pers2.age = 24
	pers2.job = "Marketing"
	pers2.salary = 4500

	//Print pers1 info with a function
	printPerson(pers1)

	//Print pers2 info with a function
	printPerson(pers2)

}
