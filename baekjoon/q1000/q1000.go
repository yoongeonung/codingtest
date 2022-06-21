package q1000

import (
	"fmt"
	"strconv"
)

func Q1000() {
	firstval := ""
	secdval := ""

	_, err := fmt.Scanln(&firstval, &secdval)
	if err != nil {
		return
	}
	num1, _ := strconv.Atoi(firstval)
	num2, _ := strconv.Atoi(secdval)
	resultSum := sum(num1, num2)
	fmt.Println(resultSum)
}

func sum(f, s int) int {
	return f + s
}
