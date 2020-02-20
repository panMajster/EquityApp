package pl.majster.EqApp.obliczenia;

public class Obliczenia {

	double Q45_50;
	double Q45_80;
	double Q45_100;
	
	double Q65_50;
	double Q65_80;
	double Q65_100;
	
	double rawEq_50;
	double rawEq_80;
	double rawEq_100;
	
	double compFlopEq;
	
	static String polozenie = "/opt/PPTOddsOracle/ui_jar/p2.jar";
	static String[] komenda =  {"java","-cp", polozenie , "propokertools.cli.RunPQL"};
	
	
	
	
	public double oblicz() {
		
		String[] pytanie =  {"select count(minHVREquity(PLAYER_1,flop,0.45))  as COUNT1 \n" + 
				"from game='omahahi5', syntax='Generic',\n" + 
				"     PLAYER_1='JT456',\n" + 
				"     PLAYER_2='50%'"};
		
		
		
		return Q45_50;
	
		
	}
	
}
