package br.com.khadije.zein.domain;

import br.com.khadije.zein.service.interfaces.NumeroRacionalService;

public class NumeroRacional implements NumeroRacionalService {
	private Integer numerador;
	private Integer denominador;
	
	
	public NumeroRacional(Integer numerador, Integer denominador) {
		super();
		if(denominador!=0) {
			this.numerador = numerador;
			this.denominador = denominador;
		}
	}
	

	public Integer getNumerador() {
		return numerador;
	}


	public void setNumerador(Integer numerador) {
		this.numerador = numerador;
	}


	public Integer getDenominador() {
		return denominador;
	}


	public void setDenominador(Integer denominador) {
		this.denominador = denominador;
	}


	public NumeroRacional adicao(NumeroRacional n1, NumeroRacional n2) {
		NumeroRacional soma = new NumeroRacional(
				((n1.getNumerador()*n2.getDenominador())+
						(n2.getNumerador()*n1.getDenominador())),
				(n1.getDenominador()*n2.getDenominador()));
		return soma;
	}
	
	public NumeroRacional multiplicacao(NumeroRacional n1, NumeroRacional n2) {
		NumeroRacional produto = new NumeroRacional(
				(n1.getNumerador()*n2.getNumerador()),
				(n1.getDenominador()*n2.getDenominador()));
		return produto;
	}

	public void imprimir(NumeroRacional numero) {
		System.out.println(numero.getNumerador()+"/"+numero.getDenominador());
	}
}
