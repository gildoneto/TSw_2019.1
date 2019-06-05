package ex_02_JUnit_Calculadora;

public class Calculadora implements ICalculadora {

	@Override
	public int somar(String n1, String n2) {
		Integer soma = Integer.valueOf(n1.toString()) + Integer.valueOf(n2.toString());
		return soma;
	}

	@Override
	public Double dividir(String n1, String n2) {
		Double divisao = Double.valueOf(n1.toString()) / Double.valueOf(n2.toString());
		return divisao;
	}

	@Override
	public Double raizQuadrada(String n1, String n2) {
		// TODO Auto-generated method stub
		return null;
	}

}
