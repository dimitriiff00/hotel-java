package Services;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import Entities.Cliente;
import Entities.Quarto;
import Entities.enums.tipoStatus;

public class Reserva {

	private Integer numero;
	private Quarto quarto;
	private Date dataInicial;
	private Date dataFinal;
	private Cliente cliente;
	private double valorTotal;
	private tipoStatus status;
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	
	public Reserva() {
		
	}

	private SimpleDateFormat SimpleDateFormat(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public Reserva(Integer numero, Quarto quarto, Date dataInicial, Date dataFinal, Cliente cliente, double valorTotal,
			tipoStatus status) {
		this.numero = numero;
		this.quarto = quarto;
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
		this.cliente = cliente;
		this.valorTotal = valorTotal;
		this.status = status;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Quarto getQuarto() {
		return quarto;
	}

	public void setQuarto(Quarto quarto) {
		this.quarto = quarto;
	}

	public Date getDataInicial() {
		return dataInicial;
	}

	public void setDataInicial(Date dataInicial) {
		this.dataInicial = dataInicial;
	}

	public Date getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(Date dataFinal) {
		this.dataFinal = dataFinal;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public tipoStatus getStatus() {
		return status;
	}

	public void setStatus(tipoStatus status) {
		this.status = status;
	}
	public double calculaTotal(Date dataInicial, Date dataFinal) {
		long diferencaMilissegundos = dataFinal.getTime() - dataInicial.getTime();
		// Convertendo a diferença em dias
        long diferencaDias = TimeUnit.DAYS.convert(diferencaMilissegundos, TimeUnit.MILLISECONDS);
        
        return diferencaDias * quarto.getPrecoDiaria();
        
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Reserva numero: " + numero + "\n");
		sb.append("Numero do Quarto " + quarto.getNumero() + "\n");
		sb.append("Data Inicial " + sdf.format(dataInicial) + "\n");
		sb.append("Data Final " + sdf.format(dataFinal) + "\n");
		sb.append("Nome do Cliente: " + cliente.getNome() + "\n");
		sb.append("Valor Total Diaria " + calculaTotal(dataInicial, dataFinal) + "\n");
		sb.append("Status Quarto " + quarto.getStatus());
		return sb.toString();
	}
	
	
	
	
}
