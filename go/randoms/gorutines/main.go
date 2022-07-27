package main

import "fmt"

func main() {

	channel := make(chan string)

	go func (channel chan string)  {
		for{
			var name string
			fmt.Scanln(&name)
			channel <- name
		}
	}(channel)

	go fmt.Print("hola como estas \n")
	
	msg := <- channel

	fmt.Print(msg)
}