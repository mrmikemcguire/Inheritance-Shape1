
public class EquilateralTriangle extends Triangle
	{
	private double sideLength;
		
	public EquilateralTriangle(double sl)
		{
		sideLength = sl;
		}
	
	public double findPerimeter()
		{
		return sideLength * 3;
		}
	
	}
