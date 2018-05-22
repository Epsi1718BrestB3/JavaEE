package fr.epsi.b3.controller;

import fr.epsi.b3.model.Moteur;
import fr.epsi.b3.model.Score;

public class ControllerImpl implements Controller {
	
	private Moteur moteur;
	private String message;
	
	
	public ControllerImpl (){
		moteur = new Moteur();
	}

	@Override
	public Score recupererScore() {
		return moteur.getScore();
	}

	@Override
	public String genererMessage() {
		return message;
	}

	@Override
	public boolean lancer(int zoneCiblee) {
		
		boolean resultatLancer = moteur.lancer(zoneCiblee);
		
		if (resultatLancer) {
			message = "GOAL!";
		}else {
			message = "Arrêt du tir par le gardien !";
		}
		
		return resultatLancer;

	}



}
