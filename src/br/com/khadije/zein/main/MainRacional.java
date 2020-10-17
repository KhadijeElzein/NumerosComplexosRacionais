package br.com.khadije.zein.main;

import br.com.khadije.zein.domain.NumeroRacional;

public class MainRacional {
	
	public static void main(String[] args) {
		NumeroRacional n1 = new NumeroRacional(1,2);
		NumeroRacional n2 = new NumeroRacional(3,4);
		n1.imprimir(n1);
		n2.imprimir(n2);
		NumeroRacional n3 = n1.adicao(n1,n2);
		n3.imprimir(n3);
		NumeroRacional n4 = n1.multiplicacao(n1,n2);
		n4.imprimir(n4);
	}
}
