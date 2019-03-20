package exercicio05;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


public class AnagramaTeste {
	
	private static IAnagrama anagrama;
	
	@BeforeClass
	public static void iniciarAnagrama() {
		
		anagrama = new Anagrama();
	}
	
	@Test
	public void testarAnagramaRomaAmor() {
		String a1 = "roma";
		String a2 = "amor";
		
		boolean resultado = anagrama.isAnagramas(a1,a2);
		
		Assert.assertTrue(resultado);
	}

}
