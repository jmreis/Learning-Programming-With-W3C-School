package main

import (
	"fmt"
)

func main() {
	var i = 3.141

	//Float formating
	fmt.Printf("%e\n", i)
	fmt.Printf("%f\n", i)
	fmt.Printf("%.2f\n", i)
	fmt.Printf("%6.2f\n", i)
	fmt.Printf("%g\n", i)
}
