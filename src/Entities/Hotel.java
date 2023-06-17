package Entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Entities.enums.tipoStatus;




public class Hotel {
	private List<Quarto> quartos = new ArrayList<>();

	public Hotel() {
	}

	public void addQuarto(Quarto quarto) {
		quartos.add(quarto);
	}
	public void removeQuarto(Quarto quarto) {
		quartos.remove(quarto);
	}
	
	public void buscarQuartosDisponiveis(Date dataInicial, Date dataFinal) {
		for(Quarto q : quartos) {
			if(q.getStatus() == tipoStatus.valueOf("DISPONIVEL")) {
				System.out.println(q);
			}
			
		}
	}
	
	
}
