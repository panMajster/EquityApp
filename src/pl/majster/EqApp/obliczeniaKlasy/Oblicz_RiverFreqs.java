package pl.majster.EqApp.obliczeniaKlasy;

import java.io.IOException;

import org.apache.commons.lang3.ArrayUtils;

import pl.majster.EqApp.ObliczeniaIf.Oblicz;

public class Oblicz_RiverFreqs extends Oblicz{

	public static String twopairFreq (String hand, String range, String board, String game) throws IOException{
		
		String[] pytanie = {
		"select count(exactHandType(PLAYER_2,river,twopair)) as COUNT1 " +
		" from game="+ "'" + game + "'," +
						
		" syntax='Generic'," + 
		
		"board=" + "'" + board + "',"+
	    "PLAYER_1=" + "'" + hand + "',"+
	    "PLAYER_2=" + "'" + range + "'"
				
				
				
				
		};
				
		String [] komenda  = ArrayUtils.addAll(sciezka, pytanie); 
		String jeden = Oblicz.wykonaj(komenda);
		return jeden;
	}
	
public static String setOrBetterFreq (String hand, String range, String board, String game) throws IOException{
		
		String[] pytanie = {
		"select count(minHandType(PLAYER_2,river,trips))  as COUNT1 " +
		"from game="+ "'" + game + "'," +
						
		" syntax='Generic'," + 
		
		"board=" + "'" + board + "',"+
	    "PLAYER_1=" + "'" + hand + "',"+
	    "PLAYER_2=" + "'" + range + "'"
				
				
				
				
		};
				
		String [] komenda  = ArrayUtils.addAll(sciezka, pytanie); 
		String jeden = Oblicz.wykonaj(komenda);
		return jeden;
	}


public static String straightOrBetterFreq (String hand, String range, String board, String game) throws IOException{
	
	String[] pytanie = {
	"select count(minHandType(PLAYER_2,river,straight))  as COUNT1 " +
	"from game="+ "'" + game + "'," +
					
	" syntax='Generic'," + 
	
	"board=" + "'" + board + "',"+
    "PLAYER_1=" + "'" + hand + "',"+
    "PLAYER_2=" + "'" + range + "'"
			
			
			
			
	};
			
	String [] komenda  = ArrayUtils.addAll(sciezka, pytanie); 
	String jeden = Oblicz.wykonaj(komenda);
	return jeden;
}



public static String flushOrBetterFreq (String hand, String range, String board, String game) throws IOException{
	
	String[] pytanie = {
	"select count(minHandType(PLAYER_2,river,flush))  as COUNT1 " +
	"from game="+ "'" + game + "'," +
					
	" syntax='Generic'," + 
	
	"board=" + "'" + board + "',"+
    "PLAYER_1=" + "'" + hand + "',"+
    "PLAYER_2=" + "'" + range + "'"
			
			
			
			
	};
			
	String [] komenda  = ArrayUtils.addAll(sciezka, pytanie); 
	String jeden = Oblicz.wykonaj(komenda);
	return jeden;
}


	
public static void main (String[] args) throws IOException {
	System.out.println(Oblicz_RiverFreqs.setOrBetterFreq("JT45", "80%","KJT45", "omahahi"));
}


}
