package main

import "fmt"

/*
var a map[KeyType]ValueType
*/

func main() {
	var a = make(map[string]string)
	var b map[string]string

	fmt.Println(a == nil)
	fmt.Println(b == nil)

}
