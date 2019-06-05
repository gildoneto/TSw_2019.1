package ex_05_JUnit_Anagrama;

import java.util.Arrays;

public class Anagrama implements IAnagrama {

	@Override
	public boolean isAnagramas(String a1, String a2) {
	    //se as duas strings não tem o mesmo tamanho, não é anagrama
	    if ( a1.length() != a2.length() ) {
	        return false;
	    }
	    //tranfroma em arrays para poder ordenar
	    char[] c1 = a1.toCharArray();
	    char[] c2 = a2.toCharArray();
	    //ordena para garantir a comparação simplificada
	    Arrays.sort(c1);
	    Arrays.sort(c2);
	    //cria novas strings baseadas nos arrays ordenados
	    String sc1 = new String(c1);
	    String sc2 = new String(c2);
	    return sc1.equals(sc2);
	}

}
