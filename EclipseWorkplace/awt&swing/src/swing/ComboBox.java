package swing;

import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboBox extends JFrame {

	String name[] = { "omkar", "guru", "raj", "abhi" };

	ComboBox() {
		JComboBox<String> jc = new JComboBox<>(name);      //initialize combo box

		add(jc);

		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 400);
		setVisible(true);

	}

	public static void main(String[] args) {
		new ComboBox();
	}
}
