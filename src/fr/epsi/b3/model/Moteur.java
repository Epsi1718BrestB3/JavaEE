package fr.epsi.b3.model;

public class Moteur {
	
	private Score score;
	private Attaquant attaquant;
	private Gardien gardien;
	
	/**
	 * Initialisation de la partie
	 */
	public void commencerPartie() {
		this.attaquant = new Attaquant(0);
		this.gardien = new Gardien();
		
		// Initialisation score
		this.score = new Score();
		
		// TODO
	}
	
	/**
	 * réinitialiser les posistions protégées
	 * par le gardien
	 */
	public void nouvelEssai() {
		
	}
	
	/**
	 * 
	 * True : but
	 * False : pas but
	 */
	public boolean lancer(int zoneVisee) {
		int[] tableauZonesGardees = new int[3];
		tableauZonesGardees[0] = gardien.getZoneProtegee().getZonePartie1();
		tableauZonesGardees[1] = gardien.getZoneProtegee().getZonePartie2();
		tableauZonesGardees[2] = gardien.getZoneProtegee().getZonePartie3();
				
		if (zoneVisee == tableauZonesGardees[0]
			|| zoneVisee == tableauZonesGardees[1]
			|| zoneVisee == tableauZonesGardees[2]) {
			
			score.incrementeScoreA();
			return false;
			
		} else {
			
			score.incrementeScoreB();
			return true;
			
		}
	}
}
