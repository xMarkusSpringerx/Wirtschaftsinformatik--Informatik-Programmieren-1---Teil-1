public class index {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Hier wird eine neue Gästeliste generiert mit 15 freien Plätzen.
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
		System.out.println(gaesteListe.getFreiePlaetze() + " freie Plätze sind noch zur Verfügung");
		System.out.println(gaesteListe.index + " ist der nächste freie Platz");
		
		System.out.println(gaesteListe.isEingeladen("Frau Sau"));


	}

}
