package pl.majster.EqApp.obliczeniaKlasy;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.IOUtils;

public class Oblicz_RawEquity {

	
	public static String dlaPLO5(String hand, String range,String gra) throws IOException {
		String [] komenda = {"java","-cp","/opt/PPTOddsOracle/ui_jar/p2.jar", "propokertools.cli.RunPQL", "select count(winsHi(PLAYER_1)) as COUNT1 \n" + 
				"from game=" +"'" +gra+"'" +", syntax='Generic',\n" + 
				"     PLAYER_1=" + "'"+ hand + "'" + ",\n" +
				"     PLAYER_2=" + "'"+ range +"'" };
		
		ProcessBuilder processBuilder = new ProcessBuilder(komenda);
		String output = IOUtils.toString(processBuilder.start().getInputStream(),StandardCharsets.UTF_8);
		
		String[]czesci = output.split(" ");
		
		String wynik = czesci[2];
		
		return wynik;
		
	}
	
	public static String dlaPLO4(String hand, String range,String gra) throws IOException {
		String [] komenda = {"java","-cp","/opt/PPTOddsOracle/ui_jar/p2.jar", "propokertools.cli.RunPQL", "select count(winsHi(PLAYER_1)) as COUNT1 \n" + 
				"from game=" +"'" +gra+"'" +", syntax='Generic',\n" + 
				"     PLAYER_1=" + "'"+ hand + "'" + ",\n" +
				"     PLAYER_2=" + "'"+ range +"'" };
		
		ProcessBuilder processBuilder = new ProcessBuilder(komenda);
		String output = IOUtils.toString(processBuilder.start().getInputStream(),StandardCharsets.UTF_8);
		
		String[]czesci = output.split(" ");
		
		String wynik = czesci[2];
		
		return wynik;
	}
	
	
	
	
}
