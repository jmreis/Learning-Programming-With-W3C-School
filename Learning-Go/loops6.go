package main

import "fmt"

/*
Tip: To only show the value or the index, you
can omit the other output using an underscore (_).
*/

func main() {
	fruits := [3]string{"apple", "orange", "banana"}

	// value
	for _, value := range fruits {
		fmt.Printf("%v\n", value)
	}

	// index
	for index, _ := range fruits {
		fmt.Printf("%v\n", index)
	}
}
