package ch0202

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

/*
	8
	130 135 148 140 145 150 150 153
*/
func SeeableStudent() {
	var num int
	var count int

	fmt.Scanln(&num)
	reader := bufio.NewReader(os.Stdin)
	line, _, err := reader.ReadLine()
	if hasErr(err) {
		return
	}
	heights := strings.Split(string(line), " ")
	for i := 0; i < len(heights)-1; i++ {
		if evaluateNum(heights, i) {
			count++
		}
	}
	fmt.Println(count)
}

func evaluateNum(heights []string, i int) bool {
	num1, _ := strconv.Atoi(heights[i])
	num2, _ := strconv.Atoi(heights[i+1])
	if num1 < num2 {
		return true
	}
	return false
}

func hasErr(err error) bool {
	return err != nil
}
