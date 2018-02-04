package devops.numbers;

/*
 * The NumberWords returns an integer value from 1 to 999 in text.
 * 1 returns "one"
 * 234  "returns two hundred thirty four"
 * 
 * A number out of range returns a message stating try againt with the accpetable range.
 * 
 * @author stephen_mancino
 */

public class NumberWords {
	
	private String returnValue = "";

	public String toWords( int number ) {
		
		if (number == 0) {
			returnValue = "exit";
			
		}
		
		if (number > 999 || number < 0 ) {
			returnValue = "number out of range";
		}
		else {
			returnValue = String.valueOf(number);
		}
		
		
		
		
		
		
		
		return returnValue ;
	}

}
