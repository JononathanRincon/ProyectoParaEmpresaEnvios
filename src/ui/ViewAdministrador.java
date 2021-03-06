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

public class ViewAdministrador extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public ViewAdministrador() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAdmistrador = new JLabel("Admistrador");
		lblAdmistrador.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdmistrador.setBounds(6, 6, 438, 16);
		contentPane.add(lblAdmistrador);
		
		JButton btnNuevoAdmistrador = new JButton("Nuevo Admistrador");
		btnNuevoAdmistrador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FormAdmistrador formAdmistrador = new FormAdmistrador();
				formAdmistrador.setVisible(true);
			}
		});
		btnNuevoAdmistrador.setBounds(6, 34, 438, 29);
		contentPane.add(btnNuevoAdmistrador);
		
		table = new JTable();
		table.setBounds(430, 75, -412, 197);
		contentPane.add(table);
	}

}
