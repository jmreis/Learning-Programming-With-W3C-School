package main

import "fmt"

/*
for index, value := array|slice|map {
   // code to be executed for each iteration
}
*/

func main() {
	fruits := [3]string{"apple", "orange", "banana"}
	for index, values := range fruits {
		fmt.Printf("%v\t%v\n", index, values)
	}
}
