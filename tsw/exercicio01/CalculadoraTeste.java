package exercicio01;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculadoraTeste{
	
	private static ICalculadora calculadora;
	
	@BeforeClass
	public static void iniciarCalculadora() {
		calculadora = new Calculadora();
	}
	
	@Test
	public void testarSomaUmMaisDois () {
	
	String n1 = "1";
	String n2 = "2";
	
	Integer resultado = calculadora.somar(n1, n2);
	
	Assert.assertEquals(new Integer("3"), resultado);	
	}
	
	@Test
	public void testarSomaMenosUmMaisMenosDois(){
	
	String n1 = "-1";
	String n2 = "-2";
	
	Integer resultado = calculadora.somar(n1, n2);
	
	Assert.assertEquals(new Integer("-3"), resultado);	
	}
	
	@Test(expected=NullPointerException.class)
	public void testarSomaNullMaisNull(){
	
	String n1 = null;
	String n2 = null;
	
	Integer resultado = calculadora.somar(n1, n2);
	}
	
	@Test
	public void testarSomaMenosQuatroMaisQuatro(){
	
	String n1 = "-4";
	String n2 = "4";
	
	Integer resultado = calculadora.somar(n1, n2);
	
	Assert.assertEquals(new Integer("0"), resultado);	
	}
	
	@Test(expected=NumberFormatException.class)
	public void testarSomaStringMaisUmMil(){
	
	String n1 = "S";
	String n2 = "1000";
	
	Integer resultado = calculadora.somar(n1, n2);	
	}
	
	@Test
	public void testarDivisaoDoisPorDois(){
	
	String n1 = "2";
	String n2 = "2";
	
	Double resultado = calculadora.dividir(n1, n2);
	
	Assert.assertEquals(new Double("1"), resultado);	
	}

	@Test
	public void testarDivisaoDezPorVinte(){
	
	String n1 = "10";
	String n2 = "20";
	
	Double resultado = calculadora.dividir(n1, n2);
	
	Assert.assertEquals(new Double("0.5"), resultado);	
	}
}
