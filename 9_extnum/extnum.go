package __extnum

import (
	"bufio"
	"fmt"
	"os"
	"regexp"
	"strconv"
)

func ExtractNum() {
	reader := bufio.NewReader(os.Stdin)
	line, _, err := reader.ReadLine()
	if err != nil {
		return
	}
	re := regexp.MustCompile("[a-z,A-Z]")
	num, err := strconv.Atoi(re.ReplaceAllString(string(line), ""))
	if err != nil {
		return
	}
	fmt.Println(num)
}
