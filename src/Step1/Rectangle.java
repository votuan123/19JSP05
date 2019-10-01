package Step1;

public class Rectangle extends Shape{
	int lengh;
	int width;
	public Rectangle(String color,int lengh,int width) {
		super(color);
		this.lengh=lengh;
		this.width=width;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return lengh*width;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
