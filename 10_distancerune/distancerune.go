package _0_distancerune

import (
	"bufio"
	"fmt"
	"math"
	"os"
	"strings"
)

// teachermode e
func DistanceRune() {
	reader := bufio.NewReader(os.Stdin)
	line, _, err := reader.ReadLine()
	if hasErr(err) {
		return
	}
	splitedStrs := strings.Split(string(line), " ")
	givenWords := splitedStrs[0]
	targetWord := splitedStrs[1]
	count := 1000
	answer := make([]int, len(givenWords))
	for i := 0; i < len(givenWords); i++ {
		if string(givenWords[i]) == targetWord {
			count = 0
			answer[i] = count
		} else {
			count++
			answer[i] = count
		}
	}

	count = 1000
	for i := len(givenWords) - 1; i >= 0; i-- {
		if string(givenWords[i]) == targetWord {
			count = 0
			answer[i] = count
		} else {
			count++
			answer[i] = int(math.Min(float64(answer[i]), float64(count)))
		}
	}
	fmt.Println(answer)
}

func hasErr(err error) bool {
	return err != nil
}
