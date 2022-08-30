package q10

import (
	"github.com/stretchr/testify/assert"
	"testing"
)

/**
한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출 력하는 프로그램을 작성하세요.
*/

func TestDistanceRune(t *testing.T) {
	assert.Equal(t, "1 0 1 2 1 0 1 2 2 1 0", DistanceRune("teachermode e"))
	assert.Equal(t, "0 1 2 3 3 2 1 0 1 2 3 4 5 6 5 4 3 2 1 0 1 2 3 2 1 0 1 2", DistanceRune("fkdgkjdflkgjljslgjkfldjlkfdg f"))
	assert.Equal(t, "0 1 2 3 2 1 0", DistanceRune("timeout t"))
}
