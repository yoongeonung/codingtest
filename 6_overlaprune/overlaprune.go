package __overlaprune

import (
	"bufio"
	"fmt"
	"os"
	"strings"
)

func OverlapRune() {
	reader := bufio.NewReader(os.Stdin)
	line, _, err := reader.ReadLine()
	if hasErr(err) {
		return
	}
	runes := []rune(string(line))
	str := ""
	for i := 0; i < len(runes); i++ {
		index := strings.IndexRune(string(runes), runes[i])
		if index == i {
			str += string(runes[i])
		}
	}
	fmt.Println(str)
}

func hasErr(err error) bool {
	return err != nil
}
