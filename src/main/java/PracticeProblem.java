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
		if (this.length==0||this.width==0){
			return 0;
		}
		return (this.length+this.width)*2;
	}
}
class Circle{
	private double radius;
	public Circle(double radius){
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
class Person{
	private String name;
	private int age, weight, height;
	private String eyeColour, hairColour;
	public Person(String name, int age, int height, int weight, String eyeColour, String hairColour){
		this.name = name;
		this.age=age;
		this.weight = weight;
		this.height= height;
		this.eyeColour= eyeColour;
		this.hairColour= hairColour;
	}
	public int getAge(){
		return this.age;
	}
	public int getHeight(){
		return this.height;
	}
	public int getWeight(){
		return this.weight;
	}
	public String getName(){
		return this.name;
	}
	public String getHairColour(){
		return this.hairColour;
	}
	public String getEyeColour(){
		return this.eyeColour;
	}
	
	 
}

