/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archiviodipendenti;

/**
 *
 * @author admin
 */
public class ListaDipendenti {
    public void aggiungi(Dipendente nuovodip)
    {
        System.out.println("\n\n\nINSERIMENTO NUOVO DIPENDENTE");
        
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
