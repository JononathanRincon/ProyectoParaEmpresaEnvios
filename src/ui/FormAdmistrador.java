package ui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import db.DbAdministrador;
import pojo.Administrador;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormAdmistrador extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public FormAdmistrador() {
		setBounds(100, 100, 450, 475);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCrearAdministrador = new JLabel("Crear Administrador");
		lblCrearAdministrador.setHorizontalAlignment(SwingConstants.CENTER);
		lblCrearAdministrador.setBounds(12, 6, 438, 16);
		contentPane.add(lblCrearAdministrador);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(12, 34, 61, 16);
		contentPane.add(lblId);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(12, 51, 438, 26);
		contentPane.add(textField);
		
		JLabel label_2 = new JLabel("Nombre");
		label_2.setBounds(12, 89, 61, 16);
		contentPane.add(label_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(12, 104, 438, 26);
		contentPane.add(textField_1);
		
		JLabel lblCedula = new JLabel("Cedula");
		lblCedula.setBounds(12, 142, 61, 16);
		contentPane.add(lblCedula);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(12, 158, 438, 26);
		contentPane.add(textField_2);
		
		JLabel lblFechaNacimiento = new JLabel("Fecha Nacimiento");
		lblFechaNacimiento.setBounds(12, 196, 226, 16);
		contentPane.add(lblFechaNacimiento);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(12, 211, 438, 26);
		contentPane.add(textField_3);
		
		JLabel lblContrasea = new JLabel("contraseña");
		lblContrasea.setBounds(12, 246, 122, 16);
		contentPane.add(lblContrasea);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(12, 270, 438, 26);
		contentPane.add(textField_4);
		
		JButton button = new JButton("Guardar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					Administrador administrador = new Administrador();
					administrador.setId(  textField.getText() );
					administrador.setNombre( textField_1.getText() );
					administrador.setCedula( textField_2.getText() );
					administrador.setPass( textField_4.getText() );
					administrador.setTelefono( textField_5.getText() );
					administrador.setIdSede( textField_6.getText() );
					
					DbAdministrador dbAdministrador = new DbAdministrador();
					dbAdministrador.insert(administrador);
					
					JOptionPane.showMessageDialog(null, "Se ha guardado con exito", "Mensaje de confirmacion", JOptionPane.INFORMATION_MESSAGE);
				}catch (Exception er) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Erro al guardar", "Mensaje de confirmacion", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		button.setBounds(6, 418, 117, 29);
		contentPane.add(button);
						
		JFrame jFrame = this;
		JButton button_1 = new JButton("Cancelar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jFrame.setVisible(false);
				jFrame.dispose();
			}
		});
		button_1.setBounds(327, 418, 117, 29);
		contentPane.add(button_1);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(12, 299, 226, 16);
		contentPane.add(lblTelefono);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(12, 314, 438, 26);
		contentPane.add(textField_5);
		
		JLabel lblSede = new JLabel("Sede");
		lblSede.setBounds(12, 353, 226, 16);
		contentPane.add(lblSede);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(12, 368, 438, 26);
		contentPane.add(textField_6);
	}

}
