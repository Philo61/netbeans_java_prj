/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archiviodipendenti;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class ListaDipendenti {
    public void aggiungi(Dipendente nuovodip)
    {
        String[][] _ldIndirizzo = {{"Via",""},{"Numero Civico",""},{"CAP:",""},{"Città",""},{"Telefono:",""}};
        Scanner input = new Scanner(System.in);
        System.out.println("\n\n\nINSERIMENTO NUOVO DIPENDENTE");
       // System.out.printf("\nRichiesta Inserimento dipendente N.ro %d\n",indexDip+1);
      //  nuovodip = new Dipendente(); // istanzio nuovo dip
        System.out.print("Matricola dipendente: ");
        String s = input.nextLine();
        nuovodip.setmatricola(s);
        System.out.printf("\nCognome: "); 
        s = input.nextLine();
        nuovodip.setcognome(s);
        System.out.printf(" Nome: ");
        s = input.nextLine();
        nuovodip.setnome(s);
        System.out.println("\nIndirizzo:"); // residenza
        for (int x=0;x<4;x++){
            System.out.printf("%s :", _ldIndirizzo[x][0]);
            _ldIndirizzo[x][1] = input.nextLine();
        }
        //{"Via",""},{"Numero Civico",""},{"CAP:",""},{"Città"
        nuovodip.setresidente(_ldIndirizzo[0][1],_ldIndirizzo[1][1],_ldIndirizzo[2][1],_ldIndirizzo[3][1]);

        System.out.println("\nSede di Lavoro:");  // sede di lavoro
        for (int x=0;x<5;x++){
            System.out.printf("%s :", _ldIndirizzo[x][0]);
            _ldIndirizzo[x][1] = input.nextLine();
        }
        nuovodip.setsedeLavoro(_ldIndirizzo[0][1],_ldIndirizzo[1][1],_ldIndirizzo[2][1],_ldIndirizzo[3][1],_ldIndirizzo[4][1]);
        
    }
    
    public void modifica(Dipendente dipendente)
    {
        System.out.println("\n\n\nMODIFICA DIPENDENTE");
        
    }
    public void visualizza(Dipendente[] lista, int dipmax)
    {
        System.out.println("\n\n\nLista Anagrafica Dipendenti");
        
        System.out.printf("\n%-10s %-20s %-20s %-20s %-20s %-10s", "Matricola","Cognome","Nome","Residenza","Sede di Lavoro", "Telefono");
        
        for (int x=0;x<dipmax;x++)
            System.out.printf("\n%-10s %-20s %-20s %-20s %-20s %-10s",lista[x].getmatricola(),lista[x].getcognome(),lista[x].getnome(),lista[x].getresidente().getCitta(),lista[x].getsedeLavoro().getCitta(), lista[x].getsedeLavoro().getTelefono());
        
            
    }
    
}
