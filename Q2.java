class Rectangle{
	private double length,width;
	
		public Rectangle(double length,double width){
		this.length=length;
		this.width=width;
	}
	
	public double getLength(){
		return this.length;
	}
	public double getWidth(){
		return this.width;
	}
	public void setLength(double length){
		this.length=length;
	}
	public void setWidth(double width){
		this.width=width;
	}
	
	public double area(){
		return getLength()*getWidth();
	}
	public double perimeter(){
		return (getLength()*2)+(getWidth()*2);
	}
	
	
}
public class Q2{
	public static void main(String [] args){
		Rectangle rec1=new Rectangle(6,4);		
		
		System.out.println("Area is "+rec1.area());
		System.out.println("Perimeter is "+rec1.perimeter());
	}
}

/*
2. Write a program to create a 'Rectangle' class without any parameter in its constructor and calculate the perimeter and area of a rectangle with length 6 units and width 4 units.
*/
