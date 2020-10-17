package br.com.khadije.zein.main;

import br.com.khadije.zein.domain.NumeroComplexo;

public class MainComplexo {

	public static void main(String[] args) {
		
		    NumeroComplexo n1 = new NumeroComplexo(1,2);
		    NumeroComplexo n2 = new NumeroComplexo(3,4);
		    n1.imprimir(n1);
		    n2.imprimir(n2);
		    NumeroComplexo n3 = n1.adicao(n1,n2);
		    n3.imprimir(n3);
		    NumeroComplexo n4 = n1.multiplicacao(n1,n2);
		    n4.imprimir(n4);
	}
}
