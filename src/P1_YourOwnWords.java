import java.util.Scanner;

/*
	ISYS 320
	Name(s):
	Date: 
*/

/*  EXAMPLE
-- Your conditional expression
x < y

-- Your test values for x, y, z and do you expect true or false?
1, 2, 0 -> TRUE
2, 1, 0 -> FALSE
*/

/* 1. 
-- Your conditional expression
y > 0

-- Your test values for x, y, z and do you expect true or false?
0, 1, 0 -> True
0, -3, 0 -> False
*/

/* 2. 
-- Your conditional expression

x != 0

-- Your test values for x, y, z and do you expect true or false?
1, 0, 0 -> True
0, 0, 0 -> False
*/

/* 3.  
-- Your conditional expression


-- Your test values for x, y, z and do you expect true or false?

*/

/* 4.  
-- Your conditional expression

y >= z + x
-- Your test values for x, y, z and do you expect true or false?
4, 2, 2 -> True
3, 5, 7 -> False
*/

public class P1_YourOwnWords {

	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		
		System.out.println(4 + " " + 2 + " "+ 2);
		double x = input.nextDouble();
		double y = input.nextDouble();
		double z = input.nextDouble();
		
		// Replace the conditional test, x < y below with your conditional expression to verify it is correct
		// using your test values
		if(y >= z + x ) {
			System.out.println("The test was TRUE");
		} else {
			System.out.println("The test was FALSE");
		}

	}

}
