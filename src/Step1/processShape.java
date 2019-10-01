package Step1;

import java.util.Scanner;

public class processShape {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		processShape();
		int n=sc.nextInt();
		do
		{
			if(n==1)
			{
				InfoRectangle();
			}
			if(n==2)
			{
				Triangle();
			}
		}
		while(n<1&&n>3);
		
		
		
	}

	public static void processShape() {
		Shape sh = new Shape("blue");
		System.out.println("color of shape is:");
		System.out.println(sh.color);
		System.out.println("Area of shape is:");
		System.out.println(sh.getArea());
	}
	public static void InfoRectangle()
	{
		Rectangle re = new Rectangle("red", 2, 3);
		System.out.println("color of Rectangle is:");
		System.out.println(re.color);
		System.out.println("Area of Rectangle is:");  
		System.out.println(re.getArea());
	}
	public static void Triangle()
	{
		Triangle tr = new Triangle("yellow", 4, 4);
		System.out.println("color of Triangle is:");
		System.out.println(tr.color);
		System.out.println("Area of Triangle is:");
		System.out.println(tr.getArea());

	}
}
