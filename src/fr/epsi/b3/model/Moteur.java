package fr.epsi.b3.model;
import java.util.Observable;


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
		this.score.setPersonneA(attaquant);
		this.score.setPersonneB(gardien);
		//this.score.miseAZero();
		
		// TODO
	}
	
	/**
	 * réinitialiser les positions protégées
	 * par le gardien
	 */
	public void nouvelEssai() {
		
	}
	
	/**
	 * 
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
			return true;
			
		} else {
			
			score.incrementeScoreB();
			return false;
			
		}
	}
}
