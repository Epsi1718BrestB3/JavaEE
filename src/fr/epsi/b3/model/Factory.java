package fr.epsi.b3.model;

import java.awt.Color;

public interface Factory<T> {

	public T creer(Color couleur);
	
}
