package q04

import (
	"github.com/stretchr/testify/assert"
	"testing"
)

/**
N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
*/

func TestReversalStrings(t *testing.T) {
	assert.Equal(t, "doog", reversalStrings("good"))
	assert.Equal(t, "emiT", reversalStrings("Time"))
	assert.Equal(t, "giB", reversalStrings("Big"))
	assert.Equal(t, "gsHJKHJKHJKHJKHJKHJKHJKGHBNkd", reversalStrings("dkNBHGKJHKJHKJHKJHKJHKJHKJHsg"))
	assert.Equal(t, "gsjglkjd", reversalStrings("djklgjsg"))
	assert.Equal(t, "hskldjlkjklgjks", reversalStrings("skjglkjkljdlksh"))
}
