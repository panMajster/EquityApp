package pl.majster.EqApp.obliczeniaKlasy;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.IOUtils;

import pl.Majster.EqApp.panele.PanelStaty;



public class Oblicz_Q65 {

	
	
	public static String dlaPLO5(String hand, String range,String gra) throws IOException {
		String [] komenda = {"java","-cp","/opt/PPTOddsOracle/ui_jar/p2.jar", "propokertools.cli.RunPQL", "select count(minHVREquity(PLAYER_1,flop,0.65))  as COUNT1 \n" + 
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
		String [] komenda = {"java","-cp","/opt/PPTOddsOracle/ui_jar/p2.jar", "propokertools.cli.RunPQL", "select count(minHVREquity(PLAYER_1,flop,0.65))  as COUNT1 \n" + 
				"from game=" +"'" +gra+"'" +", syntax='Generic',\n" + 
				"     PLAYER_1=" + "'"+ hand + "'" + ",\n" +
				"     PLAYER_2=" + "'"+ range +"'" };
		
		ProcessBuilder processBuilder = new ProcessBuilder(komenda);
		String output = IOUtils.toString(processBuilder.start().getInputStream(),StandardCharsets.UTF_8);
		
		String[]czesci = output.split(" ");
		
		String wynik = czesci[2];
		
		return wynik;
		
		
	}
		/*
	public static void main (String [] args) throws IOException {
		Oblicz_Q65 jeden = new Oblicz_Q65();
		
		
		
		
		System.out.println("Wynik to "+ jeden.dlaPLO4("AA22", "50%"));
		System.out.println("Wynik to "+ jeden.dlaPLO4("AA22", "80%"));
		System.out.println("Wynik to "+ jeden.dlaPLO4("AA22", "x"));
	}
	*/
}
