package swing;

import java.awt.FlowLayout;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Checkbox extends JFrame {

	Checkbox() {
		JLabel lb = new JLabel("Courses");
		add(lb);
		JCheckBox jcb = new JCheckBox("c");
		add(jcb);
		jcb = new JCheckBox("cpp");
		add(jcb);
		jcb = new JCheckBox("java");
		add(jcb);
		jcb = new JCheckBox("python");
		add(jcb);

		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 400);
		setVisible(true);

	}

	public static void main(String[] args) {
		Checkbox c = new Checkbox();
	}
}
