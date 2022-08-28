package q09

import (
	"regexp"
	"strconv"
)

func ExtractNumber(chars string) int {
	regexNum := regexp.MustCompile("\\D")
	replacedStr := regexNum.ReplaceAllString(chars, "")
	covertNum, err := strconv.Atoi(replacedStr)
	if err != nil {
		return 0
	}
	return covertNum
}
