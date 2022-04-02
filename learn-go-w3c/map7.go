package main

import "fmt"

func main() {
	a := map[string]int{"one" : 1, "two" : 2, "three" : 3}
	
	var b = []string	// defining the order
	b = append(b, "one", "two", "three")

	for k, v := range a {
		fmt.Printf("%v : %v, ", k, v)
	}

	fmt.Println()

	for _, element := range b {
		fmt.Println("%v, %v, ", element, a[element])
	}
}