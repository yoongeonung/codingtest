package q10926

import (
	"bufio"
	"fmt"
	"os"
)

func Q10926() {
	reader := bufio.NewReader(os.Stdin)
	line, _, err := reader.ReadLine()
	if hasErr(err) {
		return
	}
	fmt.Println(string(line) + "??!")
}

func hasErr(err error) bool {
	if err != nil {
		return true
	}
	return false
}
