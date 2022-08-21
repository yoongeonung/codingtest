package q01

import (
	"github.com/stretchr/testify/assert"
	"testing"
)

func TestFindChar(t *testing.T) {
	assert.Equal(t, findChar("Computercooler", 'c'), 2)
	assert.Equal(t, findChar("Computercooler", 'd'), 0)
}
