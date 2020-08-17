package ui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import db.DbSede;
import pojo.Envio;
import pojo.Sede;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormSede extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public FormSede() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 356);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCrearSede = new JLabel("Crear Sede");
		lblCrearSede.setHorizontalAlignment(SwingConstants.CENTER);
		lblCrearSede.setBounds(12, 6, 438, 16);
		contentPane.add(lblCrearSede);
		
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
		
		JLabel label_3 = new JLabel("Direccion");
		label_3.setBounds(12, 142, 61, 16);
		contentPane.add(label_3);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(12, 158, 438, 26);
		contentPane.add(textField_2);
		
		JLabel label_4 = new JLabel("Telefono");
		label_4.setBounds(12, 196, 61, 16);
		contentPane.add(label_4);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(12, 211, 438, 26);
		contentPane.add(textField_3);
		
		JLabel lblDepartamento = new JLabel("Departamento");
		lblDepartamento.setBounds(12, 246, 200, 16);
		contentPane.add(lblDepartamento);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(12, 270, 438, 26);
		contentPane.add(textField_4);
		
		JButton button = new JButton("Guardar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					Sede sede = new Sede();
					sede.setId( textField.getText() );
					sede.setNombre( textField_1.getText() );
					sede.setDireccion(textField_2.getText());
					sede.setTelefono( textField_3.getText() );
					sede.setIdDepartamento( textField_4.getText() );
					
					DbSede dbSede = new DbSede();
					dbSede.insert(sede);
					
					JOptionPane.showMessageDialog(null, "Se ha guardado con exito", "Mensaje de confirmacion", JOptionPane.INFORMATION_MESSAGE);
				}catch (Exception er) {
					JOptionPane.showMessageDialog(null, "Erro al guardar", "Mensaje de confirmacion", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		button.setBounds(6, 300, 117, 29);
		contentPane.add(button);
			
		JFrame jFrame = this;
		JButton button_1 = new JButton("Cancelar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jFrame.setVisible(false);
				jFrame.dispose();
			}
		});
		button_1.setBounds(333, 300, 117, 29);
		contentPane.add(button_1);
	}

}
