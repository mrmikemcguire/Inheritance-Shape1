import java.util.ArrayList;

public class ShapeRunner
	{

	public static void main(String[] args)
		{
		Shape et = new EquilateralTriangle(5);
		System.out.println("Equilateral Triangle");
//		System.out.println("SideLength is " + base);
		System.out.println("Area is " + et.findArea());
		System.out.println("Perimeter is " + et.findPerimeter());
		System.out.println();
		
		Shape rt = new RightTriangle(3, 4);
		System.out.println("Right Triangle");
		System.out.println("Area is " + rt.findArea());
		System.out.println("Perimeter is " + rt.findPerimeter());
		System.out.println();
		
		Shape t = new Trapezoid(5, 9, 4);
		System.out.println("Trapezoid");
		System.out.println("Area is " + t.findArea());
		System.out.println("Perimeter is " + t.findPerimeter());
		System.out.println();
		
		Shape r = new Rectangle(5, 7);
		System.out.println("Rectangle");
		System.out.println("Area is " + r.findArea());
		System.out.println("Perimeter is " + r.findPerimeter());
		System.out.println();
		
		ArrayList <Shape> shapes = new ArrayList <Shape>();
		shapes.add(new EquilateralTriangle(5));
		shapes.add(new RightTriangle(3, 4));
		shapes.add(new Trapezoid(5, 9, 4));
		shapes.add(new Rectangle(5, 7));
		
		for(Shape s : shapes)
			{
			System.out.println(s);
			}
		



		
		

		

		}

	}
