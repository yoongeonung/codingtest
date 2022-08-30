package q10

import (
	"math"
	"strconv"
	"strings"
)

func DistanceRune(chars string) string {
	splitedChars := strings.Split(chars, " ")
	givenWords := splitedChars[0]
	targetWord := splitedChars[1]
	count := 0
	answer := make([]string, len(givenWords))
	for i := 0; i < len(givenWords); i++ {
		if string(givenWords[i]) == targetWord {
			count = 0
			answer[i] = strconv.Itoa(count)
		} else {
			count++
			answer[i] = strconv.Itoa(count)
		}
	}

	for i := len(givenWords) - 1; i >= 0; i-- {
		if string(givenWords[i]) == targetWord {
			count = 0
			answer[i] = strconv.Itoa(count)
		} else {
			count++
			convertedAnswer, _ := strconv.Atoi(answer[i])
			answer[i] = strconv.Itoa(int(math.Min(float64(count), float64(convertedAnswer))))
		}
	}

	return strings.Join(answer, " ")
}
