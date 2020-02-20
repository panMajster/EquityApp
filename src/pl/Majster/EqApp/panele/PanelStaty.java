package pl.Majster.EqApp.panele;



import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class PanelStaty extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	static JLabel Q65;
	static JLabel Q45;
	
	
	static JLabel Q45_50;
	static JLabel Q45_80;
	static JLabel Q45_100;
	
	static JLabel Q65_50;
	static JLabel Q65_100;
	static JLabel Q65_80;
	
	static JLabel HvREq;
	
	
	
	static JLabel HvsR50EQ;
	static JLabel HvsR800EQ;
	static JLabel HvsR100EQ;
	
	static JLabel comp_50;
	static JLabel comp_80;
	static JLabel comp_100;
	
	
	
	static	JLabel compFlopsEq;
	
	JButton wyczysc;
	JButton skopiuj;
	

	
	
	public PanelStaty() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{62, 115, 115, 115, 134, 0};
		gridBagLayout.rowHeights = new int[]{51, 36, 36, 36, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		HvREq = new JLabel ("HvR Equity");
		GridBagConstraints gbc_HvREq = new GridBagConstraints();
		gbc_HvREq.insets = new Insets(0, 0, 5, 5);
		gbc_HvREq.gridx = 1;
		gbc_HvREq.gridy = 0;
		add(HvREq, gbc_HvREq);
		Q45 = new JLabel ("Q(45)");
		
		
		GridBagConstraints gbc_Q45 = new GridBagConstraints();
		gbc_Q45.insets = new Insets(0, 0, 5, 5);
		gbc_Q45.gridx = 2;
		gbc_Q45.gridy = 0;
		add(Q45, gbc_Q45);
		Q65 = new JLabel("Q(65)");
		GridBagConstraints gbc_Q65 = new GridBagConstraints();
		gbc_Q65.insets = new Insets(0, 0, 5, 5);
		gbc_Q65.gridx = 3;
		gbc_Q65.gridy = 0;
		add(Q65, gbc_Q65);
		
		compFlopsEq = new JLabel ("Comp flop equity");
		GridBagConstraints gbc_compFlopsEq = new GridBagConstraints();
		gbc_compFlopsEq.insets = new Insets(0, 0, 5, 0);
		gbc_compFlopsEq.gridx = 4;
		gbc_compFlopsEq.gridy = 0;
		add(compFlopsEq, gbc_compFlopsEq);
		
		JLabel label = new JLabel("50%");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 0;
		gbc_label.gridy = 1;
		add(label, gbc_label);
		
		HvsR50EQ = new JLabel("-");
		GridBagConstraints gbc_HvsR50EQ = new GridBagConstraints();
		gbc_HvsR50EQ.insets = new Insets(0, 0, 5, 5);
		gbc_HvsR50EQ.gridx = 1;
		gbc_HvsR50EQ.gridy = 1;
		add(HvsR50EQ, gbc_HvsR50EQ);
		
		Q45_50 = new JLabel("-");
		GridBagConstraints gbc_Q45_50 = new GridBagConstraints();
		gbc_Q45_50.insets = new Insets(0, 0, 5, 5);
		gbc_Q45_50.gridx = 2;
		gbc_Q45_50.gridy = 1;
		add(Q45_50, gbc_Q45_50);
		
		Q65_50 = new JLabel("-");
		GridBagConstraints gbc_Q65_50 = new GridBagConstraints();
		gbc_Q65_50.insets = new Insets(0, 0, 5, 5);
		gbc_Q65_50.gridx = 3;
		gbc_Q65_50.gridy = 1;
		add(Q65_50, gbc_Q65_50);
		
		comp_50 = new JLabel("-");
		GridBagConstraints gbc_comp_50 = new GridBagConstraints();
		gbc_comp_50.insets = new Insets(0, 0, 5, 0);
		gbc_comp_50.gridx = 4;
		gbc_comp_50.gridy = 1;
		add(comp_50, gbc_comp_50);
		
		JLabel label_1 = new JLabel("80%");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 0;
		gbc_label_1.gridy = 2;
		add(label_1, gbc_label_1);
		
		HvsR800EQ = new JLabel("-");
		GridBagConstraints gbc_HvsR800EQ = new GridBagConstraints();
		gbc_HvsR800EQ.insets = new Insets(0, 0, 5, 5);
		gbc_HvsR800EQ.gridx = 1;
		gbc_HvsR800EQ.gridy = 2;
		add(HvsR800EQ, gbc_HvsR800EQ);
		
		Q45_80 = new JLabel("-");
		GridBagConstraints gbc_Q45_80 = new GridBagConstraints();
		gbc_Q45_80.insets = new Insets(0, 0, 5, 5);
		gbc_Q45_80.gridx = 2;
		gbc_Q45_80.gridy = 2;
		add(Q45_80, gbc_Q45_80);
		
		Q65_80 = new JLabel("-");
		GridBagConstraints gbc_Q65_80 = new GridBagConstraints();
		gbc_Q65_80.insets = new Insets(0, 0, 5, 5);
		gbc_Q65_80.gridx = 3;
		gbc_Q65_80.gridy = 2;
		add(Q65_80, gbc_Q65_80);
		
		comp_80 = new JLabel("-");
		GridBagConstraints gbc_comp_80 = new GridBagConstraints();
		gbc_comp_80.insets = new Insets(0, 0, 5, 0);
		gbc_comp_80.gridx = 4;
		gbc_comp_80.gridy = 2;
		add(comp_80, gbc_comp_80);
		
		JLabel label_2 = new JLabel("100%");
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.insets = new Insets(0, 0, 0, 5);
		gbc_label_2.gridx = 0;
		gbc_label_2.gridy = 3;
		add(label_2, gbc_label_2);
		
		HvsR100EQ = new JLabel("-");
		GridBagConstraints gbc_HvsR100EQ = new GridBagConstraints();
		gbc_HvsR100EQ.insets = new Insets(0, 0, 0, 5);
		gbc_HvsR100EQ.gridx = 1;
		gbc_HvsR100EQ.gridy = 3;
		add(HvsR100EQ, gbc_HvsR100EQ);
		
		Q45_100 = new JLabel("-");
		GridBagConstraints gbc_Q45_100 = new GridBagConstraints();
		gbc_Q45_100.insets = new Insets(0, 0, 0, 5);
		gbc_Q45_100.gridx = 2;
		gbc_Q45_100.gridy = 3;
		add(Q45_100, gbc_Q45_100);
		
		Q65_100 = new JLabel("-");
		GridBagConstraints gbc_Q65_100 = new GridBagConstraints();
		gbc_Q65_100.insets = new Insets(0, 0, 0, 5);
		gbc_Q65_100.gridx = 3;
		gbc_Q65_100.gridy = 3;
		add(Q65_100, gbc_Q65_100);
		
		comp_100 = new JLabel("-");
		GridBagConstraints gbc_comp_100 = new GridBagConstraints();
		gbc_comp_100.gridx = 4;
		gbc_comp_100.gridy = 3;
		add(comp_100, gbc_comp_100);
	}
}
