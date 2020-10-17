package br.com.khadije.zein.domain;

import br.com.khadije.zein.service.interfaces.NumeroComplexoService;

public class NumeroComplexo implements NumeroComplexoService{
	private Integer real;
	private Integer imaginario;
	
	
	public NumeroComplexo(Integer real, Integer imaginario) {
		super();
		this.real = real;
		this.imaginario = imaginario;
	}

	public Integer getReal() {
		return real;
	}

	public void setReal(Integer real) {
		this.real = real;
	}

	public Integer getImaginario() {
		return imaginario;
	}

	public void setImaginario(Integer imaginario) {
		this.imaginario = imaginario;
	}

	public NumeroComplexo adicao(NumeroComplexo n1, NumeroComplexo n2) {
		NumeroComplexo soma = new NumeroComplexo(
				(n1.getReal()+n2.getReal()),
				(n1.getImaginario()+n2.getImaginario()));
		return soma;
				
	}

	public NumeroComplexo multiplicacao(NumeroComplexo n1, NumeroComplexo n2) {
		NumeroComplexo produto = new NumeroComplexo(
				((n1.getReal()*n2.getReal())-(n1.getImaginario()*n2.getImaginario())),
				((n1.getReal()*n2.getImaginario())+(n2.getReal()*n1.getImaginario())));
		return produto;
				
	}
	
	public void imprimir(NumeroComplexo numero){
		System.out.println(numero.getReal()+ " + " + numero.getImaginario() + " i");
	}
}
