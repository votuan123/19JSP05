package Step1;

public class Triangle extends Shape{
	int base;
	int height;
	public Triangle(String color, int base,int height ) {
		super(color);
		this.base=base;
		this.height=height;
		// TODO Auto-generated constructor stub
	}
	@Override
	public double getArea()
	{
		return 0.5*base*height;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
