package Entities;

import Entities.enums.tipoStatus;
import Entities.enums.tipoQuarto;

public class Quarto {

	private Integer numero;
	private tipoQuarto tipo;
	private double precoDiaria;
	private tipoStatus status;

	

	public Quarto() {
	}

	public Quarto(Integer numero, tipoQuarto tipo, tipoStatus status, double precoDiaria) {	
		this.numero = numero;
		this.tipo = tipo;
		this.precoDiaria = precoDiaria;
		this.status = status;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public tipoQuarto getTipo() {
		return tipo;
	}

	public void setTipo(tipoQuarto tipo) {
		this.tipo = tipo;
	}
	

	public tipoStatus getStatus() {
		return status;
	}

	public void setStatus(tipoStatus status) {
		this.status = status;
	}

	
	public double getPrecoDiaria() {
		return precoDiaria;
	}

	public void setPrecoDiaria(double precoDiaria) {
		this.precoDiaria = precoDiaria;
	}

	@Override
	public String toString() {
		return numero + " - " + tipo + " - " + precoDiaria + " - " + status;
	}

	
}
