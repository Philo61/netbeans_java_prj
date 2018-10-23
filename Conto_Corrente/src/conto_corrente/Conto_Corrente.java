/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conto_corrente;

/**
 *
 * @author admin
 */
import java.util.*;
//import ContoCorrente.*;
public class Conto_Corrente {	
	public static void main(String args[]){

		boolean continua = true;
		CCorrente conto1 = new CCorrente();
                Date oggi = new Date();
		if (args.length > 0)
		{	// inizializzo il saldo 
			conto1.saldoConto = Float.parseFloat(args[0]);
		}

		Scanner input = new Scanner(System.in);
		while (continua) 
		{
			System.out.println("\n\n\nGestione ContoCorrente");
			System.out.println("0) Mostra saldo");
			System.out.println("1) Versa sul conto");
			System.out.println("2) Preleva dal conto");
			System.out.println("\n5) Uscita");
			System.out.print("\nImmetti la scelta: ");
			
			String s = input.nextLine();
			
			switch (s) {
                            case "0":   System.out.printf("Il saldo in data %td %tB è di euro: %.2f", oggi, oggi, conto1.MostraSaldo());
                            break;
                            case "1":   System.out.print("Richiesta Versamento di :");
                                conto1.Versa(Float.parseFloat(input.nextLine()));
                                break;
                            case "2":   System.out.print("Richiesta Prelievo di :");
                                conto1.Preleva(Float.parseFloat(input.nextLine()));
                                break;
                            case "5":   System.out.println("Richiesta Uscita");
                                continua = false;	
                                break;
			} 
		}
	}

	
	
}