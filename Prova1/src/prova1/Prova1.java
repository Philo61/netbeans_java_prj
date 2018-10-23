/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova1;

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
        int mese, anno;
        boolean bisestile = false;
        Scanner input = new Scanner(System.in);
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
}

public static double calcolaFattoriale(int x)
{
		if (x <= 0)
			return 1;
		else
			return (x * calcolaFattoriale(x-1));
}
}    
