package pl.Majster.EqApp.panele;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import pl.majster.EqApp.obliczeniaKlasy.Oblicz_CompFlops;
import pl.majster.EqApp.obliczeniaKlasy.Oblicz_Q45_100;
import pl.majster.EqApp.obliczeniaKlasy.Oblicz_Q65;
import pl.majster.EqApp.obliczeniaKlasy.Oblicz_RawEquity;

import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.Serializable;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import java.awt.Choice;

public class PanelHand extends JPanel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static JTextField hand;
	
	
	static JButton q45Btn;
	static JButton q65Btn;
	static JButton equityBtn;
	static JButton compFlopsBtn;
	static JButton wyczysc;
	
	final String uklad = "";
	
	Choice gra;
	
	static String wybranaGra;
	
	static JLabel jakaGra;
	
	
	
	public PanelHand()  {
		
		
		q45Btn = new JButton ("Q(45)");
		q45Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent click)   {
				try {
				PanelStaty.Q45_50.setText(Oblicz_Q45_100.dlaPLO4(hand.getText(), "50%", wybranaGra));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					PanelStaty.Q45_80.setText(Oblicz_Q45_100.dlaPLO4(hand.getText(), "50%", wybranaGra));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					PanelStaty.Q45_100.setText(Oblicz_Q45_100.dlaPLO4(hand.getText(), "50%", wybranaGra));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
				
			}
		});
		q45Btn.setBounds(17, 108, 84, 25);
		q65Btn = new JButton ("Q(65)");
		q65Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					PanelStaty.Q65_50.setText(Oblicz_Q65.dlaPLO4(hand.getText(), "50%", wybranaGra));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					PanelStaty.Q65_80.setText(Oblicz_Q65.dlaPLO4(hand.getText(), "50%", wybranaGra));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					PanelStaty.Q65_100.setText(Oblicz_Q65.dlaPLO4(hand.getText(), "50%", wybranaGra));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		q65Btn.setBounds(17, 145, 84, 25);
		
		equityBtn = new JButton ("Raw equity");
		equityBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					PanelStaty.HvsR50EQ.setText(Oblicz_RawEquity.dlaPLO4(hand.getText(), "50%", wybranaGra));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					PanelStaty.HvsR800EQ.setText(Oblicz_RawEquity.dlaPLO4(hand.getText(), "50%", wybranaGra));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					PanelStaty.HvsR100EQ.setText(Oblicz_RawEquity.dlaPLO4(hand.getText(), "50%", wybranaGra));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		equityBtn.setBounds(17, 182, 113, 25);
		compFlopsBtn = new JButton ("Comp flops equity");
		compFlopsBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				try {
				PanelStaty.comp_50.setText(Oblicz_CompFlops.dlaPLO4(hand.getText(), "50%", wybranaGra));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				PanelStaty.comp_80.setText(Oblicz_CompFlops.dlaPLO4(hand.getText(), "80%",wybranaGra));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				PanelStaty.comp_100.setText(Oblicz_CompFlops.dlaPLO4(hand.getText(), "x", wybranaGra));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			}
		});
		compFlopsBtn.setBounds(17, 219, 172, 25);
		
		
		wyczysc = new JButton("Clear");
		
		
		
		hand = new JTextField ("");
		hand.requestFocus();
		hand.setBounds(55, 0, 84, 19);
		setLayout(null);
		
		
		add(q45Btn);
		add(q65Btn);
		add(equityBtn);
		add(compFlopsBtn);
		add(wyczysc);
		
		
		add(hand);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent click) {
				
				PanelStaty.comp_50.setText("-");
				PanelStaty.comp_80.setText("-");
				PanelStaty.comp_100.setText("-");
				
				PanelStaty.HvsR50EQ.setText("-");
				PanelStaty.HvsR800EQ.setText("-");
				PanelStaty.HvsR100EQ.setText("-");
				
				PanelStaty.Q45_50.setText("-");
				PanelStaty.Q45_80.setText("-");
				PanelStaty.Q45_100.setText("-");
				
				PanelStaty.Q65_50.setText("-");
				PanelStaty.Q65_80.setText("-");
				PanelStaty.Q65_100.setText("-");
				
				
				
				
				
				
				
			}
		});
		btnClear.setBounds(17, 256, 113, 25);
		add(btnClear);
		
		gra = new Choice();
		gra.setBounds(17, 35, 74, 21);
		add(gra);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ok) {
				if ( gra.getSelectedItem() == "5c PLO") {
					wybranaGra = "omahahi5";
				}
				
				else if (gra.getSelectedItem() == "4c PLO") {
					wybranaGra = "omahahi";
				}
				
				jakaGra.setText(wybranaGra);
				
			}
		});
		btnOk.setBounds(110, 31, 54, 25);
		add(btnOk);
		
		jakaGra = new JLabel("-");
		jakaGra.setBounds(17, 62, 70, 15);
		add(jakaGra);
		
		gra.add("5c PLO");
		gra.add("4c PLO");
		
			
			
		
	}
}
