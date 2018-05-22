package fr.epsi.b3.controller;

import fr.epsi.b3.model.Score;

public interface Controller {
	public Score recupererScore();
	public String genererMessage();
	public boolean lancer(int zoneCiblee);
}
