package applet;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ItemEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ItemListener;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class eventvt extends JFrame {

	private JPanel contentPane;
	JRadioButton rdbtnNewRadioButton,rdbtnNewRadioButton_1,rdbtnNewRadioButton_2;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					eventvt frame = new eventvt();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public eventvt() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 518, 377);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		 rdbtnNewRadioButton = new JRadioButton("r1");
		 buttonGroup_1.add(rdbtnNewRadioButton);
		 
		 rdbtnNewRadioButton.addItemListener(new ItemListener() {
		 	public void itemStateChanged(ItemEvent arg0) {
		 	 setBackground(Color.red);
		 	}
		 });
		
		 rdbtnNewRadioButton_1 = new JRadioButton("r2");
		buttonGroup.add(rdbtnNewRadioButton_1);
		 rdbtnNewRadioButton_2 = new JRadioButton("r3");
		buttonGroup.add(rdbtnNewRadioButton_2);
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(56)
					.addComponent(rdbtnNewRadioButton)
					.addGap(42)
					.addComponent(rdbtnNewRadioButton_1)
					.addGap(44)
					.addComponent(rdbtnNewRadioButton_2)
					.addContainerGap(95, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(81)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnNewRadioButton)
						.addComponent(rdbtnNewRadioButton_1)
						.addComponent(rdbtnNewRadioButton_2))
					.addContainerGap(201, Short.MAX_VALUE))
		);contentPane.setLayout(gl_contentPane);}
		public void itemStateChanged(ItemEvent e) {
			
		
	}
}
