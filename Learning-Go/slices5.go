package main

import "fmt"

func main() {
	arr1 := [6]int{9, 10, 11, 12, 13, 14} // An Array
	myslice1 := arr1[1:5]                 // slice array
	fmt.Printf("myslice1 = %v\n", myslice1)
	fmt.Printf("length = %d\n", len(myslice1))
	fmt.Printf("capacity %d\n", cap(myslice1))

	myslice1 = arr1[1:3] // change len by re-slice
	fmt.Printf("myslice1 = %v\n", myslice1)
	fmt.Printf("length = %d\n", len(myslice1))
	fmt.Printf("capacity = %d\n", cap(myslice1))

	myslice1 = append(myslice1, 20, 21, 22, 23) // change len by append
	fmt.Printf("myslice = %v\n", myslice1)
	fmt.Printf("length = %d\n", len(myslice1))
	fmt.Printf("capacity = %d\n", cap(myslice1))

}
