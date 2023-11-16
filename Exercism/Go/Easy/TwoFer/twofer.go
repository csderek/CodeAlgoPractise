package main

import "fmt"

func main() {
	fmt.Println(ShareWith("Testting"))
	fmt.Println(ShareWith(""))
}

// ShareWith should have a comment documenting it.
func ShareWith(name string) string {
	msg := "One for %s, one for me."
	var result string

	if name != "" {
		result = fmt.Sprintf(msg, name)
	} else {
		result = fmt.Sprintf(msg, "you")
	}

	return result
}
