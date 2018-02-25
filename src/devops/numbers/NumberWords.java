package devops.numbers;

/*
 * The NumberWords returns an integer value from 1 to 999 in text.
 * 1 returns "one"
 * 234  "returns two hundred thirty four"
 * 
 * A number out of range returns a message stating try again with the acceptable range.
 * 
 * @author stephen_mancino
 */

public class NumberWords {

    private String returnValue = "";


 	public String toWords( int number ) {
		
		if (number == 0) {
	        
			returnValue = "exit";
		}
			
			else if((number > 999 || number < 0 )) {
				returnValue = "number out of range";
		}
			
			else if((number >= 10 && number < 20 ) || (number > 110 && number < 120)) {
				returnValue = toTeens(number);
		}
			else {
				
				returnValue = toNonTeens(number);
		}
			
		return returnValue;
	
	}

	
	private final String toTeens( int teenNumber ) {
		  String teensValue = "";
		 
		
					switch(teenNumber) {
					
					case 10: teensValue = "ten";
						break;
					
					case 11: teensValue = "eleven";
						break;
					case 12: teensValue = "twelve";
						break;
					case 13: teensValue = "thirteen";
					    break;
					case 14: teensValue = "fourteen";
						break;
					case 15: teensValue = "fifteen";
						break;
					case 16: teensValue = "sixteen";
						break;
					case 17: teensValue = "seventeen";
						break;
					case 18: teensValue = "eighteen";
						break;
					case 19: teensValue = "nineteen";
						break;		
					case 111: teensValue = "one hundred-eleven";
						break;
					case 112: teensValue = "one hundred-twelve";
						break;
					case 113: teensValue = "one hundred-thirteen";
					    break;
					case 114: teensValue = "one hundred-fourteen";
						break;
					case 115: teensValue = "one hundred-fifteen";
						break;
					case 116: teensValue = "one hundred-sixteen";
						break;
					case 117: teensValue = "one hundred-seventeen";
						break;
					case 118: teensValue = "one hundred-eighteen";
						break;
					case 119: teensValue = "one hundred-nineteen";
						break;			
					}
			
		 
		 
		 
		 return teensValue;
		

	}
	
	private final String toNonTeens( int number ) {
		
		String nonTeensValue = "";
		
		//---------
		    String onesText = "";
			String tensText = "";
			String hundredsText = "";
			
			String numberStr = Integer.toString(number);
			
			Integer n = numberStr.length();
			Integer startIndexOnes = 0; // if 1 digit then 0, 2 digit then  1, 3 digit then 2
			Integer startIndexTens = 0; // if 1 digit then NA, 2 digit then 0, 3 digit then 1
			
			Integer endIndexOnes = 0; // if 1 digit then 1, 2 digit then  2, 3 digit then 3
			Integer endIndexTens = 0; // if 1 digit then NA, 2 digit then 1, 3 digit then 2
			
			
		    switch (n) {
		    
			    case 1: 
			    		startIndexOnes = 0;
			    		endIndexOnes = 1;
			    		
			    	break;
			    case 2: 
			    		startIndexOnes = 1;
			    		endIndexOnes = 2;
			    		startIndexTens = 0;
			    		endIndexTens = 1;
			    		
			    	break;
			    case 3: 
			    		startIndexOnes = 2;
			    		endIndexOnes = 3;
			    		startIndexTens = 1;
			    		endIndexTens = 2;
			    	break;
		    
		    }
		 
		 
		 
		    if (number < 1000 && number >0)	{
				
				
				if (number > 99) {
					
					
					switch(numberStr.substring(0,1)) {
						
						case "1": hundredsText = "one hundred-";
							break;	
						case "2": hundredsText = "two hundred-";
							break;
						case "3": hundredsText = "three hundred-";
						    break;
						case "4": hundredsText = "four hundred-";
							break;
						case "5": hundredsText = "five hundred-";
							break;
						case "6": hundredsText = "six hundred-";
							break;
						case "7": hundredsText = "seven hundred-";
								break;
						case "8": hundredsText = "eight hundred-";
								break;
						case "9": hundredsText = "nine hundred-";
							break;			
					}
				}
				
				
				
			
				if ((number < 100 && number > 19 && number != 10 ) || number > 100 ) {
					//tens
					
						switch(numberStr.substring(startIndexTens,endIndexTens)) {
						
						case "1": tensText = "ten";
							break;
						
						case "2": tensText = "twenty-";
							break;
						case "3": tensText = "thirty-";
						    break;
						case "4": tensText = "forty-";
							break;
						case "5": tensText = "fifty-";
							break;
						case "6": tensText = "sixty-";
							break;
						case "7": tensText = "seventy-";
								break;
						case "8": tensText = "eighty-";
								break;
						case "9": tensText = "ninety-";
							break;		
					}
					
				
				}
				
				if ((number > 19 || number < 10) ) {
							//ones
					
							switch(numberStr.substring(startIndexOnes,endIndexOnes)) {
							
							case "1": onesText = "one";
								break;
							case "2": onesText = "two";
								break;
							case "3": onesText = "three";
							    break;
							case "4": onesText = "four";
								break;
							case "5": onesText = "five";
								break;
							case "6": onesText = "six";
								break;
							case "7": onesText = "seven";
								break;
							case "8": onesText = "eight";
								break;
							case "9": onesText = "nine";
								break;		
							}
							
				}
				
				nonTeensValue = hundredsText + tensText + onesText;
							
		    }
		
		
		
		
		//-------------------
		
			
			int lastHyphen = nonTeensValue.lastIndexOf("-");
			int nonTeensValueLen = nonTeensValue.length(); 
			
			
			if(lastHyphen-(nonTeensValueLen-1)==0) {
				
				nonTeensValue = nonTeensValue.substring(0, nonTeensValueLen-1);
				
				
			}
		return nonTeensValue;
	
	}
}
	