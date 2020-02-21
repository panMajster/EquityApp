package pl.Majster.EqApp.panele;
import java.io.Serializable;

import javax.swing.JPanel;
import javax.swing.JTable;

public class StatyV2 extends JPanel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JTable tabela;
	
	String[] kolumny = {"Range","Raw EQ", "Q(45)","Q(65)","Comp Flop EQ"};
	
	public StatyV2() {
	
		
		String[][] dane = {
				
				{"50%","50", "60", "70","80"}
		};
		
		
		
		tabela = new JTable(dane, kolumny);
		tabela.setBounds(38, 12, 375, 138);
		add(tabela.getTableHeader());
		add(tabela);
		
		
		
		
		
		
	}

	
	
}
