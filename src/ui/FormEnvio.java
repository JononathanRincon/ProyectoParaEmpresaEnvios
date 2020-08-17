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

import db.DbEnvio;
import pojo.Envio;

public class FormEnvio extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public FormEnvio() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 313);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCrearEnvio = new JLabel("Crear Envio");
		lblCrearEnvio.setHorizontalAlignment(SwingConstants.CENTER);
		lblCrearEnvio.setBounds(12, 6, 438, 16);
		contentPane.add(lblCrearEnvio);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(12, 34, 61, 16);
		contentPane.add(lblId);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(12, 51, 438, 26);
		contentPane.add(textField);
		
		JLabel lblOrigen = new JLabel("Origen");
		lblOrigen.setBounds(12, 89, 61, 16);
		contentPane.add(lblOrigen);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(12, 104, 438, 26);
		contentPane.add(textField_1);
		
		JLabel lblDestino = new JLabel("Destino");
		lblDestino.setBounds(12, 142, 61, 16);
		contentPane.add(lblDestino);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(12, 158, 438, 26);
		contentPane.add(textField_2);
		
		JLabel lblDetalle = new JLabel("Detalle");
		lblDetalle.setBounds(12, 196, 61, 16);
		contentPane.add(lblDetalle);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(12, 211, 438, 26);
		contentPane.add(textField_3);
		
		JButton button = new JButton("Guardar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					Envio envio = new Envio();
					envio.setId( textField.getText()  );
					envio.setOrigen( textField_1.getText() );
					envio.setDestino( textField_2.getText() );
					envio.setDescripcion( textField_3.getText() );
					
					DbEnvio dbEnvio = new DbEnvio();
					dbEnvio.insert(envio);
					
					JOptionPane.showMessageDialog(null, "Se ha guardado con exito", "Mensaje de confirmacion", JOptionPane.INFORMATION_MESSAGE);
				}catch (Exception er) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Erro al guardar", "Mensaje de confirmacion", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		button.setBounds(12, 245, 117, 29);
		contentPane.add(button);
						
		JFrame jFrame = this;
		JButton button_1 = new JButton("Cancelar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jFrame.setVisible(false);
				jFrame.dispose();
			}
		});
		button_1.setBounds(333, 249, 117, 29);
		contentPane.add(button_1);
	}

}
