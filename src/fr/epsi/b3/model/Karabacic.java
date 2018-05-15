package fr.epsi.b3.model;

public class Karabacic implements Personne {

	private TypePersonne typePersonne;
	private int partieCiblee;
	
	public Karabacic(int partieCiblee) {
		this.typePersonne = TypePersonne.ATTAQUANT;
		this.partieCiblee = partieCiblee;
	}
	
	@Override
	public TypePersonne getType() {
		return typePersonne;
	}

	public int getPartieCiblee() {
		return partieCiblee;
	}

}
