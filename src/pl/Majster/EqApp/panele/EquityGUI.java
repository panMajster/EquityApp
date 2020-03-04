package pl.Majster.EqApp.panele;
import java.io.Serializable;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import org.apache.commons.lang3.Validate;





public class EquityGUI implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JFrame ramka;
	JTabbedPane tabs;
	
	
	
	public static void main (String[] args) {
		EquityGUI gui = new EquityGUI();
		gui.zrobGui();
	}
	
	
	public void zrobGui() {
		ramka = new JFrame();
		ramka.setSize(812,375);
		ramka.setVisible(true);
		ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ramka.getContentPane().setLayout(null);
	
		
		
		tabs = new JTabbedPane();
		tabs.setBounds(12, 0, 812, 338);
		
		PanelHU hu = new PanelHU();
		Panel3way threeway = new Panel3way();
		PanelRiver river = new PanelRiver();
		
		
		tabs.add("HU",hu);
		tabs.add("3W", threeway);
		tabs.add("River", river);
		
		ramka.getContentPane().add(tabs);
		
		/*
		PanelStaty staty = new PanelStaty();
		staty.setBounds(207, 10, 571, 288);
		ramka.getContentPane().add(staty);
		
	
		
		
		
		PanelHand reka = new PanelHand();
		reka.setBounds(10, 10, 185, 313);
		ramka.getContentPane().add(reka);
		
		*/
		
		
		
	}
}
