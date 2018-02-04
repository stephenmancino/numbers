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
		Assert.assertEquals( "exit", "0", numberWords.toWords( 0 ) ) ;
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
		Assert.assertEquals("twenty two", "22",numberWords.toWords(22));
	}
	
    
	
}
