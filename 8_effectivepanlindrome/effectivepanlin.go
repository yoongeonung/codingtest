package __effectivepanlindrome

import (
	"bufio"
	"fmt"
	"os"
	"regexp"
	"strings"
)

func EffectivePanlindrome() {
	reader := bufio.NewReader(os.Stdin)
	line, _, err := reader.ReadLine()
	if err != nil {
		return
	}
	re := regexp.MustCompile("[^A-Z]")
	replacedAllString := re.ReplaceAllString(strings.ToUpper(string(line)), "")
	runes := []rune(replacedAllString)
	for i, j := 0, len(runes)-1; i < j; i, j = i+1, j-1 {
		runes[i], runes[j] = runes[j], runes[i]
	}
	reversedStr := string(runes)
	if reversedStr != replacedAllString {
		fmt.Println("NO")
		return
	}
	fmt.Println("YES")
}
