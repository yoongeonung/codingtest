package q09

import (
	"github.com/stretchr/testify/assert"
	"testing"
)

/**
문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만 듭니다.
만약 “tge0a1h205er”에서 숫자만 추출하면 0, 1, 2, 0, 5이고 이것을 자연수를 만들면 1205 이 됩니다.
추출하여 만들어지는 자연수는 100,000,000을 넘지 않습니다.
*/

func TestExtractNumber(t *testing.T) {
	assert.Equal(t, 1205, ExtractNumber("tge0a1h205er"))
	assert.Equal(t, 134520, ExtractNumber("Akdj0Gk1dgdgdAGSGAG3DGGA45GAGADGDGdjADG2SDGkdj0f"))
	assert.Equal(t, 208, ExtractNumber("g0en2T0s8eSoft"))
	assert.Equal(t, 120, ExtractNumber("Akdj0Gk1djADG2SDGkdj0f"))
}
