package fr.epsi.b3.model;

public class Attaquant implements Personne {

	private TypePersonne typePersonne;
	private int precision;
	
	public Attaquant(int precision) {
		this.typePersonne = TypePersonne.ATTAQUANT;
		this.precision = precision;
	}
	
	@Override
	public TypePersonne getType() {
		return typePersonne;
	}
	
	public int getPrecision() {
		return precision;
	}
}
