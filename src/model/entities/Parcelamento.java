package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Parcelamento {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Date dataDeVencimento;
	private Double amount;
	
	public Parcelamento() {
		
	}

	public Parcelamento(Date dataDeVencimento, Double amount) {
		this.dataDeVencimento = dataDeVencimento;
		this.amount = amount;
	}

	public Date getDataDeVencimento() {
		return dataDeVencimento;
	}

	public void setDataDeVencimento(Date dataDeVencimento) {
		this.dataDeVencimento = dataDeVencimento;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return sdf.format( dataDeVencimento + "-" + String.format("%.2f",  amount));
	}
	
	
	

}
