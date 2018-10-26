/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archiviodipendenti;

import java.util.*;

/**
 *
 * @author admin
 */
public class DipendentiMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean continua = true;
        int maxdip = 10;    //numero max di record gestiti
        int indexDip =0, xd=0;
        FilesuDisco archivio = new FilesuDisco();
        String[][] _ldIndirizzo = {{"Via",""},{"Numero Civico",""},{"CAP:",""},{"Città",""},{"Telefono:",""}};
        
        Dipendente[] dipendenti = archivio.read(maxdip);
                //inizializzo archivio di 11 elementi
        while ((indexDip<dipendenti.length)&& (dipendenti[indexDip] != null))
            indexDip++;
        
        ListaDipendenti rubrica = new ListaDipendenti();
        Scanner input = new Scanner(System.in);
		while (continua) 
		{
			System.out.println("\n\n\nAnagrafica Dipendenti");
			System.out.println("0) Elenco dipendenti");
			System.out.println("1) Visualizza dipendente");
			System.out.println("2) Inserisci dipendente");
                        System.out.println("3) Modifica dipendente");
			System.out.println("\n5) Uscita");
			System.out.print("\nImmetti la scelta: ");
			
			String s = input.nextLine();
                        
                        switch (s) {
                            case "0":   System.out.print("Richiesta Elenco");
                                if (indexDip>0)
                                    rubrica.visualizza(dipendenti, indexDip);
                                break;
                            case "1":   System.out.print("\nRichiesta Visualizza dipendente n.ro: ");
                                xd = input.nextInt()-1; // indice da 0
                                if (xd<indexDip) {
                                    System.out.printf("\nMatricola dipendente: %s", dipendenti[xd].getmatricola());
                                    System.out.printf("\nNome: %s %s", dipendenti[xd].getcognome(), dipendenti[xd].getnome());
                                    System.out.printf("\nIndirizzo: %s,%s %s - %s", dipendenti[xd].getresidente().getVia(),dipendenti[xd].getresidente().getnumeroCivico(),
                                            dipendenti[xd].getresidente().getCap(), dipendenti[xd].getresidente().getCitta());
                                    System.out.printf("\nSede di Lavoro: %s,%s %s - %s %s", dipendenti[xd].getsedeLavoro().getVia(),dipendenti[xd].getsedeLavoro().getnumeroCivico(),
                                            dipendenti[xd].getsedeLavoro().getCap(), dipendenti[xd].getsedeLavoro().getCitta(), dipendenti[xd].getsedeLavoro().getTelefono());
                                    s = input.nextLine();
                                }
                                break;
                            case "2":   
                                
                                if (indexDip<maxdip) 
                                {
                                    dipendenti[indexDip] = new Dipendente(); // istanzio nuovo dip
                                    rubrica.aggiungi(dipendenti[indexDip]);
                                    indexDip++; // incrementa di 1 archivio
                                }
                                else {
                                   System.out.println("Numero MAX di dipendenti raggiunto!");
                                   s = input.nextLine();
                                }
                                break;
                            case "3":   System.out.print("\nRichiesta Modifica dipendente n.ro: ");
                                xd = input.nextInt()-1; // indice da 0
                                if (xd<indexDip) {
                                    rubrica.modifica(dipendenti[xd]); // elemento da modificare
                                    s = input.nextLine();
                                }
                                break;
                            case "5":   System.out.println("Richiesta Uscita");
                                // salva archivio su disco ed esce......
                                archivio.write(dipendenti, indexDip);
                                continua = false;	
                                break;
			}
                }
                        

        
        
        
    }
    
}
