package q08

import (
	"github.com/stretchr/testify/assert"
	"testing"
)

func TestEffectivePanlin(t *testing.T) {
	assert.Equal(t, "YES", EffectivePanlin("found7, time: study; Yduts; emit, 7Dnuof"))
	assert.Equal(t, "NO", EffectivePanlin("found7, timk: study; Yduts; emit, 7Dnuof"))
	assert.Equal(t, "YES", EffectivePanlin("Tae,aba;e#%a*T"))
}
