
import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class Testes {
	
	@Test
	public void precoCalculado() {
	    assertEquals(0, Main.precoCalculado(""));
	    assertEquals(100, Main.precoCalculado("W"));
		assertEquals(160, Main.precoCalculado("WX"));
		assertEquals(230, Main.precoCalculado("YZXW"));

		assertEquals(200, Main.precoCalculado("WW"));
		assertEquals(260, Main.precoCalculado("WWW"));
		assertEquals(360, Main.precoCalculado("WWWW"));
		assertEquals(460, Main.precoCalculado("WWWWW"));
		assertEquals(520, Main.precoCalculado("WWWWWW"));

		assertEquals(320, Main.precoCalculado("WWWX"));
	    assertEquals(350, Main.precoCalculado("WWWXX"));
	 	assertEquals(380, Main.precoCalculado("WWWXXZ"));
		assertEquals(380, Main.precoCalculado("ZWXWXW"));

	}
	 @Test
	    public void precoIncrementalTest() {
		 Main calc = new Main();
		 assertEquals(100,calc.precoTotal()); 
		 calc.verificaPreco("W"); assertEquals(100,calc.precoTotal());
		 calc.verificaPreco("X"); assertEquals(160,calc.precoTotal());
		 calc.verificaPreco("W"); assertEquals(260,calc.precoTotal());
		 calc.verificaPreco("W"); assertEquals(320,calc.precoTotal());
		 calc.verificaPreco("X"); assertEquals(350,calc.precoTotal());

		 
	 }
	 
		}
