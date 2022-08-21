package q01

import (
	"strings"
)

func findChar(chars string, char rune) int {
	totalCount := 0
	for i := 0; i < len(chars); i++ {
		if strings.ToUpper(string(chars[i])) == strings.ToUpper(string(char)) {
			totalCount++
		}
	}
	return totalCount
}
