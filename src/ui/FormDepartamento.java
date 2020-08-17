package ui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.xml.soap.Detail;

import db.DbDepartamento;
import pojo.Departamento;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormDepartamento extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	/**
	 * Create the frame.
	 */
	public FormDepartamento() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 257);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCrearDepartemento = new JLabel("Crear Departemento");
		lblCrearDepartemento.setHorizontalAlignment(SwingConstants.CENTER);
		lblCrearDepartemento.setBounds(12, 6, 438, 16);
		contentPane.add(lblCrearDepartemento);
		
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
		
		JLabel lblEmpresa = new JLabel("Empresa");
		lblEmpresa.setBounds(12, 142, 61, 16);
		contentPane.add(lblEmpresa);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(12, 158, 438, 26);
		contentPane.add(textField_2);
		
		JButton button = new JButton("Guardar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					Departamento departamento = new Departamento();
					departamento.setId( textField.getText() );
					departamento.setNombre( textField_1.getText() );
					departamento.setIdEmpresa( textField_2.getText() );
					
					DbDepartamento dbDepartamento = new DbDepartamento();
					dbDepartamento.insert(departamento);
					
					JOptionPane.showMessageDialog(null, "Se ha guardado con exito", "Mensaje de confirmacion", JOptionPane.INFORMATION_MESSAGE);
				}catch (Exception er) {
					JOptionPane.showMessageDialog(null, "Erro al guardar", "Mensaje de confirmacion", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		button.setBounds(6, 196, 117, 29);
		contentPane.add(button);
						
		JFrame jFrame = this;
		JButton button_1 = new JButton("Cancelar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jFrame.setVisible(false);
				jFrame.dispose();
			}
		});
		button_1.setBounds(327, 196, 117, 29);
		contentPane.add(button_1);
	}

}
