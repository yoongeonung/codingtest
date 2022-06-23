package q18108

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
)

const buddhaEra int = 543

func Q18108() {
	reader := bufio.NewReader(os.Stdin)
	line, _, err := reader.ReadLine()
	if hasErr(err) {
		return
	}

	buddistCal, err := strconv.Atoi(string(line))
	if hasErr(err) {
		return
	}
	fmt.Println(buddistCal - buddhaEra)
}

func hasErr(err error) bool {
	return err != nil
}
