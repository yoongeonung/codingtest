package q10172

import "fmt"

func Q10172() {
	dogArr := []string{"|\\_/|", "|q p|   /}", "( 0 )\"\"\"\\", "|\"^\"`    |", "||_/=\\\\__|"}
	for _, dog := range dogArr {
		fmt.Println(dog)
	}
}
