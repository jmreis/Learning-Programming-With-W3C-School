package main

import "fmt"

func main() {
	var a = make(map[string]string)
	a["brand"] = "Ford"
	a["model"] = "Mustang"
	a["year"] = "1964"

	fmt.Printf(a["brand"])
	fmt.Println(a)

	delete(a, "year")

	fmt.Println(a)
}
