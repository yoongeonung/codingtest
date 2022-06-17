package __reversalstrs

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
)

func ReversalStrs() {
	reader := bufio.NewReader(os.Stdin)
	line, _, err := reader.ReadLine()
	if isErr(err) {
		return
	}
	count, _ := strconv.Atoi(string(line))
	stringsBox := make([]string, count)
	for i := 0; i < count; i++ {
		line, _, err := reader.ReadLine()
		if isErr(err) {
			return
		}
		strs := []rune(string(line))
		for i, j := 0, len(strs)-1; i < j; i, j = i+1, j-1 {
			strs[i], strs[j] = strs[j], strs[i]
		}
		stringsBox[i] = string(strs)
	}
	fmt.Println(stringsBox)
}

func isErr(err error) bool {
	return err != nil
}
