package model.service;

import java.util.Calendar;
import java.util.Date;

import model.entities.Contrato;
import model.entities.Parcelamento;

public class ServicoDeContrato {
	
	private ServicoDePagamentoOnline servicoDePagamentoOnline;
	
	public ServicoDeContrato(ServicoDePagamentoOnline servicoDePagamentoOnline) {
		
		this.servicoDePagamentoOnline = servicoDePagamentoOnline;
	}
	
	public void processoContract(Contrato contrato, int meses) {
		
		
		double cotaBasica = contrato.getValorTotal() / meses;
		for(int i = 1; i <= meses; i++) {
			
			double updatedCota = cotaBasica + servicoDePagamentoOnline.juros(cotaBasica, i);
			
			double fullcota = updatedCota + servicoDePagamentoOnline.taxaDePagamento(updatedCota);
			
			Date vencimentoData = addMeses(contrato.getDate(), i);
			//adicionar mes a data
			
			contrato.getLista().add(new Parcelamento(vencimentoData, fullcota));
		}
	}
	
	private Date addMeses(Date date, int n) {
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, n);
		return calendar.getTime();
	}

}
