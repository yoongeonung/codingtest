package q1000

import (
	"fmt"
	"strconv"
)

func Q1000() {
	firstval := ""
	secdval := ""

	_, err := fmt.Scanln(&firstval, &secdval)
	if hasErr(err) {
		return
	}
	num1, _ := strconv.Atoi(firstval)
	num2, _ := strconv.Atoi(secdval)
	sum(num1, num2)
}

func hasErr(err error) bool {
	return err != nil
}

func sum(f, s int) {
	fmt.Println(f + s)
}
