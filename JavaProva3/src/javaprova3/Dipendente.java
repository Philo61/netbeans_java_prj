/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprova3;

/**
 *
 * @author admin
 */
public class Dipendente {
      
        private String matricola ="";
        private String cognome ="";
        private String nome = "";
        private Indirizzo residente = new Indirizzo();
        private Indirizzo sedeLavoro = new Indirizzo();
       
        
        public void setmatricola(String matricola)
        {
               this.matricola = matricola;
        }
        public String getmatricola() {
               return matricola;
        }
        public void setcognome(String cognome)
        {
               this.cognome = cognome;
        }
        public String getcognome() {
               return cognome;
        }
        public void setnome(String nome)
        {
               this.nome = nome;
        }
        public String getnome() {
               return nome;
        }
        public void setsedeLavoro(String via, String numero,String citta, String cap)
        {
               this.sedeLavoro.setVia(via);
               this.sedeLavoro.setCitta(citta);
               this.sedeLavoro.setCap(cap);
               this.sedeLavoro.setnumeroCivico(numero);
        }
        public Indirizzo getsedeLavoro() {
               return sedeLavoro;
        }
        public void setresidente(String via, String numero,String citta, String cap)
        {
               this.residente.setVia(via);
               this.residente.setnumeroCivico(numero);
               this.residente.setCap(cap);
               this.residente.setCitta(citta);
               
        }
        public Indirizzo getresidente() {
               return residente;
        }
}

