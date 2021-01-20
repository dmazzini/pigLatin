package pigLatin;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PigLatinTest {

	@Test
	public void test01() {
		String actual = new PigLatin().pigLatin("california");
		String expected = "aliforniacay";
		
		assertEquals(expected, actual);
	}

	@Test
	public void test02() {
		String actual = new PigLatin().pigLatin("paragraphs");
		String expected = "aragraphspay";
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void test03() {
		String actual = new PigLatin().pigLatin("glove");
		String expected = "oveglay";
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void test04() {
		String actual = new PigLatin().pigLatin("algorithm");
		String expected = "algorithmway";
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void test05() {
		String actual = new PigLatin().pigLatin("eight");
		String expected = "eightway";
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void test06() {
		String actual = new PigLatin().pigLatin("schwartz");
		String expected = "artzschway";
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void test07() {
		String actual = new PigLatin().pigLatin("rhythm");
		String expected = "rhythmay";
		
		assertEquals(expected, actual);
	}
	
}
