
public class Trapezoid extends Quadrilateral
	{
	private double base1, base2;
	private double height;
	
	public Trapezoid(double b1, double b2, double h)
		{
		base1 = b1;
		base2 = b2;
		height = h;
		}
	
	public double getArea()
		{
		return ((base1 + base2) / 2) * height;
		}
	}
