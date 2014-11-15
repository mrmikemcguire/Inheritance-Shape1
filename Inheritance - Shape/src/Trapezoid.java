
public class Trapezoid extends Quadrilateral
	{
	private double base1, base2;
	private double height;
	private double side;
	
	public Trapezoid(double b1, double b2, double h)
		{
		base1 = b1;
		base2 = b2;
		height = h;
		}
	
	@Override
	public double findArea()
		{
		return ((base1 + base2) / 2) * height;
		}
	
	@Override
	public double findPerimeter()
		{
		side = Math.sqrt(Math.pow((Math.abs(base1 - base2) / 2), 2) + Math.pow(height, 2));
		return (base1 + base2) + (2 * side);
		}
	}
