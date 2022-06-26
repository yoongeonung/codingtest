package ch0201

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

func PrintBiggerNum() {
	var count int
	fmt.Scanln(&count)
	fmt.Println(count)
	reader := bufio.NewReader(os.Stdin)
	line, _, err := reader.ReadLine()
	if hasErr(err) {
		return
	}
	splitedStr := strings.Split(string(line), " ")
	ints := make([]int, count)
	fstNum, _ := strconv.Atoi(splitedStr[0])
	ints = append(ints, fstNum)
	for i := 1; i < len(splitedStr); i++ {
		num, _ := strconv.Atoi(splitedStr[i])
		if prevNum, _ := strconv.Atoi(splitedStr[i-1]); num > prevNum {
			ints = append(ints, num)
		}
	}
	for i, v := range ints {
		fmt.Println(i, v)
	}
}

func hasErr(err error) bool {
	return err != nil
}
