package exercise4_patterns;

public class StrategyPattern{
	public static void main(String[] args) {
		PaintingBrush pb=new PaintingBrush();
		pb.paint=new BluePaint();
		pb.doThePaint();
	}
}

class PaintingBrush{
	Paintt paint;
	public void doThePaint(){
		paint.colour();
	}
}
abstract class Paintt{
	public abstract void colour();
}
class GrayPaint extends Paintt{

	@Override
	public void colour() {
		System.out.println("the red colour paint brush...");
		
	}
	
}
class BluePaint extends Paintt{

	@Override
	public void colour() {
		System.out.println("the Blue colour paint brush...");
		
	}
	
}
class GreenPqint extends Paintt{

	@Override
	public void colour() {
		System.out.println("the green colour Paint brush...");
	}
	
}