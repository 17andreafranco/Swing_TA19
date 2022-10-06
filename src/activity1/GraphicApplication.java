package activity1;

import javax.swing.*;
import java.awt.event.*;

/**
 * @author Andrea
 *
 */

public class GraphicApplication extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JButton button;

	public GraphicApplication() {

		setTitle("Greeter");
		setBounds(400, 200, 500, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);

		JLabel label = new JLabel("Insert your name");
		label.setBounds(200, 40, 250, 20);
		contentPane.add(label);

		textField = new JTextField();
		textField.setBounds(150, 70, 200, 20);
		contentPane.add(textField);

		button = new JButton("send");
		button.setBounds(200, 100, 100, 20);
		contentPane.add(button);
		button.addActionListener(this);

		// IMPORTANT FINAL DEL CODI
		setVisible(true);
	}

	/**
	 * Accion del boton. Al pulsar aparecera un panel saludando con el nombre
	 * introducido
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			String name = this.textField.getText();
			JOptionPane.showMessageDialog(null, "Hola " + name + "!");
		}

	}

}
