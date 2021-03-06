package drivenow;

import java.util.ArrayList;

public class Ressourcenverwaltung {
	private ArrayList<Fahrlehrerindaten> fahrlehrerinnen;
	private ArrayList<Auto> autos;
	private ArrayList<Theoriestunde> tsdata;

	public Ressourcenverwaltung() {
		fahrlehrerinnen = new ArrayList<Fahrlehrerindaten>();
		autos = new ArrayList<Auto>();
		tsdata = new ArrayList<Theoriestunde>();
	}

	/**
	 * Mit Gewalt ein 'Auto' finden
	 */
	public Auto findAuto(String kfz) {
		for (Auto a: autos)
			if (a.getKennzeichen().equals(kfz))
				return a;

		return null;
	}

	/**
	 * Fertige 'Fahrlehrerin' hinzufuegen
	 */
	public void addFahrlehrerin(Fahrlehrerindaten fld) {
		fahrlehrerinnen.add(fld);
	}

	/**
	 * Fertiges 'Auto' hinzufuegen
	 */
	public void addAuto(Auto a) {
		autos.add(a);
	}
}
