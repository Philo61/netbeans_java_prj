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
public class Indirizzo {
        
        private String Citta ="";
        private String Via ="";
        private String Cap ="";
        private String numeroCivico ="";
        
        public void setCitta(String citta)
        {
               this.Citta = citta;
        }
        public String getCitta() {
               return Citta;
        }
        public void setVia(String via)
        {
               this.Via = via;
        }
        public String getVia() {
               return Via;
        }
        public void setCap(String cap)
        {
               this.Cap = cap;
        }
        public String getCap() {
               return Cap;
        }
        public void setnumeroCivico(String numcivico)
        {
               this.numeroCivico = numcivico;
        }
        public String getnumeroCivico() {
               return numeroCivico;
        }
}
