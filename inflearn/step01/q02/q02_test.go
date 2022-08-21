package q02

import (
	"github.com/stretchr/testify/assert"
	"testing"
)

// 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.

func TestCaseConversion(t *testing.T) {
	assert.Equal(t, "sTUdy", caseConversion("StuDY"))
	assert.Equal(t, "DKFhhlKDJLGkhl", caseConversion("dkfHHLkdjlgKHL"))
	assert.Equal(t, "DJKJGkluoihKJhgyHuyfuygJguyguyFufuguGUyurRuhguyuGUok", caseConversion("djkjgKLUOIHkjHGYhUYFUYGjGUYGUYfUFUGUguYURrUHGUYUguOK"))
}
