package __findchar

import (
	"fmt"
	"strings"
)

var str string = ""
var theChar string = ""
var count int = 0

func FindChar() {
	_, err := fmt.Scanln(&str, &theChar)
	if err != nil {
		return
	}
	upperedStr := strings.ToUpper(str)
	upperedTheChar := strings.ToUpper(theChar)
	for _, ch := range upperedStr {
		if upperedTheChar == string(ch) {
			count++
		}
	}
	fmt.Println(count)
}
