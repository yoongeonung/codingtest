package __palindrome

import (
	"bufio"
	"fmt"
	"os"
	"strings"
)

func Palindrome() {
	reader := bufio.NewReader(os.Stdin)
	line, _, err := reader.ReadLine()
	if err != nil {
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
