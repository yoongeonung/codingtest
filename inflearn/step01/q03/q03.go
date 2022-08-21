package q03

import "strings"

func FindLongestString(chars string) string {
	splitedChars := strings.Split(chars, " ")
	longestString := splitedChars[0]
	for i := 1; i < len(splitedChars); i++ {
		if len(splitedChars[i]) > len(longestString) {
			longestString = splitedChars[i]
		}
	}
	return longestString
}
