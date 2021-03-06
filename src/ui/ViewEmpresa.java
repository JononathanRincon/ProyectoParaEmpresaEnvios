package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class ViewEmpresa extends JFrame {

	private JPanel contentPane;
	private JTable table;


	/**
	 * Create the frame.
	 */
	public ViewEmpresa() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Empresa");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(6, 6, 438, 16);
		contentPane.add(lblNewLabel);
		
		JButton btnNuevaEmpresa = new JButton("Nueva Empresa");
		btnNuevaEmpresa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FormEmpresa formEmpresa = new FormEmpresa();
				formEmpresa.setVisible(true);
			}
		});
		btnNuevaEmpresa.setBounds(6, 34, 438, 29);
		contentPane.add(btnNuevaEmpresa);
		
		table = new JTable();
		table.setBounds(430, 75, -412, 197);
		contentPane.add(table);
	}
}
