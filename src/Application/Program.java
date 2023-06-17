package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import Entities.Cliente;
import Entities.Hotel;
import Entities.Quarto;
import Entities.enums.tipoQuarto;
import Entities.enums.tipoStatus;
import Services.Reserva;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		Reserva reserva = new Reserva();
		Quarto quarto = new Quarto();
		Cliente cliente = new Cliente();
		Hotel hotel = new Hotel();
		//QUARTOS CADASTRADOS
		Quarto quarto1 = new Quarto(1, tipoQuarto.valueOf("CASAL"),tipoStatus.valueOf("DISPONIVEL"), 150.0 );
		hotel.addQuarto(quarto1);
		Quarto quarto2 = new Quarto(2, tipoQuarto.valueOf("SOLTEIRO"),tipoStatus.valueOf("OCUPADO"), 100.0 );
		hotel.addQuarto(quarto2);
		Quarto quarto3 = new Quarto(3, tipoQuarto.valueOf("SOLTEIRO"),tipoStatus.valueOf("DISPONIVEL"), 100.0 );
		hotel.addQuarto(quarto3);
		//
		
		System.out.println("Entre com seu nome: ");
		String nome = sc.next();
		System.out.println("Entre com seu email: ");
		String gmail = sc.next();
		cliente.setNome(nome);
		cliente.setEmail(gmail);
		
		System.out.println("Bem vindo ao Hotel do Amor, digite a data de entrada no formato (dd/MM/yyyy) ");
		String dataInicial = sc.next();
		System.out.println(dataInicial);
		System.out.println("Digite a data de saida: ");
		String dataFinal = sc.next();
		System.out.println(dataFinal);
		reserva.setDataInicial(sdf.parse(dataInicial));
		reserva.setDataFinal(sdf.parse(dataInicial));
		
		System.out.println("Vejamos os quartos disponiveis nesse periodo: ");
		hotel.buscarQuartosDisponiveis(sdf.parse(dataInicial), sdf.parse(dataInicial));
		
		System.out.println("Vamos fazer sua reserva: ");
		
		reserva.setNumero(1);
		reserva.setQuarto(quarto1);
		reserva.setDataInicial(sdf.parse(dataInicial));
		reserva.setDataFinal(sdf.parse(dataFinal));
		reserva.setCliente(cliente);
		
		System.out.println(reserva); 
	}

}
