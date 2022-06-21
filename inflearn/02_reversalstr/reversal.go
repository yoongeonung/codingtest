package _2_reversalstr

import (
	"fmt"
	"strings"
)

func ReversalStr() {
	inputStr := ""
	outputStr := ""
	_, err := fmt.Scanln(&inputStr)
	if err != nil {
		return
	}

	for _, chr := range inputStr {
		// upper
		if isUpperCase(chr) {
			outputStr += strings.ToLower(string(chr))
			// lower
		} else {
			outputStr += strings.ToUpper(string(chr))
		}
	}
	fmt.Println(outputStr)
}

func isUpperCase(chr int32) bool {
	return chr >= 65 && chr <= 90
}
