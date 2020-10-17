package br.com.khadije.zein.service.interfaces;

import br.com.khadije.zein.domain.NumeroRacional;

public interface NumeroRacionalService {
	public NumeroRacional adicao(NumeroRacional n1, NumeroRacional n2);

	public NumeroRacional multiplicacao(NumeroRacional n1, NumeroRacional n2);
	
	public void imprimir(NumeroRacional numero);

}
