package _7_palindrome

import (
	"bufio"
	"fmt"
	"os"
	"strings"
)

func Palindrome() {
	reader := bufio.NewReader(os.Stdin)
	line, _, err := reader.ReadLine()
	if hasErr(err) {
		return
	}

	runes := []rune(strings.ToUpper(string(line)))
	leftPointer := 0
	rightPointer := len(runes) - 1

	for leftPointer < rightPointer {
		if strings.IndexRune(string(line), runes[leftPointer]) != strings.IndexRune(string(line), runes[rightPointer]) {
			fmt.Println("NO")
			return
		}
		leftPointer++
		rightPointer--
	}
	fmt.Println("OK")

}

func hasErr(err error) bool {
	return err != nil
}
