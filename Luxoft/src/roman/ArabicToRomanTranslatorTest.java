package roman;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArabicToRomanTranslatorTest {

	@Test
	public void testTranslate() {
		ArabicToRomanTranslator translator = new ArabicToRomanTranslator();
		
		assertEquals("translating 1", "I", translator.translate(1));
		assertEquals("translating 10", "X", translator.translate(10));
		assertEquals("translating 100", "C", translator.translate(100));
		
		
		assertEquals("translating 3", "III", translator.translate(3));
		assertEquals("translating 20", "XX", translator.translate(20));
		
		
		assertEquals("translating 6", "VI", translator.translate(6));
		assertEquals("translating 70", "LXX", translator.translate(70));
		assertEquals("translating 511", "DXI", translator.translate(511));
		
		
		assertEquals("translating 4", "IV", translator.translate(4));
		assertEquals("translating 90", "XC", translator.translate(90));
		assertEquals("translating 900", "CM", translator.translate(900));
		
		
		assertEquals("translating 1090", "MXC", translator.translate(1090));
		assertEquals("translating 19", "XIX", translator.translate(19));
		assertEquals("translating 1949", "MCMXLIX", translator.translate(1949));
				
		
	}

}
