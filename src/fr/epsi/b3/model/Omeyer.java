package fr.epsi.b3.model;

public class Omeyer implements Personne {

	private TypePersonne typePersonne;
	private ZoneProtegee zoneProtegee;

	public Omeyer(ZoneProtegee zoneProtegee) {
		typePersonne = TypePersonne.GARDIEN_DE_BUT;
		this.zoneProtegee = zoneProtegee;
	}
		
	@Override
	public TypePersonne getType() {
		// TODO Auto-generated method stub
		return typePersonne;
	}

	public ZoneProtegee getZoneProtegee() {
		return zoneProtegee;
	}
	
}
