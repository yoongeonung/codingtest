package q10869

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

func Q10869() {
	reader := bufio.NewReader(os.Stdin)
	line, _, err := reader.ReadLine()
	if hasErr(err) {
		return
	}
	splitedStrs := strings.Split(string(line), " ")
	fstNum, err := strconv.Atoi(splitedStrs[0])
	if hasErr(err) {
		return
	}
	sndNum, err := strconv.Atoi(splitedStrs[1])
	if hasErr(err) {
		return
	}

	sum(fstNum, sndNum)
	minus(fstNum, sndNum)
	multply(fstNum, sndNum)
	divide(fstNum, sndNum)
	rest(fstNum, sndNum)
}

func rest(fstNum int, sndNum int) {
	fmt.Println(fstNum % sndNum)
}

func divide(fstNum int, sndNum int) {
	fmt.Println(fstNum / sndNum)
}

func multply(fstNum int, sndNum int) {
	fmt.Println(fstNum * sndNum)
}

func minus(fstNum int, sndNum int) {
	fmt.Println(fstNum - sndNum)
}

func sum(fstNum int, sndNum int) {
	fmt.Println(fstNum + sndNum)
}

func hasErr(err error) bool {
	return err != nil
}
