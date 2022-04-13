package model.service;

public interface ServicoDePagamentoOnline {
	
	Double taxaDePagamento(Double amount);
	Double juros(Double amount, Integer meses);

}
