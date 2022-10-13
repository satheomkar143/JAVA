package awtool;

import java.awt.*;

public class LableExample {
	LableExample() { 
		Frame fm = new Frame();      //creating frame
		Label lb = new Label("welcome to java programming");    //creating label
		fm.add(lb);                      // adding label to frame
		fm.setSize(300, 300);           //setting frame size-
		fm.setVisible(true);
	}

	public static void main(String[] args) {
		LableExample l = new LableExample();
	}

}
