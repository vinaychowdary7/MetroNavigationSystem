package MetroNavigationSystem.maps;

import MetroNavigationSystem.functionality.MetroMap;

public class HydMetroMap extends MetroMap{

	public HydMetroMap(){
		
		city = "Hyderabad";
		
        CreatePath("nullMiyapur", "Miyapur", "red", 0);
        CreatePath("Miyapur", "JNTU college", "red", 2);
        CreatePath("JNTU college", "KPHB colony", "red", 3);
        CreatePath("KPHB colony", "KukatPally", "red", 1);
        CreatePath("KukatPally", "Dr. B.R. Ambedkar Balanagar", "red", 2);
        CreatePath("Dr. B.R. Ambedkar Balanagar", "MoosaPet", "red", 1);
        CreatePath("Moosapet", "Bharat Nagar", "red", 1);
        CreatePath("Bharat Nagar", "Erragadda", "red", 1);
        CreatePath("Erragadda", "ESI Hospital", "red", 1);
        CreatePath("ESI Hospital", "S.R Nagar", "red", 3);
        CreatePath("S.R Nagar", "Ameerpet", "red", 2);
        CreatePath("Ameerpet", "Panjagutta", "red", 1);
        CreatePath("Panjagutta", "Irrum Manzil", "red", 1);
        CreatePath("Irrum Manzil", "Khairatabad", "red", 1);
        CreatePath("Khairatabad", "Lakdi-ka-pul", "red", 2);
        CreatePath("Lakdi-ka-pul", "Assembly", "red", 1);
        CreatePath("Assembly", "Nampally", "red", 3);
        CreatePath("Nampally", "Gandhi Bhavan", "red", 4);
        CreatePath("Gandhi Bhavan", "Osmania Medical College", "red", 1);
        CreatePath("Osmania Medical College", "MG Bus Station", "red", 1);
        CreatePath("MG Bus Station", "MalakPet", "red", 5);
        CreatePath("MalakPet", "New Market", "red", 4);
        CreatePath("New Market", "Musarambagh", "red", 1);
        CreatePath("Musarambagh", "Dilsukhnagar", "red", 1);
        CreatePath("Dilsukhnagar", "Chaitanyapuri", "red", 1);
        CreatePath("Chaitanyapuri", "Victoria Memorial", "red", 1);
        CreatePath("Victoria Memorial", "LB Nagar", "red", 1);
        CreatePath("LB Nagar", "nullLBnagar", "red", 1);
        CreatePath("NullNagole", "Nagole", "blue", 1);
        CreatePath("Nagole", "Uppal", "blue", 1);
        CreatePath("Uppal", "Stadium", "blue", 1);
        CreatePath("Stadium", "NGRI", "blue", 1);
        CreatePath("NGRI", "Habsiguda", "blue", 1);
        CreatePath("Habsiguda", "Tarnaka", "blue", 1);
        CreatePath("Tarnaka", "Mettuguda", "blue", 1);
        CreatePath("Mettuguda", "Secunderabad East", "blue", 1);
        CreatePath("Secunderabad East", "Parad Ground", "blue", 1);
        CreatePath("Parad Ground", "Paradise", "blue", 1);
        CreatePath("Paradise", "Rasoolpura", "blue", 1);
        CreatePath("Rasoolpura", "Prakash Nagar", "blue", 1);
        CreatePath("Prakash Nagar", "Begumpet", "blue", 1);
        CreatePath("Begumpet", "Ameerpet", "blue", 1);
        CreatePath("Ameerpet", "Madhura Nagar", "blue", 1);
        CreatePath("Madhura Nagar", "Yusufguda", "blue", 1);
        CreatePath("Yusufguda", "Road No 5 Jubilee Hills", "blue", 1);
        CreatePath("Road No 5 Jubilee Hills", "Jubilee Check Post", "blue", 1);
        CreatePath("Jubilee Check Post", "Peddamagudi", "blue", 1);
        CreatePath("Peddamagudi", "Madhapur", "blue", 1);
        CreatePath("Madhapur", "Durgam Cheruvu", "blue", 1);
        CreatePath("Durgam Cheruvu", "HITEC City", "blue", 1);
        CreatePath("HITEC City", "Raidurg", "blue", 1);
        CreatePath("Raidurg", "NullRaidurg", "blue", 1);
        CreatePath("NullParade", "Parade Ground", "green", 1); // Corrected the station name
        CreatePath("Parade Ground", "Secunderabad west", "green", 1);
        CreatePath("Secunderabad west", "Musheerabad", "green", 1);
        CreatePath("Musheerabad", "RTC X Roads", "green", 1);
        CreatePath("RTC X Roads", "ChikkadPally", "green", 1);
        CreatePath("ChikkadPally", "Narayanaguda", "green", 1);
        CreatePath("Narayanaguda", "Sultan Bazaar", "green", 1);
        CreatePath("Sultan Bazaar", "MG Bus Station", "green", 1);
        CreatePath("MG Bus Station", "NullMG Bus Station", "green", 1);
        
        setPlatforms();
       
	}
	
	public static void main(String args[]) {
		
		HydMetroMap hyd = new HydMetroMap();
		hyd.path("sultan ..,,,---bazaar", "lb nagar");
	}

	
}
