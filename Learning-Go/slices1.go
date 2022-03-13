package main
import ("fmt")

/*
var myarray = [length]datatype{values} // An array
myslice := myarray[start:end] // A slice made from the array
*/

func main() {
	arr1 := [6]int{10,11,12,13,14,15}
	myslice := arr1[2:4]

	fmt.Printf("myslice = %v\n", myslice)
	fmt.Printf("length = %d\n", len(myslice))
	fmt.Printf("capacity = %d\n", cap(myslice))
}
