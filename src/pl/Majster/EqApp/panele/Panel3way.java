package pl.Majster.EqApp.panele;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JTextField;
import java.awt.Choice;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import pl.majster.EqApp.obliczeniaKlasy.Oblicz3way;

import javax.swing.JTextArea;
import javax.swing.JFormattedTextField;

public class Panel3way extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField reka;
	static String wybranaGra;
	static JLabel jakaGra;
	
	
	
	public Panel3way() {
		setLayout(null);
		
		
		String wymogi = "x>34,4% => QUAL \n" + 
		"x (33,5%-34,3%) => BORDER \n" +
		"x (32%-33,4%) => vs MINR \n" +
		"x <32% => JUNK";
		
		
		
		jakaGra = new JLabel("-");
		jakaGra.setHorizontalAlignment(SwingConstants.CENTER);
		jakaGra.setSize(83, 19);
		jakaGra.setLocation(43, 97);
		add(jakaGra);
		
		reka = new JTextField();
		reka.setBounds(12, 12, 114, 19);
		add(reka);
		reka.setColumns(10);
		
		final Choice gra = new Choice();
		gra.setBounds(10, 33, 116, 21);
		add(gra);
		
		gra.add("5c PLO");
		gra.add("4c PLO");
		
		JButton btnOk = new JButton("OK");
		btnOk.setBounds(12, 60, 117, 25);
		add(btnOk);
		
		
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
		
		
		
		
		JLabel lblVs = new JLabel("vs 12%");
		lblVs.setBounds(171, 33, 70, 15);
		add(lblVs);
		
		JLabel lblVs_1 = new JLabel("vs 25%");
		lblVs_1.setBounds(270, 33, 70, 15);
		add(lblVs_1);
		
		JLabel lblVs_2 = new JLabel("vs 50%");
		lblVs_2.setBounds(352, 33, 70, 15);
		add(lblVs_2);
		
		final JLabel vs12eq = new JLabel("-");
		vs12eq.setHorizontalAlignment(SwingConstants.CENTER);
		vs12eq.setBounds(159, 65, 70, 15);
		add(vs12eq);
		
		final JLabel vs25eq = new JLabel("-");
		vs25eq.setHorizontalAlignment(SwingConstants.CENTER);
		vs25eq.setBounds(253, 65, 70, 15);
		add(vs25eq);
		
		final JLabel vs50eq = new JLabel("-");
		vs50eq.setHorizontalAlignment(SwingConstants.CENTER);
		vs50eq.setBounds(335, 65, 70, 15);
		add(vs50eq);
		
		JTextArea wymogiArea = new JTextArea();
		wymogiArea.setBounds(270, 183, 183, 80);
		add(wymogiArea);
		
		wymogiArea.setText(wymogi);
		
		
		
		
		JButton btnOblicz = new JButton("Oblicz");
		btnOblicz.setLocation(12, 215);
		btnOblicz.setSize(114, 30);
		add(btnOblicz);
		
		btnOblicz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String wyb_reka = reka.getText();
				try {
					vs12eq.setText(Oblicz3way.oblicz(wyb_reka, "12%", wybranaGra));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					vs25eq.setText(Oblicz3way.oblicz(wyb_reka, "25%", wybranaGra));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					vs50eq.setText(Oblicz3way.oblicz(wyb_reka, "50%", wybranaGra));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		
		
	}
}
