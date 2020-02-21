package pl.majster.EqApp.obliczeniaKlasy;

import java.io.IOException;

import org.apache.commons.lang3.ArrayUtils;

import pl.majster.EqApp.ObliczeniaIf.Oblicz;

public class Oblicz_CompFlops extends Oblicz {
	
	
	public static String dlaPLO4(String hand, String range,String gra) throws IOException {
		String [] pytanie = {		
				
				"select count(winsHi(PLAYER_1)) as COUNT1 \n" + 
				"from game=" +"'" +gra+"'" + ", syntax='Generic',"  + "board='[K-T][9-7][8-5]',\n" + 
				"     PLAYER_1=" + "'"+ hand + "'" + ",\n" +
				"     PLAYER_2=" + "'"+ range +"'" 	};
		
		
		String [] komenda  = ArrayUtils.addAll(sciezka, pytanie); 
		String jeden = Oblicz.wykonaj(komenda);
		return jeden;
	}
	
	
	
	
}
