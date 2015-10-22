
public class RightTriangle extends Triangle
	{
	private double hypotenuse;
	
	public RightTriangle(double b, double h)
		{
		base = b;
		height = h;
		}
	
	public double getHypotenuse()
		{
		return Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
		}
	
	public double findPerimeter()
		{
		return getHypotenuse() + base + height;
		}
	}
