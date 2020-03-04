package pl.Majster.EqApp.panele;

import javax.swing.JPanel;

public class PanelHU extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public PanelHU() {
		PanelHand hand = new PanelHand();
		hand.setBounds(0, 5, 169, 308);
		
		PanelStaty staty = new PanelStaty();
		staty.setBounds(170, 5, 541, 159);
		setLayout(null);
		
		add(hand);
		
		add(staty);
		
		
	}

	
	
}
