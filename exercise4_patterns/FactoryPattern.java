package exercise4_patterns;

public class FactoryPattern {
	public static void main(String[] args) {
		OperatingSystemFactory osfactory = new OperatingSystemFactory();
		OperatingSystem os = osfactory.getOS("cheap");
		os.specifications();

	}
}

interface OperatingSystem {
	void specifications();
}

class Android implements OperatingSystem {

	@Override
	public void specifications() {
		System.out.println("The Android OS : easily affordable for many people");

	}
}

class IOS implements OperatingSystem {

	@Override
	public void specifications() {
		System.out.println("The ios operating system is very secure ....");

	}
}

class Windows implements OperatingSystem {

	@Override
	public void specifications() {
		System.out.println("the windows operating syatem is the most used os....");

	}
}

class OperatingSystemFactory {
	public OperatingSystem getOS(String str) {
		if (str.equals("cheap")) {
			return new Android();
		} else if (str.equals("safe")) {
			return new IOS();
		} else {
			return new Windows();
		}
	}
}
