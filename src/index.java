public class index {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Hier wird eine neue G�steliste generiert mit 15 freien Pl�tzen.
		GaesteListe gaesteListe = new GaesteListe(15);
		
		// Setter-Methode
		gaesteListe.setTeilnehmer("Frau Sau".toString());
		gaesteListe.setTeilnehmer("Herr Bert".toString());
		gaesteListe.setTeilnehmer("Hans Wurst".toString());
		gaesteListe.setTeilnehmer("Zipfel Peter".toString());
		gaesteListe.setTeilnehmer("Rainer Zufall".toString());
				
		for(String name: gaesteListe.getListe()) { 
			if(name != null)
				System.out.println(name);
		}
		System.out.println(gaesteListe.getFreiePlaetze() + " freie Pl�tze sind noch zur Verf�gung");
		System.out.println(gaesteListe.index + " ist der n�chste freie Platz");
		
		System.out.println(gaesteListe.isEingeladen("Frau Sau"));


	}

}
