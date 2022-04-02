package main

import "fmt"

/*
func FunctionName(param1 type, param2 type, param3 type) {
  // code to be executed
}
*/

func familyName(name string, age int) {
	fmt.Println("Hello", age, "year old", name, "Refsnes")
}

func main() {
	familyName("Liam", 3)
	familyName("Jenny", 14)
	familyName("Anja", 30)
}
