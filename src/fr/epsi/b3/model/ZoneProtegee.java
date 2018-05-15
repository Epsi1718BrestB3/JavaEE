package fr.epsi.b3.model;

public enum ZoneProtegee {

	ZONE_1(1, 2, 3),
	ZONE_2(4, 5, 6),
	ZONE_3(1, 2, 4),
	ZONE_4(1, 4, 5),
	ZONE_5(1, 2, 5),
	ZONE_6(2, 4, 5),
	ZONE_7(2, 3, 6),
	ZONE_8(2, 5, 6),
	ZONE_9(3, 5, 6);
	
	private int zonePartie1;
	private int zonePartie2;
	private int zonePartie3;
	
	private ZoneProtegee(int zone1, int zone2, int zone3) {
		this.zonePartie1 = zone1;
		this.zonePartie2 = zone2;
		this.zonePartie3 = zone3;
	}

	public int getZonePartie1() {
		return zonePartie1;
	}

	public int getZonePartie2() {
		return zonePartie2;
	}

	public int getZonePartie3() {
		return zonePartie3;
	}
	
	
}
