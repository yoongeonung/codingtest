package q08

import (
	"regexp"
	"strings"
)

func EffectivePanlin(chars string) string {
	re := regexp.MustCompile("[^A-Z]")
	replacedStr := re.ReplaceAllString(strings.ToUpper(chars), "")
	reversedRunes := []rune(replacedStr)
	for i, j := 0, len(reversedRunes)-1; i < j; i, j = i+1, j-1 {
		reversedRunes[i], reversedRunes[j] = reversedRunes[j], reversedRunes[i]
	}
	if replacedStr == string(reversedRunes) {
		return "YES"
	}
	return "NO"
}
