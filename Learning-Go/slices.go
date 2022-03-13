package main
import ("fmt")

func main() {
	myslice := []int{}
	fmt.Println(len(myslice))
	fmt.Println(cap(myslice))
	fmt.Println(myslice)

	myslice1 := []string{"Go", "Slices", "Are", "Powerfull"}
	fmt.Println(len(myslice1))
	fmt.Println(cap(myslice1))
	fmt.Println(myslice1)
}
