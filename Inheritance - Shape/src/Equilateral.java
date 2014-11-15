
public class Equilateral extends Triangle
	{
	protected double sideLength;
	
	public Equilateral(double sl)
		{
		sideLength = sl;
		}
	
	public double findPerimeter()
		{
		return sideLength * 3;
		}
	}
