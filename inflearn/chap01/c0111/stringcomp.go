package c0111

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
)

func StringComp() {
	reader := bufio.NewReader(os.Stdin)
	line, _, err := reader.ReadLine()
	if hasErr(err) {
		fmt.Println(err)
	}
	str := string(line)
	str += " "
	runes := []rune(str)
	count := 1
	result := ""
	for i := 0; i < len(runes)-1; i++ {
		if runes[i] == runes[i+1] {
			count++
		} else {
			result += string(runes[i])
			if count > 1 {
				result += strconv.Itoa(count)
			}
			count = 1
		}
	}
	fmt.Println(result)
}

func hasErr(err error) bool {
	return err != nil
}
