package devops.numbers;

import org.junit.*;

import devops.numbers.NumberWords;

public class NumberWordsTests {
	private NumberWords numberWords ;
	
	@Before
	public void setup() {
		numberWords = new NumberWords() ;
	}

	@Test
	public void numberZeroExit() {
		Assert.assertEquals( "exit", "exit", numberWords.toWords( 0 ) ) ;
	}
	
	@Test
	public void numberOutOfLowerRangeReturnsError() {
		Assert.assertEquals( "Error", "number out of range", numberWords.toWords( -1 ) ) ;
	}
	
	@Test
	public void numberOutOfUpperRangeReturnsError() {
		Assert.assertEquals( "Error", "number out of range", numberWords.toWords( 5000 ) ) ;
	}
	
	@Test
	public void numberInRangeReturnsText() {
		Assert.assertEquals("Number in Range", "twenty-two",numberWords.toWords(22));
	}
	
	@Test
	public void numberLessThan10() {
		Assert.assertEquals("Less than 10", "eight",numberWords.toWords(8));
	}
	
	@Test
	public void numberInTeens() {
		Assert.assertEquals("Teens", "eighteen",numberWords.toWords(18));
	}
	
	@Test
	public void trimHyphenWhenATenMultiple() {
		Assert.assertEquals("HyphenTrim", "eight hundred-eighty",numberWords.toWords(880));
	}
	
	@Test
	public void numberInOneHundredTeens() {
		Assert.assertEquals("OneHundredTeens", "one hundred-eighteen",numberWords.toWords(118));
	}
	
	@Test
	public void numberLessThan100() {
		Assert.assertEquals("Less than 100", "eighty-eight",numberWords.toWords(88));
	}
	
	
	@Test
	public void numberGreaterThan100() {
		Assert.assertEquals("Greater than 100", "eight hundred-eighty-eight",numberWords.toWords(888));
	}
}
