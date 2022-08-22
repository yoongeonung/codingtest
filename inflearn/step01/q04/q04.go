package q04

func reversalStrings(chars string) string {
	reversedChars := ""
	for i := len(chars) - 1; i >= 0; i-- {
		reversedChars += string(chars[i])
	}
	return reversedChars
}
