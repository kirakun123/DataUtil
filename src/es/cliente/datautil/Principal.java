package es.cliente.datautil;
import java.util.Scanner;
import es.datautil.Meses;
import es.datautil.*;

public class Principal {

	public static void main(String[] args) {
		
		/*
		   IMPLEMENTAR 
		   
		   
		   Acrescente uns Prints para Feeedback e para mostrar os resultados
		  
		   LER numero do m�s
		   Converte numero do m�s para um objecto do enumerado Meses e guarda na vari�vel mes
		   
		   Se mes igual a MESES.FEVEREIRO
		     ent�o
		        LER ano
		        Invocar m�todo classe Data para obter o n�mero de dias do m�s
		     sen�o
		        Invocar m�todo classe Data para obter o n�mero de dias do m�s
		        
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
