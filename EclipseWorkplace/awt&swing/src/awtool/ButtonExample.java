package awtool;
import java.awt.*;


public class ButtonExample extends Frame{
	ButtonExample(){
		Button btn = new Button("hello world");
		add(btn);
		setTitle("spark");
		setLayout(new FlowLayout());
		setSize(400,500);
		setVisible(true);
	}
	public static void main(String[] args) {
		ButtonExample bl = new ButtonExample();
	}
}
