package ex_03_JUnit_Ordenador;

import java.util.Collection;

public interface IOrdenador {

	public void inserirColecao(Collection<String> pColecao);
	public void informarValor(String pValor);
	public double getMenorValor();
	public double getMaiorValor();
	public double getValorMedio();
	public double getValorMediano();
}
