package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import db.DbEmpresa;
import pojo.Empresa;

public class FormEmpresa extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;


	/**
	 * Create the frame.
	 */
	public FormEmpresa() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 364);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCrearEmpresa = new JLabel("Crear Empresa");
		lblCrearEmpresa.setHorizontalAlignment(SwingConstants.CENTER);
		lblCrearEmpresa.setBounds(6, 6, 438, 16);
		contentPane.add(lblCrearEmpresa);
		
		JLabel lblNit = new JLabel("NIT");
		lblNit.setBounds(6, 34, 61, 16);
		contentPane.add(lblNit);
		
		textField = new JTextField();
		textField.setBounds(6, 51, 438, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(6, 89, 61, 16);
		contentPane.add(lblNombre);
		
		textField_1 = new JTextField();
		textField_1.setBounds(6, 104, 438, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setBounds(6, 142, 61, 16);
		contentPane.add(lblDireccion);
		
		textField_2 = new JTextField();
		textField_2.setBounds(6, 158, 438, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(6, 196, 61, 16);
		contentPane.add(lblTelefono);
		
		textField_3 = new JTextField();
		textField_3.setBounds(6, 211, 438, 26);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setBounds(6, 246, 61, 16);
		contentPane.add(lblEstado);
		
		textField_4 = new JTextField();
		textField_4.setBounds(6, 270, 438, 26);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					Empresa empresa = new Empresa();
					empresa.setNit( textField.getText() );
					empresa.setNombre( textField_1.getText()  );
					empresa.setDireccion( textField_2.getText() );
					empresa.setTelefono( textField_3.getText()  );
					empresa.setEstado(textField_4.getText() );
					
					DbEmpresa dbEmpresa = new DbEmpresa();
					dbEmpresa.insert(empresa);
					JOptionPane.showMessageDialog(null, "Se ha guardado con exito", "Mensaje de confirmacion", JOptionPane.INFORMATION_MESSAGE);					
					// se ha creado cone xitp
				}catch (Exception er) {
					JOptionPane.showMessageDialog(null, "Erro al guardar", "Mensaje de confirmacion", JOptionPane.INFORMATION_MESSAGE);
				}
				
			}
		});
		btnGuardar.setBounds(0, 300, 117, 29);
		contentPane.add(btnGuardar);
		
		JFrame jFrame = this;
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jFrame.setVisible(false);
				jFrame.dispose();
			}
		});
		btnCancelar.setBounds(327, 300, 117, 29);
		contentPane.add(btnCancelar);
	}
}
