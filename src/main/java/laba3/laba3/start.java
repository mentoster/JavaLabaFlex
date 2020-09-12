package laba3.laba3;

// import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class start {

	public static void main(String[] args) {
		Shape s1 = new Circle(5.5, "RED", false); // Upcast Circle to Shape
		System.out.println(s1);
		System.out.println(s1.getArea());
		System.out.println(s1.getPerimeter());
		System.out.println(s1.getColor());
		System.out.println(s1.isFilled());
		// The method getRadius() is undefined for the type Shape

		// Мы создали новый класс Shape на основе на Circle, у них действуют только
		// общие методы
		// для того, чтобы раборотал метод getRadius нам нужно создавать
		// не Shape s1 а Circle s1
		// System.out.println(s1.getRadius());

		// ape s2 = new Shape();

		Shape s3 = new Rectangle(1.0, 2.0, "RED", false); // Upcast
		System.out.println(s3);
		System.out.println(s3.getArea());
		System.out.println(s3.getPerimeter());
		// System.out.println(s3.getColor());
		// System.out.println(s3.getLength());
		// Мы создали класс Shape на основе Rectangle. Нам нужно создавать объект на
		// основе не Shape, а Rectangle.
		Rectangle r1 = (Rectangle) s3; // downcast
		System.out.println(r1);
		System.out.println(r1.getArea());
		System.out.println(r1.getColor());
		System.out.println(r1.getLength());

		Shape s4 = new Square(6.6); // Upcast
		System.out.println(s4);
		System.out.println(s4.getArea());
		System.out.println(s4.getColor());
		// System.out.println(s4.getSide());
		// У объекта s4 нет метода getSide
		//

		// Take note that we downcast Shape s4 to Rectangle,
		// which is a superclass of Square, instead of Square
		// TODO: make comments (Rectangle) s4;
		Rectangle r2 = (Rectangle) s4;
		System.out.println(r2);
		System.out.println(r2.getArea());
		System.out.println(r2.getColor());
		System.out.println(r2.getSide());
		System.out.println(r2.getLength());

		// Downcast Rectangle r2 to Square
		// Square sq1 = (Square) r2;
		// System.out.println(sq1);
		// System.out.println(sq1.getArea());
		// System.out.println(sq1.getColor());
		// System.out.println(sq1.getSide());
		// System.out.println(sq1.getLength());
	}

}
