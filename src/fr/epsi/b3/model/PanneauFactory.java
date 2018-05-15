package fr.epsi.b3.model;

import java.awt.Color;

import fr.epsi.b3.view.Panneau;

public class PanneauFactory implements Factory<Panneau> {

	@Override
	public Panneau creer(Color couleur) {
		return new Panneau(couleur, 0, 0);
	}

}

