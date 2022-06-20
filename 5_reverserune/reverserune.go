package __reverserune

import (
	"bufio"
	"fmt"
	"os"
	"regexp"
)

func ReverseRune() {
	reader := bufio.NewReader(os.Stdin)
	line, _, err := reader.ReadLine()
	if hasErr(err) {
		return
	}
	runes := []rune(string(line))
	leftPointer := 0
	rightPointer := len(runes) - 1
	for leftPointer < rightPointer {
		if isSpecialRune(runes, leftPointer) {
			leftPointer++
		} else if isSpecialRune(runes, rightPointer) {
			rightPointer--
		} else {
			convertRune(runes, leftPointer, rightPointer)
			leftPointer++
			rightPointer--
		}
	}
	fmt.Println(string(runes))
}

func hasErr(err error) bool {
	return err != nil
}

func convertRune(runes []rune, leftPointer int, rightPointer int) {
	runes[leftPointer], runes[rightPointer] = runes[rightPointer], runes[leftPointer]
}

func isSpecialRune(runes []rune, pointer int) bool {
	matched, err := regexp.MatchString("[^A-Z,^a-z]", string(runes[pointer]))
	if err != nil {
		return false
	}
	return matched
}
