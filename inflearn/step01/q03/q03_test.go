package q03

import (
	"github.com/stretchr/testify/assert"
	"testing"
)

/**
한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요. 문장속의 각 단어는 공백으로 구분됩니다.
*/

func TestFindLongestString(t *testing.T) {
	assert.Equal(t, "study", FindLongestString("it is time to study"))
	assert.Equal(t, "LKKJLJLJLKJLLLLLLL", FindLongestString("dkjg LKKL KJkjglkd Kjgkd LKKJLJLJLKJLLLLLLL"))
	assert.Equal(t, "loveispower", FindLongestString("loveispower"))
}
