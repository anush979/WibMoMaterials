import java.util.Iterator;

public class TestMain07 {
	public static void main(String[] args) {
		//Shapes s1 = new Shapes();
		Rectangle r1 = new Rectangle(11, 21);
		Rectangle r2 = new Rectangle(12, 22);
		Rectangle r3 = new Rectangle(13, 23);
		Rectangle r4 = new Rectangle(14, 24);
		Rectangle r5 = new Rectangle(15, 25);

		Circle c1 = new Circle(31);
		Circle c2 = new Circle(32);
		Circle c3 = new Circle(33);
		Circle c4 = new Circle(34);
		Circle c5 = new Circle(35);
		
		Square sq1 = new Square(41);
		Square sq2 = new Square(42);
		Square sq3 = new Square(43);
		Square sq4 = new Square(44);
		Square sq5 = new Square(45);
		
		Cube cb1 = new Cube(51);
		Cube cb2 = new Cube(52);
		Cube cb3 = new Cube(53);
		Cube cb4 = new Cube(54);
		Cube cb5 = new Cube(55);
		
		Shapes shapesA[] = new Shapes[20];
		shapesA[0] = c1;
		shapesA[1] = r2;
		shapesA[2] = c3;
		shapesA[3] = c4;
		shapesA[4] = r1;
		shapesA[5] = r5;
		shapesA[6] = c5;
		shapesA[7] = c2;
		shapesA[8] = r4;
		shapesA[9] = r3;
		shapesA[10] = sq3;
		shapesA[11] = sq1;
		shapesA[12] = sq2;
		shapesA[13] = sq4;
		shapesA[14] = sq5;
		shapesA[15] = cb1;
		shapesA[16] = cb2;
		shapesA[17] = cb3;
		shapesA[18] = cb4;
		shapesA[19] = cb5;
		
		Solids solidsA[] = new Solids[5];
		solidsA[0] = cb1;
		solidsA[1] = cb2;
		solidsA[2] = cb3;
		solidsA[3] = cb4;
		solidsA[4] = cb5;
		
		processShapes(shapesA);
		processSolids(solidsA);
	}
	
	public static void processShapes(Shapes[] sArray ) {
		for(int i = 0; i < sArray.length; i++) {
			sArray[i].findArea();
			sArray[i].findPerimater();
			System.out.println("--------------------------------------");
		}
	}
	
	public static void processSolids(Solids[] sdarray) {
		for (int i = 0; i < sdarray.length; i++) {
			sdarray[i].findVolume();
			System.out.println("--------------------------------------");
		}
	}
}
interface Shapes{
	abstract void findArea() ;
	abstract void findPerimater() ;
}
interface Solids{
	void findVolume();
}
class Cube implements Solids, Shapes{
	double l;
	public Cube(double l) {
		this.l = l;
	}
	public void findVolume() {
		double volume = l * l * l;
		System.out.println("Volume of the Cube : " + volume);
	}
	public void findArea() {
		double area = l * l; 
		System.out.println("Area of Cube as Squre in 2D Space     : " + area);
	}
	public void findPerimater() {
		double perimeter = 4 * l ;
		System.out.println("Perimeter of Cube as Squre in 2D Space : " + perimeter);
	}
}
class Square implements Shapes{
	double l;
	public Square(double l) {
		this.l = l;
	}
	public void findArea() {
		double area = l * l; 
		System.out.println("Area of Square     : " + area);
	}
	public void findPerimater() {
		double perimeter = 4 * l ;
		System.out.println("Perimeter of Square : " + perimeter);
	}
}
class Rectangle implements Shapes{
	double l, b;
	public Rectangle(double l, double b) {
		this.l = l;
		this.b = b;
	}
	public void findArea() {
		double area = l * b; 
		System.out.println("Area of Rectangle      : " + area);
	}
	public void findPerimater() {
		double perimeter = 2 * (l + b) ;
		System.out.println("Perimeter of Rectangle : " + perimeter);
	}
}
class Circle implements Shapes{
	double r;
	public Circle(double r) {
		this.r = r;
	}
	public void findArea() {
		double area = 3.146 * r * r; 
		System.out.println("Area of Circle         : " + area);
	}
	public void findPerimater() {
		double perimeter = 2 * 3.146 * r ;
		System.out.println("Perimeter of Circle    : " + perimeter);
	}
}
