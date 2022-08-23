package q06

import (
	"github.com/stretchr/testify/assert"
	"testing"
)

/**
소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
*/

func TestOverlapRune(t *testing.T) {
	assert.Equal(t, "kset", OverlapRune("ksekkset"))
	assert.Equal(t, "eiotuwy", OverlapRune("eiotuoiwtitoiywiotieoiutoiwioweuotiuwoieut"))
	assert.Equal(t, "qiutowpy", OverlapRune("qiutoiwuotiqpituoiwuiotuowutowiutoityioqp"))
	assert.Equal(t, "kdgsjla", OverlapRune("kdkgksjgkjlsjgkjsljgkjaksjg"))
}
