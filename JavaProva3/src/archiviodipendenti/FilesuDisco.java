
package archiviodipendenti;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class FilesuDisco {
    
    public Dipendente[] read(int dipmax){
        // lettura da disco archivio dipendenti
        Dipendente[] listadipendenti = new Dipendente[dipmax];
        String path = "C:/temp/archivio_dip.csv";
        int indexDip = 0;
        String[] broken_line = null;
        try {
            File file = new File(path);
        
            if (file.exists()) // lettura archivio su disco....
                    //System.out.println("Il file " + path + " esiste");
            {
                FileReader rw = new FileReader(file);
                BufferedReader reader = new BufferedReader(rw);
                String line = reader.readLine();
                while(line!=null) {
                    broken_line = line.split(";");
                    //for(int x=0;x<broken_line.length;x++)
                     //   System.out.print(broken_line[x]+"--");
                    
                    listadipendenti[indexDip] = new Dipendente(); // istanzio nuovo dip
                    listadipendenti[indexDip].setmatricola(broken_line[0]);
                    listadipendenti[indexDip].setcognome(broken_line[1]);
                    listadipendenti[indexDip].setnome(broken_line[2]);
                    listadipendenti[indexDip].setresidente(broken_line[3],broken_line[4],broken_line[5],broken_line[6]);
                    listadipendenti[indexDip].setsedeLavoro(broken_line[7],broken_line[8],broken_line[9],broken_line[10],broken_line[11]);
                    System.out.println();
                    line = reader.readLine();
                    indexDip++;
                }
            }
        }
        catch(IOException e) {
		e.printStackTrace();
	}    
        
        // ritorna 
        return listadipendenti ;
    }
    
    public void write(Dipendente[] lista, int dipmax){
        // scrittura su disco archivio dipendenti
        String path = "C:/temp/archivio_dip.csv";
	try {
		
                File file = new File(path);
                if (file.exists())
			System.out.println("Il file " + path + " esiste");
		else if (file.createNewFile())
			System.out.println("Il file " + path + " è stato creato");
		else
			System.out.println("Il file " + path + " non può essere creato");
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		for(int x=0;x<dipmax;x++){
                    bw.write(lista[x].getmatricola()+";");
                    bw.write(lista[x].getcognome()+";");
                    bw.write(lista[x].getnome()+";");
                    //{"Via",""},{"Numero Civico",""},{"CAP:",""},{"Città"
                    bw.write(lista[x].getresidente().getVia()+";");
                    bw.write(lista[x].getresidente().getnumeroCivico()+";");
                    bw.write(lista[x].getresidente().getCap()+";");
                    bw.write(lista[x].getresidente().getCitta()+";");
                    
                    // Via,Numero Civico,CAP,Città, Telefono
                    bw.write(lista[x].getsedeLavoro().getVia()+";");
                    bw.write(lista[x].getsedeLavoro().getnumeroCivico()+";");
                    bw.write(lista[x].getsedeLavoro().getCap()+";");
                    bw.write(lista[x].getsedeLavoro().getCitta()+";");
                    bw.write(lista[x].getsedeLavoro().getTelefono()+";");
                    bw.write("\n\r");
                }
                
		bw.flush();
		bw.close();
	}
	catch(IOException e) {
		e.printStackTrace();
	}
        
    }
}
