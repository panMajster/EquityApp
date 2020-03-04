package pl.Majster.EqApp.panele;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import pl.majster.EqApp.obliczeniaKlasy.Oblicz_RiverEquity;
import pl.majster.EqApp.obliczeniaKlasy.Oblicz_RiverFreqs;

import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JTable;


public class PanelRiver extends JPanel {

		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		JLabel riverRange;
		JLabel turnRange;
		JLabel flopRange;
	
		JLabel startingRange;
	
	
		JLabel eqVsRange;
		JLabel eqVs2p;
		JLabel eqVsSetOrBetter;
		private JTextField textField;
		private JTextField textField_1;
		private JTextField textField_2;
		private JTextField textField_3;
		private JTextField boardField;
		private JTextField handField;
		
		private String reka;
		private String stol;
		
		
		static String gra;
		private JTable tabela;
		
		
		
		
		public PanelRiver() {
			
			riverRange = new JLabel("river range");
			riverRange.setBounds(12, 230, 78, 15);
			turnRange = new JLabel("turn");
			turnRange.setBounds(102, 230, 104, 15);
			flopRange = new JLabel("flop");
			flopRange.setBounds(156, 230, 78, 15);
			startingRange = new JLabel("starting");
			startingRange.setBounds(218, 230, 57, 15);
			setLayout(null);
			
			
			
			add(riverRange);
			add(turnRange);
			add(flopRange);
			add(startingRange);
			
			textField = new JTextField();
			textField.setBounds(12, 257, 50, 19);
			add(textField);
			textField.setColumns(10);
			
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(74, 257, 50, 19);
			add(textField_1);
			
			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(156, 257, 50, 19);
			add(textField_2);
			
			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(228, 257, 50, 19);
			add(textField_3);
			
			boardField = new JTextField();
			boardField.setBounds(92, 12, 114, 19);
			add(boardField);
			boardField.setColumns(10);
			
			JLabel lblBoard = new JLabel("Board");
			lblBoard.setBounds(20, 14, 70, 15);
			add(lblBoard);
			
			JLabel lblHand = new JLabel("Hand");
			lblHand.setBounds(20, 41, 70, 15);
			add(lblHand);
			
			handField = new JTextField();
			handField.setColumns(10);
			handField.setBounds(92, 39, 114, 19);
			add(handField);
			
			
			final DefaultTableModel model = new DefaultTableModel();
			model.addColumn("");
			model.addColumn("Equity");
			model.addColumn("Frequency");
			
			
			
			tabela = new JTable(model);
			tabela.setBounds(12, 121, 393, 97);
			
			
			add(tabela);
			
			
			
			
			JButton btnOblicz = new JButton("Oblicz");
			btnOblicz.addActionListener(new ActionListener() {
				
				
				
				
				public void actionPerformed(ActionEvent arg0) {
				
					reka = handField.getText();
					stol = boardField.getText();
					tabela.removeAll();
					
					
					try {
						
						model.addRow(new Object[] {"vs range", Oblicz_RiverEquity.rangeEquity			(reka, "80%",stol, gra), });
												
						model.addRow(new Object[] {"vs 2p", Oblicz_RiverEquity.vs2pEquity					(reka, "80%",stol, gra),Oblicz_RiverFreqs.twopairFreq(reka, "80%", stol, gra)});
						model.addRow(new Object[] {"vs set+", Oblicz_RiverEquity.vsSetOrBetterEq			(reka, "80%",stol, gra),Oblicz_RiverFreqs.setOrBetterFreq(reka, "80%", stol, gra)});
						model.addRow(new Object[] {"vs straight+", Oblicz_RiverEquity.vsStraightOrBetterEq	(reka, "80%",stol, gra),Oblicz_RiverFreqs.straightOrBetterFreq(reka, "80%", stol, gra)});
						model.addRow(new Object[] {"vs flush+", Oblicz_RiverEquity.vsFlushOrBetterEq		(reka, "80%",stol, gra),Oblicz_RiverFreqs.flushOrBetterFreq(reka, "80%", stol, gra)});
						
						
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
										
					
					
					
				}
			});
			btnOblicz.setBounds(12, 68, 117, 25);
			add(btnOblicz);
			
			JRadioButton radPLO5 = new JRadioButton("PLO5");
			radPLO5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					gra = "omahahi5";
				}
			});
			radPLO5.setActionCommand("PLO5");
			radPLO5.setSelected(true);
			radPLO5.setBounds(277, 10, 92, 23);
			add(radPLO5);
			
			JRadioButton radPLO4 = new JRadioButton("PLO4");
			radPLO4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					gra = "omahahi";
				}
			});
			radPLO4.setActionCommand("PLO4");
			radPLO4.setBounds(277, 37, 92, 23);
			add(radPLO4);
			
			ButtonGroup grupa = new ButtonGroup();
			grupa.add(radPLO4);
			grupa.add(radPLO5);
			
			
			
			
			
			
		
		
		}
}
