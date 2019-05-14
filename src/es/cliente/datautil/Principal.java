package es.cliente.datautil;
import java.util.Scanner;
import es.datautil.Meses;
import es.datautil.*;

public class Principal {

	public static void main(String[] args) {
		
		/*
		   IMPLEMENTAR 
		   
		   
		   Acrescente uns Prints para Feeedback e para mostrar os resultados
		  
		   LER numero do mês
		   Converte numero do mês para um objecto do enumerado Meses e guarda na variável mes
		   
		   Se mes igual a MESES.FEVEREIRO
		     então
		        LER ano
		        Invocar método classe Data para obter o número de dias do mês
		     senão
		        Invocar método classe Data para obter o número de dias do mês
		        
		   Fim_SE
		   
		
	    */ 
		
		Scanner ler = new Scanner(System.in);
		int diames = ler.nextInt();
		Meses mes = Meses.mesFromInt(diames);
		int dias = Data.diasMes(mes);
		if(mes.getNumeroMes() == 2) {
			System.out.println("Digite o ano");
			int ano = ler.nextInt();
			Data.diasMes(mes, ano);
			System.out.println("Ano: " + ano + " Mes: " + mes + " Dias: " + dias);
		}
		else
		{
			
		}
		
		
		
		
		
		
	}

}
