package main

import "fmt"

/*
func FunctionName(param1 type, param2 type) type {
  // code to be executed
  return output
}
*/

func myFuntion(x int, y int) int {
	return x + y
}

func myFuntion1(x int, y int) (result int) {
	// Named return
	result = x + y
	// return result
	// or
	return
}

func main() {
	fmt.Println(myFuntion(1, 2))
	fmt.Println(myFuntion1(10, 123))

	// Store return in a variable
	total := myFuntion1(123, 456)
	fmt.Println(total)
}
