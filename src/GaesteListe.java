import java.util.Arrays;

public class GaesteListe {

	// Array mit den Eintr�gen der G�steliste "nil" bedeutet freier Platz
	String[] liste;
	
	//
	int index;
	
	int zaehler;
	
	/*
	 * Initialisiert ein Array mit einer bestimmten Anzahl an G�sten.
	 * @param int anzahl
	 */
	public GaesteListe(int pAnzahl) {
	  this.liste = new String[pAnzahl];
      
	}
	
	/*
	 * Liefert die komplette Liste als String-Array
	 */
	public String[] getListe() {
		return this.liste;
	}
	
	/*
	 * Setter-Methode welche einen Teilnehmer zu dem liste Array hinzuf�gt
	 * @param String pTeilnehmer Teilnehmername
	 */
	public void setTeilnehmer(String pTeilnehmer) {
		this.liste[zaehler] = pTeilnehmer;
		this.zaehler++;
		
		// Hier wird der n�chste Index gesetzt. +1 muss gerechnet werden da das Array bei 0 startet
		this.index = this.zaehler + 1;
	}
	
	/*
	 * Gibt zur�ck wie viele Pl�tze derzeit nicht belegt sind
	 * return int Anzahl Freie Pl�tze
	 */
	public int getFreiePlaetze() {
		
		int freiePlaetze = 0;
		for(String name: this.getListe()) { 
			if(name == null) {
				freiePlaetze++;
			}
		}
		return freiePlaetze;
		
	}
	/*
	 * Pr�ft ob ein Teilnehmer eingeladen ist
	 * @param String gast
	 */
	public boolean isEingeladen(String pGast) {
		boolean eingeladen = false;
		for(String name: this.getListe()) { 
			if(pGast == name) {
				eingeladen = true;
			}
		}
		return eingeladen;
	}
}



