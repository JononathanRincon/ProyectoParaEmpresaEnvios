package ui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class WinDesktop {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WinDesktop window = new WinDesktop();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WinDesktop() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnGestionarEmpresa = new JButton("Gestionar Empresa");
		btnGestionarEmpresa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewEmpresa viewEmpresa = new ViewEmpresa();
				viewEmpresa.setVisible(true);
			}
		});
		btnGestionarEmpresa.setBounds(103, 46, 229, 29);
		frame.getContentPane().add(btnGestionarEmpresa);
		
		JLabel lblSolucionesIntegrales = new JLabel("Soluciones Integrales");
		lblSolucionesIntegrales.setHorizontalAlignment(SwingConstants.CENTER);
		lblSolucionesIntegrales.setBounds(6, 18, 438, 16);
		frame.getContentPane().add(lblSolucionesIntegrales);
		
		JButton btnGestionarDepartamento = new JButton("Gestionar Departamento");
		btnGestionarDepartamento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewDepartamento viewDepartamento = new ViewDepartamento();
				viewDepartamento.setVisible(true);
			}
		});
		btnGestionarDepartamento.setBounds(103, 87, 229, 29);
		frame.getContentPane().add(btnGestionarDepartamento);
		
		JButton btnGestionarSede = new JButton("Gestionar Sede");
		btnGestionarSede.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewSede viewSede = new ViewSede();
				viewSede.setVisible(true);
			}
		});
		btnGestionarSede.setBounds(103, 130, 229, 29);
		frame.getContentPane().add(btnGestionarSede);
		
		JButton btnNewButton = new JButton("Gestionar Adminitrador");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewAdministrador viewAdministrador = new ViewAdministrador();
				viewAdministrador.setVisible(true);
			}
		});
		btnNewButton.setBounds(103, 171, 229, 29);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnGestionarEnvio = new JButton("Gestionar Envio");
		btnGestionarEnvio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewEnvio viewEnvio = new ViewEnvio();
				viewEnvio.setVisible(true);
			}
		});
		btnGestionarEnvio.setBounds(103, 212, 229, 29);
		frame.getContentPane().add(btnGestionarEnvio);
	}
}
