package abstraction;

public class AbstractionDemo {

	public static void main(String[] args) {
		GraphicObject circle =new Circle();
		circle.x=50;
		circle.y=100;
		circle.draw();
		circle.resize();
		circle.moveTo(circle.x, circle.y);
		
		GraphicObject rectangle =new Rectangle();
		rectangle.x=200;
		rectangle.y=300;
		rectangle.draw();
		rectangle.resize();
		rectangle.moveTo(rectangle.x, rectangle.y);
	}
}
