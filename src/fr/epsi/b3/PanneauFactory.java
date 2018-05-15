package fr.epsi.b3;

import java.awt.Color;

public class PanneauFactory implements Factory<Panneau> {

	@Override
	public Panneau creer(Color couleur) {
		return new Panneau(couleur, 0, 0);
	}

}

