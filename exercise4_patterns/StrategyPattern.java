package exercise4_patterns;

public class StrategyPattern {
	public static void main(String[] args) {
		PaintingBrush paintbrush = new PaintingBrush();
		paintbrush.paint = new BluePaint();
		paintbrush.doPaint();
	}
}

class PaintingBrush {
	Paint paint;

	public void doPaint() {
		paint.colour();
	}
}

abstract class Paint {
	public abstract void colour();
}

class GrayPaint extends Paint {

	@Override
	public void colour() {
		System.out.println("the red colour paint brush...");

	}
}

class BluePaint extends Paint {

	@Override
	public void colour() {
		System.out.println("the Blue colour paint brush...");

	}
}

class GreenPqint extends Paint {

	@Override
	public void colour() {
		System.out.println("the green colour Paint brush...");
	}
}