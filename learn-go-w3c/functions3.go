package main

import "fmt"

func myFunction(x int, y string) (result int, txt1 string) {
	result = x + x
	txt1 = y + " World!"
	return
}

func main() {
	fmt.Println(myFunction(5, "Hello"))

	// store in 2 variable
	a, b := myFunction(10, "Hello")
	fmt.Println(a, b)

	// omited return values
	c, _ := myFunction(50, "Hello")
	fmt.Println(c)

	_, d := myFunction(60, "Hello")
	fmt.Println(d)
}
