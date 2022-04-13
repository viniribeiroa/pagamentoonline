package model.service;

public class PaypalServico implements ServicoDePagamentoOnline {
	
	private static final double TAXA_DE_PAGAMENTO = 0.02;
	private static final double JUROS = 0.01;

	@Override
	public Double taxaDePagamento(Double amount) {
		
		return amount * TAXA_DE_PAGAMENTO;
	}

	@Override
	public Double juros(Double amount, Integer meses) {
		
		return amount * meses * JUROS;
	}

	

}
