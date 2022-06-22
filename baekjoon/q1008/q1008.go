package q1008

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

func Q1008() {
	reader := bufio.NewReader(os.Stdin)
	line, _, err := reader.ReadLine()
	if hasErr(err) {
		return
	}

	splitedStrs := strings.Split(string(line), " ")
	fstNum, err := strconv.ParseFloat(splitedStrs[0], 64)
	if hasErr(err) {
		return
	}
	sndNum, err := strconv.ParseFloat(splitedStrs[1], 64)
	if hasErr(err) {
		return
	}

	divide(fstNum, sndNum)

}

func divide(fstNum, sndNum float64) {
	fmt.Println(fstNum / sndNum)
}

func hasErr(err error) bool {
	return err != nil
}
