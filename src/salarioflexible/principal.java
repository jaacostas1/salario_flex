package salarioflexible;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class principal extends JFrame {

	Salario calcular_s = new Salario ();
	Prestaciones calcular_p = new Prestaciones ();
	Deducciones calcular_d = new Deducciones ();
	Indemnizacion calcular_i = new Indemnizacion ();
	
	private JPanel contentPane;
	private JTextField sal;
	private JTextField flex;
	private JTextField ano_lab;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					principal frame = new principal();
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
	public principal() {
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		sal = new JTextField();
		sal.setBounds(89, 11, 86, 20);
		contentPane.add(sal);
		sal.setColumns(10);
		
		flex = new JTextField();
		flex.setBounds(125, 42, 40, 20);
		contentPane.add(flex);
		flex.setColumns(10);
		
		final JLabel mos_sal = new JLabel("");
		mos_sal.setBounds(89, 106, 76, 14);
		contentPane.add(mos_sal);
		
		final JLabel Mos_ded = new JLabel("");
		Mos_ded.setBounds(89, 131, 76, 14);
		contentPane.add(Mos_ded);
		
		final JLabel ces = new JLabel("");
		ces.setBounds(89, 156, 67, 14);
		contentPane.add(ces);
		
		final JLabel vac = new JLabel("");
		vac.setBounds(89, 181, 46, 14);
		contentPane.add(vac);
		
		final JLabel prima = new JLabel("");
		prima.setBounds(89, 206, 46, 14);
		contentPane.add(prima);
		
		final JLabel pen = new JLabel("");
		pen.setBounds(272, 106, 46, 14);
		contentPane.add(pen);
		
		
        final JLabel salud = new JLabel("");
		salud.setBounds(272, 131, 46, 14);
		contentPane.add(salud);

		final JLabel res_inden = new JLabel("");
		res_inden.setBounds(271, 156, 76, 14);
		contentPane.add(res_inden);
		
		
		
		JButton cal_sal = new JButton("Salario");
		cal_sal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				int num1 = Integer.parseInt(sal.getText());
				int num2 = Integer.parseInt(flex.getText());
				
				calcular_s.cal_salario(num1, num2);
				
				mos_sal.setText(String.valueOf(calcular_s.salario));
				
				Mos_ded.setText(String.valueOf(calcular_s.flexi));
				
			}
		});
		cal_sal.setBounds(185, 10, 102, 23);
		contentPane.add(cal_sal);
		
		
		
		JLabel lblNewLabel = new JLabel("Salario Total");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel.setBounds(0, 104, 67, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Salario Flex");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_1.setBounds(0, 129, 86, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton Prestaciones = new JButton("Prestaciones");
		Prestaciones.setFont(new Font("Tahoma", Font.PLAIN, 9));
		Prestaciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num1 = Integer.parseInt(sal.getText());
				int num2 = Integer.parseInt(flex.getText());
				
				calcular_p.cal_pres(num1, num2);
				
				ces.setText(String.valueOf(calcular_p.cesan));
				
				vac.setText(String.valueOf(calcular_p.vacac));
				
				prima.setText(String.valueOf(calcular_p.prima));
			
			
			}
		});
		Prestaciones.setBounds(185, 41, 102, 23);
		contentPane.add(Prestaciones);
		
		
		JLabel lblNewLabel_2 = new JLabel("Vacaciones");
		lblNewLabel_2.setBounds(0, 181, 67, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Cesant\u00ECas");
		lblNewLabel_3.setBounds(0, 154, 67, 14);
		contentPane.add(lblNewLabel_3);
				
		JLabel lblNewLabel_5 = new JLabel("Prima");
		lblNewLabel_5.setBounds(0, 206, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		
		 JLabel lblNewLabel_4 = new JLabel("pensi\u00F3n");
		lblNewLabel_4.setBounds(203, 106, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		
		 JLabel lblNewLabel_7 = new JLabel("salud");
		lblNewLabel_7.setBounds(203, 131, 46, 14);
		contentPane.add(lblNewLabel_7);
		
		JButton deduccion = new JButton("Deducci\u00F3n");
		deduccion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num1 = Integer.parseInt(sal.getText());
				int num2 = Integer.parseInt(flex.getText());
				
				calcular_d.cal_ded(num1, num2);
				
				salud.setText(String.valueOf(calcular_d.val_salud));
										
				pen.setText(String.valueOf(calcular_d.val_pension));
			}
			
		});
		
		deduccion.setBounds(312, 10, 102, 23);
		contentPane.add(deduccion);
		
		JLabel lblNewLabel_6 = new JLabel("Salario");
		lblNewLabel_6.setBounds(10, 14, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_8 = new JLabel("% flexibilizaci\u00F3n");
		lblNewLabel_8.setBounds(0, 45, 102, 14);
		contentPane.add(lblNewLabel_8);
		
		JButton inden = new JButton("Indemnizaci\u00F3n");
		inden.setFont(new Font("Tahoma", Font.PLAIN, 9));
		inden.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num1 = Integer.parseInt(sal.getText());
				int num2 = Integer.parseInt(ano_lab.getText());
				
				calcular_i.cal_ind(num1, num2);
				
				res_inden.setText(String.valueOf(calcular_i.valor_ind));
			
}
			
		});
		
		inden.setBounds(312, 41, 102, 23);
		contentPane.add(inden);
		
		JLabel lblNewLabel_9 = new JLabel("Indemnizaci\u00F3n");
		lblNewLabel_9.setBounds(160, 156, 102, 14);
		contentPane.add(lblNewLabel_9);
		
		
		ano_lab = new JTextField();
		ano_lab.setBounds(125, 73, 40, 20);
		contentPane.add(ano_lab);
		ano_lab.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("A\u00F1os laborados");
		lblNewLabel_10.setBounds(0, 76, 102, 14);
		contentPane.add(lblNewLabel_10);
		
			}
}
