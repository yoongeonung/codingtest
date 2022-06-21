package _9_extnum

import (
	"bufio"
	"fmt"
	"os"
	"regexp"
	"strconv"
)

func ExtractNum() {
	reader := bufio.NewReader(os.Stdin)
	line, _, err := reader.ReadLine()
	if hasErr(err) {
		return
	}
	num, err := extractNumFromStr(line)
	if hasErr(err) {
		return
	}
	fmt.Println(num)
}

func extractNumFromStr(line []byte) (int, error) {
	re := regexp.MustCompile("[a-z,A-Z]")
	num, err := strconv.Atoi(re.ReplaceAllString(string(line), ""))
	return num, err
}

func hasErr(err error) bool {
	if err != nil {
		return true
	}
	return false
}
