package pl.majster.EqApp.obliczeniaKlasy;

import java.io.IOException;

import org.apache.commons.lang3.ArrayUtils;

import pl.majster.EqApp.ObliczeniaIf.*;

public class Oblicz3way extends Oblicz {

	
	public static String oblicz(String hand, String range,String gra) throws IOException {
		
		
		
		
		String [] pytanie  = { 
				"select count(winsHi(PLAYER_1)) as COUNT1 " + 
				"from game="+ "'" + gra +"'"+ ", syntax='Generic'," + 
				"PLAYER_1="+ "'" + hand + "'" +
				
				
				",PLAYER_2=" + "'" + range + "'"+
				
				
				",PLAYER_3='60%!3%'"
				
		};
		
		
		String [] komenda  = ArrayUtils.addAll(sciezka, pytanie); 
		String jeden = Oblicz.wykonaj(komenda);
		return jeden;
	}
	
	public static void main (String[] args) throws IOException {
		
		System.out.println (Oblicz3way.oblicz("KJT9", "20%", "omahahi"));
	}
	
}
