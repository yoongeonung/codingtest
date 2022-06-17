package __reverserune

import (
	"bufio"
	"fmt"
	"os"
	"regexp"
)

func isErr(err error) bool {
	return err != nil
}

func ReverseRune() {
	reader := bufio.NewReader(os.Stdin)
	line, _, err := reader.ReadLine()
	if isErr(err) {
		return
	}
	runes := []rune(string(line))
	leftPointer := 0
	rightPointer := len(runes) - 1
	for leftPointer < rightPointer {
		if matched, _ := isSpecialRune(runes, leftPointer); matched {
			leftPointer++
		} else if matched, _ := isSpecialRune(runes, rightPointer); matched {
			rightPointer--
		} else {
			reverseARune(runes, leftPointer, rightPointer)
			leftPointer++
			rightPointer--
		}
	}
	fmt.Println(string(runes))
}

func reverseARune(runes []rune, leftPointer int, rightPointer int) {
	runes[leftPointer], runes[rightPointer] = runes[rightPointer], runes[leftPointer]
}

func isSpecialRune(runes []rune, pointer int) (bool, error) {
	return regexp.MatchString("[^A-Z,^a-z]", string(runes[pointer]))
}
