package fr.epsi.b3.controller;

import fr.epsi.b3.model.Moteur;
import fr.epsi.b3.model.Score;

public class ControllerImpl implements Controller {
	private Moteur moteur;
	 public ControllerImpl (){
		 moteur = new Moteur();
	 }
	
	@Override
	public Score recupererScore() {
		return moteur.getScore();
	}

	@Override
	public String genererMessage() {
		String message = null;
		
		return null;
	}

	@Override
	public boolean lancer(int zoneCiblee) {
		
		return moteur.lancer(zoneCiblee);

	}

	

}
