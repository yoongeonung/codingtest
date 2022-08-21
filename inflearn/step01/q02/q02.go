package q02

import "strings"

func caseConversion(chars string) string {
	convertedString := ""
	for i := 0; i < len(chars); i++ {
		if isUppercase(chars, i) {
			convertedString += strings.ToLower(string(chars[i]))
		} else {
			convertedString += strings.ToUpper(string(chars[i]))
		}
	}
	return convertedString
}

func isUppercase(chars string, i int) bool {
	return chars[i] >= 65 && chars[i] <= 90
}
