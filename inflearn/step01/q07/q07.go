package q07

import "strings"

func Palindrome(chars string) string {
	chars = strings.ToUpper(chars)
	leftPointer := 0
	rightPointer := len(chars) - 1
	for leftPointer < rightPointer {
		if chars[leftPointer] != chars[rightPointer] {
			return "NO"
		}
		leftPointer++
		rightPointer--
	}
	return "YES"
}
