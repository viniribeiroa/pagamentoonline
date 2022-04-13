package model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {
	
	private Integer numeroDeContrato;
	private Date date;
	private Double valorTotal;
	
	List<Parcelamento> lista = new ArrayList<>();
	
	public Contrato() {
		
	}

	public Contrato(Integer numeroDeContrato, Date date, Double valorTotal) {
		
		this.numeroDeContrato = numeroDeContrato;
		this.date = date;
		this.valorTotal = valorTotal;
	}

	public Integer getNumeroDeContrato() {
		return numeroDeContrato;
	}

	public void setNumeroDeContrato(Integer numeroDeContrato) {
		this.numeroDeContrato = numeroDeContrato;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public List<Parcelamento> getLista() {
		return lista;
	}

		

}
