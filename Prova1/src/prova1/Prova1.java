/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova1;

import java.awt.GraphicsEnvironment;
import java.util.*;
/**
 *
 * @author Filippo
 */
public class Prova1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] _nomeMese = {"Gennaio","Febbraio","Marzo","Aprile","Maggio","Giugno",
                            "Luglio","Agosto","Settembre","Ottobre","Novembre","Dicembre"};
        double[] fattoriali = new double[12] ;
        int colonna = 10;
        int riga =10;
        int[][] tabellina = new int[riga][colonna];
        int mese, anno;
        boolean bisestile = false;
       /* Scanner input = new Scanner(System.in);
        System.out.print("Digita il mese :");
        mese = input.nextInt();
        System.out.print("Digita l'anno :");
        anno = input.nextInt();
        
        if (anno%4 == 0)
            bisestile = true;
        
        System.out.printf("Il mese richiesto è %s dell'anno %d", _nomeMese[mese-1], anno);
        
        switch (mese) {
            case 1:   
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(" e ha 31 giorni");
                break;
            case 2: // febbraio  
                if (bisestile)
                    System.out.println(", essendo bisestile ha 29 giorni");
                else
                    System.out.println(" e ha 28 giorni");
                break;
            default: // mesi con 30 gg
                    System.out.println(" e ha 30 giorni");
                break;
        } 
        System.out.printf("Il Fattoriale del mese di %s è : %.0f\n\n" ,_nomeMese[mese-1] , calcolaFattoriale(mese));
        
        for (int i=0; i<fattoriali.length;i++) 
            fattoriali[i] = calcolaFattoriale(i+1);
        
	for (int i=0; i<fattoriali.length;i++) 
            System.out.printf("Il Fattoriale di %d è : %.0f\n", i+1 , fattoriali[i]);
            //System.out.println(fattoriali[i]);
        */    
        //GraphicsEnvironment.getLocalGraphicsEnvironment();
        for (int r=0; r<riga;r++) 
            for(int c=0; c<colonna;c++)
                tabellina[r][c] = (c+1)*(r+1);
        int spaziatura = 1;
        for(int s=tabellina[riga-1][colonna-1]; s>=1; s/=10)
            spaziatura++;            
        // *********** stampa della tabellina con formattazione output *****************************
        for (int r=0; r<riga;r++)
        { 
            if (r==0)
            {
                for(int c=0; c<colonna;c++)
                {
                
                    if (c==0)
                        System.out.print('┌');
                    for(int d=0; d<(spaziatura);d++)
                        System.out.print('─');
                    if (c<colonna-1)
                        System.out.print('┬');
                    else
                        System.out.println('┐');
                }
            }
            if (r<riga)
            {    // stampa i dati tabellina
                for(int c=0; c<colonna;c++)
                    System.out.printf("│%"+spaziatura+"d  ", tabellina[r][c]);
              
                    System.out.println("│");
                // stampa cornice centrale    
                if (r<riga-1)
                {
                    for(int c=0; c<colonna;c++)
                    {
                        if (c==0)
                            System.out.print('├');
                        else
                            System.out.print('┼');
                        for(int d=0; d<(spaziatura);d++)
                            System.out.print('─');
                     }
                    System.out.println('┤');
                }
            } 
            
        }
        // stampa cornice bassa
                for(int c=0; c<colonna;c++)
                {
                if (c==0)
                    System.out.print('└');
                else
                    System.out.print('┴');
                for(int d=0; d<(spaziatura);d++)
                    System.out.print('─');
                }
                System.out.println('┘');
    }
            
    public static double calcolaFattoriale(int x)
    {
                    if (x <= 0)
                            return 1;
                    else
                            return (x * calcolaFattoriale(x-1));
    }
}    
