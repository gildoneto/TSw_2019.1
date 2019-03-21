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
	
	@Test
	public void testarNaoAnagramaMesmoNumeroDeLetras() {
		String a1 = "lua";
		String a2 = "ceu";
		
		boolean resultado = anagrama.isAnagramas(a1,a2);
		
		Assert.assertFalse(resultado);
	}
	
	@Test
	public void testarNaoAnagramaNumeroDeLetrasDiferente() {
		String a1 = "qualquer";
		String a2 = "coisa";
		
		boolean resultado = anagrama.isAnagramas(a1,a2);
		
		Assert.assertFalse(resultado);
	}
	
	@Test(expected=NullPointerException.class)
	public void testarDuasStringsNulas() {
		String a1 = null;
		String a2 = null;
		
		boolean resultado = anagrama.isAnagramas(a1,a2);
		
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testarDoisInteiros() {
		String a1 = "222";
		String a2 = "222";
		
		boolean resultado = anagrama.isAnagramas(a1,a2);
		
	}

}
