package pl.majster.EqApp.ObliczeniaIf;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import org.apache.commons.io.IOUtils;

public abstract class Oblicz {

	public static String [] sciezka = {"java","-cp","/opt/PPTOddsOracle/ui_jar/p2.jar",
			"propokertools.cli.RunPQL"};
	
	
	public static String wykonaj(String[] komenda) throws IOException {
		
		ProcessBuilder processBuilder = new ProcessBuilder(komenda);
		String output = IOUtils.toString(processBuilder.start().getInputStream(),StandardCharsets.UTF_8);
		String[]czesci = output.split(" ");
		String wynik = czesci[2];
		
		return wynik;
	}
	
}
