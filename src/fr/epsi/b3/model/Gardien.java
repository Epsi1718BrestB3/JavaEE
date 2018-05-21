package fr.epsi.b3.model;

public class Gardien implements Personne {

	private TypePersonne typePersonne;
	private ZoneProtegee zoneProtegee;

	public Gardien() {
		typePersonne = TypePersonne.GARDIEN_DE_BUT;
	}
		
	@Override
	public TypePersonne getType() {
		return typePersonne;
	}
	
	public void setZoneProtegee(int zoneProtegee) {
		switch(zoneProtegee) {
		case 1: 
			this.zoneProtegee = ZoneProtegee.ZONE_1;
			break;
		case 2: 
			this.zoneProtegee = ZoneProtegee.ZONE_2;
			break;
		case 3: 
			this.zoneProtegee = ZoneProtegee.ZONE_3;
			break;
		case 4: 
			this.zoneProtegee = ZoneProtegee.ZONE_4;
			break;
		case 5: 
			this.zoneProtegee = ZoneProtegee.ZONE_5;
			break;
		case 6: 
			this.zoneProtegee = ZoneProtegee.ZONE_6;
			break;
		case 7: 
			this.zoneProtegee = ZoneProtegee.ZONE_7;
			break;
		case 8: 
			this.zoneProtegee = ZoneProtegee.ZONE_8;
			break;
		default: 
			this.zoneProtegee = ZoneProtegee.ZONE_9;
			break;
		}
	}
	
	public void setZoneProtegee(ZoneProtegee zoneProtegee) {
		this.zoneProtegee = zoneProtegee;
	}

	public ZoneProtegee getZoneProtegee() {
		return zoneProtegee;
	}
	
}
