package q10998

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

func Q10998() {
	reader := bufio.NewReader(os.Stdin)
	line, _, err := reader.ReadLine()
	ifHasErr(err)
	stringArr := string(line)
	splitedStrArr := strings.Split(stringArr, " ")
	fstNum, err := strconv.Atoi(splitedStrArr[0])
	ifHasErr(err)
	sndNum, err := strconv.Atoi(splitedStrArr[1])
	ifHasErr(err)

	multiply(fstNum, sndNum)
}

func multiply(fstNum, sndNum int) {
	fmt.Println(fstNum * sndNum)
}

func ifHasErr(err error) {
	if err != nil {
		fmt.Println(err.Error())
	}
}
