package q05

import (
	"github.com/stretchr/testify/assert"
	"testing"
)

/**
input: kdj#@kdjg%$#kdjgk@kd$dk
output: kdd#@kkgj%$#dkgjd@kj$dk

영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.

*/
func TestReverseSpecificChar(t *testing.T) {
	assert.Equal(t, "S#T!EG*b@a", reverseSpecificChar("a#b!GE*T@S"))
	assert.Equal(t, "kdd#@kkgj%$#dkgjd@kj$dk", reverseSpecificChar("kdj#@kdjg%$#kdjgk@kd$dk"))
	assert.Equal(t, "kGQ!SHDSGDd#@dk#k%$#gjd&&kg@dk$j#%&dSG@!SGDQqk", reverseSpecificChar("kqQ!DGSGSdj#@kd#g%$#kdj&&gk@kd$d#%&DGS@!DHSQGk"))
}
