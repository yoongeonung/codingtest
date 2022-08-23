package q06

import "strings"

//ksekkset
func OverlapRune(chars string) string {

	noOverlapedStr := ""
	for i := 0; i < len(chars); i++ {
		pointedRune := string(chars[i])
		index := strings.Index(chars, pointedRune)
		if index == i {
			noOverlapedStr += pointedRune
		}
	}

	return noOverlapedStr
}
