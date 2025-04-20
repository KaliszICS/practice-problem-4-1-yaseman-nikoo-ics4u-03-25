public class PracticeProblem {

	public static void main(String args[]) {


	}


}
class Rectangle{
	private double length;
	private double width;
	public Rectangle(double length, double width){
		this.length= length;
		this.width= width;
	}
	public double getLength(){
		return this.length;
	}
	public double getWidth() {
		return this.width;
	}
	public double area(){
		return this.length*this.width;
	}
	public double perimeter(){
		return (this.length+this.width)*2;
	}
}
class Circle{
	private double radius;
	public Circle(double radiud){
		this.radius=radius;

	}
	public double getRadius(){
		return this.radius;
	}
	public double area(){
		return 3.14*Math.pow(this.radius,2);
	}
	public double circumference(){
		return 3.14*2*this.radius;
	}
}

