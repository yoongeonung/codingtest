package _1_findchar

import (
	"fmt"
	"strings"
)

func FindChar() {
	str := ""
	theChar := ""
	count := 0

	_, err := fmt.Scanln(&str, &theChar)
	if hasErr(err) {
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

func hasErr(err error) bool {
	return err != nil
}
