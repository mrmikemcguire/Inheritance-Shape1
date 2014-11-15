
public class Right extends Triangle
	{
	public double hypotenuse;
	
	public Right(double b, double h)
		{
		base = b;
		height = h;
		}
	
	public double getHypotenuse()
		{
		return Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
		}
	}
