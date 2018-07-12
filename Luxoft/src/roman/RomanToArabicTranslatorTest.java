package roman;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanToArabicTranslatorTest {

	@Test
	public void test() {
		

		RomanToArabicTranslator translator = new RomanToArabicTranslator();
		
		assertEquals("translating I", 1, translator.translate("I"));
		assertEquals("translating X", 10, translator.translate("X"));
		assertEquals("translating C", 100, translator.translate("C"));
		
		
		assertEquals("translating III", 3, translator.translate("III"));
		assertEquals("translating XX", 20, translator.translate("XX"));
		
		
		assertEquals("translating VI", 6, translator.translate("VI"));
		assertEquals("translating LXX", 70, translator.translate("LXX"));
		assertEquals("translating DXI", 511, translator.translate("DXI"));
		
		
		assertEquals("translating IV", 4, translator.translate("IV"));
		assertEquals("translating XC", 90, translator.translate("XC"));
		assertEquals("translating CM", 900, translator.translate("CM"));
		
		
		assertEquals("translating MXC", 1090, translator.translate("MXC"));
		assertEquals("translating XIX", 19, translator.translate("XIX"));
		assertEquals("translating MCMXLIX", 1949, translator.translate("MCMXLIX"));
				
	}

}
