/*
	ISYS 320
	Name(s):
	Date: 
*/

/*
 Your expected results after the input is provided:
 
 1. -10, 5
 2. 9, 8
 3. -4, 4
 4. -30, 30
  It would not let me test to see if my results were correct. 
 */
public class P4_IfElseMystery {

	public static void main(String[] args) {
		ifElseMystery(3, 8);
	}
	
    public static void ifElseMystery(int a, int b) {
        if (a * 2 < b) {
            a = a * 3;
        } else if (a > b){
            b = b + 3;
        }
        if (b < a) {
            b++;
        } else {
            a--;
            System.out.println(a + " " + b);
        }
    }
}

