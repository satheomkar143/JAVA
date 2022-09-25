package abstraction;

public abstract class GraphicObject {
	int x, y;
	
	public GraphicObject(){
		System.out.println("abstract class created");
	}

	void moveTo(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("move to x: " + x + " y: " + y);
	}
abstract void draw();
abstract void resize();

}
