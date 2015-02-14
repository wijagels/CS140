package lab02;
import java.awt.Rectangle;

public class Lab02B {
	private Rectangle rect;

	public Lab02B(int[] numbers) {
		if(numbers.length > 3)
			this.rect = new Rectangle(numbers[0], numbers[1], numbers[2], numbers[3]);
		else
			this.rect = new Rectangle(0,0,0,0);
	}

	public int area() {
		return (int) (rect.getWidth() * rect.getHeight());
	}

	public String toString() {
		return rect.toString();
	}

	public int getX() {
		return rect.x;
	}

	public int getY() {
		return rect.y;
	}

	public boolean isMoreWeeThan(Lab02B o) {
		return o == null ? true : rect.x < o.getX() || (rect.x == o.getX() && rect.y < o.getY());
		/*Return true o is null or if x is greater than other x, 
		or if x is equal and y is greater than other y.*/
	}
}