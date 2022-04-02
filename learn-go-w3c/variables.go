package main

import (
	"fmt"
)

func main() {
	var student1 string = "John" // string type
	var student2 = "Jane"        // infered type
	x := 2                       // infered type

	// Writing variables
	fmt.Println(student1)
	fmt.Println(student2)
	fmt.Println(x)
}
