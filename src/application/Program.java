package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contrato;
import model.entities.Parcelamento;
import model.service.PaypalServico;
import model.service.ServicoDeContrato;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os Dados do COntrato");
		System.out.print("Numero");
		Integer numero = sc.nextInt();
		
		System.out.print("Data (dd/MM/yyy): ");
		Date date = sdf.parse(sc.next());
		System.out.print("alor de Contrato:");
		Double totalvalue = sc.nextDouble();
		
		Contrato contrato = new Contrato(numero, date, totalvalue);
		
		System.out.print("Entre com o numero de parcelas: ");
		int n = sc.nextInt();
		
		ServicoDeContrato cs = new ServicoDeContrato(new PaypalServico());
		
		cs.processoContract(contrato, n);
		
		System.out.println("Parcelas: ");
		for(Parcelamento it : contrato.getLista()) {
			
			System.out.println(it);
			
			sc.close();
		}

	}

}
