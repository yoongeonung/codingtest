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
	-> 5
	100
	56 32 76 17 30 44 34 9 72 52 79 30 21 10 77 44 3 64 93 21 50 54 65 22 47 82 17 51 43 93 51 98 40 12 88 100 96 53 80 18 23 78 95 49 71 10 81 1 30 11 95 87 3 60 15 5 60 68 10 10 28 51 55 70 11 36 43 59 46 74 67 37 48 86 66 79 73 24 40 90 75 2 89 45 2 19 94 94 40 20 44 16 37 8 38 62 79 55 10 78
	-> 6
*/

// TODO 로직에 버그있음 다시 짤것.

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
