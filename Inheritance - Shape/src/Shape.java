
public abstract class Shape
	{
	protected double perimeter;
	protected double area;
	
	public abstract double findPerimeter();
	public abstract double findArea();
	
	@Override
	public String toString()
		{
		return "Shape [perimeter=" + perimeter + ", area=" + area + "]";
		}
	}
