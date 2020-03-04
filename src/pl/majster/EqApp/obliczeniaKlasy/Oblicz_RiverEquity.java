package pl.majster.EqApp.obliczeniaKlasy;

import java.io.IOException;

import org.apache.commons.lang3.ArrayUtils;

import pl.majster.EqApp.ObliczeniaIf.Oblicz;

public class Oblicz_RiverEquity extends Oblicz {
	
	
	
	public static String rangeEquity(String hand, String range, String board, String game) throws IOException {
		
		
		
		String[] pytanie =  { 
			"select count(winsHi(PLAYER_1)) as COUNT1 " +
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
	
	
	
	
	
	
	public static String vs2pEquity(String hand, String range, String board, String game) throws IOException {
		
		String[] pytanie =  { 
				"select count(winsHi(PLAYER_1)) as COUNT1 " +
			" from game="+ "'" + game + "'," +
			
			" syntax='Generic'," + 
			
			"board=" + "'" + board + "',"+
		    "PLAYER_1=" + "'" + hand + "',"+
		    "PLAYER_2=" + "'" + range + "'" +
		    
		  "  where exactHandType(PLAYER_2,river,twopair)"
				
		    
			};
		
		String [] komenda  = ArrayUtils.addAll(sciezka, pytanie); 
		String jeden = Oblicz.wykonaj(komenda);
		return jeden;
		
		
	}
	
	public static String vsSetOrBetterEq(String hand, String range, String board, String game) throws IOException {
		
		String[] pytanie =  { 
				"select count(winsHi(PLAYER_1)) as COUNT1 " +
			" from game="+ "'" + game + "'," +
			
			" syntax='Generic'," + 
			
			"board=" + "'" + board + "',"+
		    "PLAYER_1=" + "'" + hand + "',"+
		    "PLAYER_2=" + "'" + range + "'" +
		    
		  "  where minHandType(PLAYER_2,river,trips)"
				
		    
			};
		
		String [] komenda  = ArrayUtils.addAll(sciezka, pytanie); 
		String jeden = Oblicz.wykonaj(komenda);
		
		
		
		return jeden;
		
	}
	
	
public static String vsFlushOrBetterEq(String hand, String range, String board, String game) throws IOException {
		
		String[] pytanie =  { 
				"select count(winsHi(PLAYER_1)) as COUNT1 " +
			" from game="+ "'" + game + "'," +
			
			" syntax='Generic'," + 
			
			"board=" + "'" + board + "',"+
		    "PLAYER_1=" + "'" + hand + "',"+
		    "PLAYER_2=" + "'" + range + "'" +
		    
		  "  where minHandType(PLAYER_2,river,flush)"
				
		    
			};
		
		String [] komenda  = ArrayUtils.addAll(sciezka, pytanie); 
		String jeden = Oblicz.wykonaj(komenda);
		
		return jeden;
		
		
	}
	

public static String vsStraightOrBetterEq(String hand, String range, String board, String game) throws IOException {
	
	String[] pytanie =  { 
			"select count(winsHi(PLAYER_1)) as COUNT1 " +
		" from game="+ "'" + game + "'," +
		
		" syntax='Generic'," + 
		
		"board=" + "'" + board + "',"+
	    "PLAYER_1=" + "'" + hand + "',"+
	    "PLAYER_2=" + "'" + range + "'" +
	    
	  "  where minHandType(PLAYER_2,river,straight)"
			
	    
		};
	
	String [] komenda  = ArrayUtils.addAll(sciezka, pytanie); 
	String jeden = Oblicz.wykonaj(komenda);
	
		
	return jeden;
	}


	
	/*
	public static void main (String[] args) throws IOException {
		
		String x = (Oblicz_RiverEquity.rangeEquity("JT45", "80%", "J3456", "omahahi"));
		
		double liczba = Double.parseDouble(x);
		
		int i = (int) liczba;
		
		System.out.println(i);
		
		
	}
	*/
}
