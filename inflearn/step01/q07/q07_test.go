package q07

import (
	"github.com/stretchr/testify/assert"
	"testing"
)

func TestPalindrome(t *testing.T) {
	assert.Equal(t, "YES", Palindrome("gooG"))
	assert.Equal(t, "YES", Palindrome("skSKskuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuKSksks"))
	assert.Equal(t, "NO", Palindrome("kstudkgksjlkgjlksjdggkkllllllllllllllllllllllsjgksjldgjlllllllllllllllgjks"))
	assert.Equal(t, "YES", Palindrome("tttttttttttttt"))
}
