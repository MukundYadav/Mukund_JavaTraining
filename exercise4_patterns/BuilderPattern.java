package exercise4_patterns;

public class BuilderPattern {
	public static void main(String[] args) {
		Apartment apartment=new Apartment.BuildApartment().setBricks("MRN").setCement("ITD").setSand("M-sand").
				setIron("TMT-555").setInteriors("IKEA Interiors").build();
		System.out.println(apartment);
	}
}
class Apartment{
	class Assemble{
		String bricks,cement,sand,iron,interiors;
		public Assemble(String bricks,String cement,String sand,String iron,String interiors) {
			this.bricks=bricks;
			this.cement=cement;
			this.sand=sand;
			this.iron=iron;
			this.interiors=interiors;
		}
		@Override
		public String toString() {
			return "Assemble [bricks=" + bricks + ", cement=" + cement + ", sand=" + sand + ", iron="
					+ iron + ", interiors=" + interiors + "]";
		}
		
	}
	Assemble a;
	String company;
	public Apartment(BuildApartment ba) {
		a=new Assemble(ba.bricks,ba.cement,ba.sand,ba.iron,ba.interiors);
		company="prestige Apartments";
	}
	
	@Override
	public String toString() {
		return "Apartment [a=" + a + ", company=" + company + "]";
	}
	static class BuildApartment{
		String bricks,cement,sand,iron,interiors;
		public BuildApartment setBricks(String bricks) {
			this.bricks=bricks;
			return this;
		}
		public BuildApartment setCement(String cement) {
			this.cement=cement;
			return this;
		}
		
		public BuildApartment setSand(String sand) {
			this.sand = sand;
			return this;
		}
		public BuildApartment setIron(String iron) {
			this.iron = iron;
			return this;
		}
		public BuildApartment setInteriors(String interiors) {
			this.interiors = interiors;
			return this;
		}
		
		public Apartment build() {
			return new Apartment(this);
		}
	}
}