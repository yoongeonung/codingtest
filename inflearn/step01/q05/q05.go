package q05

import (
	"regexp"
)

var leftPointer int
var rightPointer int
var runes []rune

func reverseSpecificChar(chars string) string {
	leftPointer = 0
	rightPointer = len(chars) - 1
	runes = []rune(chars)
	for leftPointer < rightPointer {
		if isSpecialRune(leftPointer) {
			leftPointer++
		} else if isSpecialRune(rightPointer) {
			rightPointer--
		} else {
			convertRune()
			leftPointer++
			rightPointer--
		}

	}
	return string(runes)
}

func convertRune() {
	runes[leftPointer], runes[rightPointer] = runes[rightPointer], runes[leftPointer]
}

func isSpecialRune(pointer int) bool {
	matched, err := regexp.MatchString("[^A-Z, ^a-z]", string(runes[pointer]))
	if err != nil {
		return false
	}
	return matched
}
