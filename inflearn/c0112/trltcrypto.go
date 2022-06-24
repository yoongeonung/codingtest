package c0112

import (
	"fmt"
	"strconv"
	"strings"
)

func TranslateCryptogram() {
	var result []string
	result = convertCryptoToBinary(result)
	translateBinaryToStr(result)
}

func translateBinaryToStr(result []string) {
	for i := 0; i < len(result); i++ {
		parseInt, _ := strconv.ParseInt(result[i], 2, 32)
		fmt.Print(string(rune(parseInt)))
	}
}

func convertCryptoToBinary(result []string) []string {
	var num int
	var crypto string
	// TODO 나중에 제네릭 배우면 제네릭을 사용해서 리팩토링 할것.
	fmt.Scan(&num)
	fmt.Scan(&crypto)
	for i, n := 0, 0; i < num; i, n = i+1, n+7 {
		replace := replaceAllRunes(crypto, n)
		result = append(result, replace)
	}
	return result
}

func replaceAllRunes(crypto string, n int) string {
	return strings.ReplaceAll(strings.ReplaceAll(crypto[n:n+7], "#", "1"), "*", "0")
}
