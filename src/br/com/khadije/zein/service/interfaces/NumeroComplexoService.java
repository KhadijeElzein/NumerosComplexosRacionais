package br.com.khadije.zein.service.interfaces;

import br.com.khadije.zein.domain.NumeroComplexo;

public interface NumeroComplexoService {
	public NumeroComplexo adicao(NumeroComplexo n1, NumeroComplexo n2);

	public NumeroComplexo multiplicacao(NumeroComplexo n1, NumeroComplexo n2);
	
	public void imprimir(NumeroComplexo numero);
}