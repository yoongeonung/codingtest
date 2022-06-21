package q1001

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

func Q1001() {
	reader := bufio.NewReader(os.Stdin)
	line, _, err := reader.ReadLine()
	if hasErr(err) {
		return
	}
	inputStr := string(line)
	splitedStrs := strings.Split(inputStr, " ")
	fstNum, err := strconv.Atoi(splitedStrs[0])
	if hasErr(err) {
		return
	}
	secNum, err := strconv.Atoi(splitedStrs[1])
	if hasErr(err) {
		return
	}
	minus(fstNum, secNum)
}

func minus(f, s int) {
	fmt.Println(f - s)
}

func hasErr(err error) bool {
	return err != nil
}
