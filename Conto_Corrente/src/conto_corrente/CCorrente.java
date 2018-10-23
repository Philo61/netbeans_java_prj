package conto_corrente;

public class CCorrente {

	float saldoConto = 0;
	
	public void Versa(float importo) {
		if (importo < 1000) {
                    saldoConto+=importo; 
                    System.out.println("Operazione effettuata! il saldo ora è di euro:" + MostraSaldo());
                }
                else 
			System.out.println("\nOperazione NON effettuata! \nL'importo eccede il massimo consentito!");
	}

	public void Preleva(float importo) {
		if (importo > saldoConto)
			System.out.println("\nOperazione NON effettuata! \nFondi insufficienti per l'Operazione richiesta!");
                else {
			saldoConto-=importo;
                        System.out.println("Operazione effettuata! il saldo ora è di euro:" + MostraSaldo());
                }
	}	

	public float MostraSaldo() {
		
            return saldoConto;
		
	}
}
