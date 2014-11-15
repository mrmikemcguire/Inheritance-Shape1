
public class Rectangle extends Quadrilateral
	{
	private double length;
	private double width;
	
	public Rectangle(double l, double w)
		{
		length = l;
		width = w;
		}
	
	@Override
	public double findArea()
		{
		return length * width;
		}
	
	@Override
	public double findPerimeter()
		{
		return (length * 2) + (width * 2);
		}	
	}

