package exercise_day3;

public class Ex1_day3_2 {
	public static void main(String[] args) {
		//for circle
		Circle c=new Circle(4);
		System.out.println("circle's  Area is : "+c.area());
		System.out.println("circle's  perimeter is : "+c.peri());
		//for Square
		Square s=new Square(2);
		System.out.println("Square's  Area is : "+s.area());
		System.out.println("Square's perimeter is : "+s.peri());
		//for triangle
		Triangle t=new Triangle(4,5,6);
		System.out.println("triangle's  Area is : "+t.area());
		System.out.println("triangle's  perimeter is : "+t.peri());
		//for sphere
		Sphere sp=new Sphere(5) ;
		System.out.println("Sphere's  Area is : "+sp.area());
		System.out.println("Sphere's  perimeter is : "+sp.peri());
		System.out.println("Sphere's  surface area is : "+sp.surfaceArea());
		System.out.println("Sphere's  volume is : "+sp.volume());
       //for cuboid
		Cuboid cu=new Cuboid(10) ;
		System.out.println("Cuboid's  Area is : "+cu.area());
		System.out.println("Cuboid's  perimeter is : "+cu.peri());
		System.out.println("Cuboid's  surface area is : "+cu.surfaceArea());
		System.out.println("Cuboid's  volume is : "+cu.volume());
	}

}
interface Area{
	double area();
	double peri();
	
}
interface volume{
	double surfaceArea();
	double volume();
}

class Circle implements Area{
	double r;
	final double pi=Math.PI;
	Circle(double r){
		this.r=r;
	}
	@Override
	public double area() {
		return pi*r*r;
	}
	@Override
	public double peri() {
		return 2*pi*r;
	}
	
}

class Square implements Area{
   private double side;
   Square(double side){
	   this.side=side;
   }
	@Override
	public double area() {
		return side *side;
	}

	@Override
	public double peri() {
		return 4*side ;
	}
	
}
class Triangle implements Area{
	double a;
	double b;
	double c;
	
	Triangle(double a,double b,double c){
		this.a=a;
		this.b=b;
		this.c=c;
	}

	@Override
	public double area() {
		double res=(a+b+c)/2;
		return Math.sqrt(res*(res-a)*(res-b)*(res-c));
	}

	@Override
	public double peri() {
		return a+b+c;
	}
	
}
class Sphere implements volume,Area {
	double r;
	double pi=Math.PI;
	
	Sphere(double r){
		this.r=r;
	}

	@Override
	public double area() {
		return 4*pi*r*r;
	}

	@Override
	public double peri() {
		return 2*pi*r;
	}

	@Override
	public double surfaceArea() {
		return 4*pi*r*r;
	}

	@Override
	public double volume() {
		return (4/3)*pi*r*r*r;
	}

	
	}
	
class Cuboid implements volume,Area{
      double side;
      
      Cuboid(double side){
    	  this.side=side;
      }
	@Override
	public double area() {
		return side*side;
	}

	@Override
	public double peri() {
		return 4*side;
	}

	@Override
	public double surfaceArea() {
		return 6*side*side;
	}

	@Override
	public double volume() {
		return side*side*side;
	}
	
}

