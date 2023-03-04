package exercise5;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightPattern {
	public static void main(String[] args) {
		ChessPieceFactory factory = new ChessPieceFactory();
		ChessPiece whitePawn1 = factory.getPiece("Pawn", "White");
		ChessPiece blackPawn1 = factory.getPiece("Pawn", "Black");
		ChessPiece whitePawn2 = factory.getPiece("Pawn", "White");
		ChessPiece blackPawn2 = factory.getPiece("Pawn", "Black");

		whitePawn1.move(1, 2);
		blackPawn1.move(3, 4);
		whitePawn2.move(5, 6);
		blackPawn2.move(7, 8);

	}
}

interface ChessPiece {
	void move(int x, int y);
}

class CreateChessPiece implements ChessPiece {
	private String name;
	private String color;
	private int x;
	private int y;

	public CreateChessPiece(String name, String color) {
		this.name = name;
		this.color = color;
		this.x = 0;
		this.y = 0;
	}

	public void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Moved " + color + " " + name + " to (" + x + ", " + y + ")");
	}
}

class ChessPieceFactory {
	private Map<String, ChessPiece> pieces;

	public ChessPieceFactory() {
		pieces = new HashMap<String, ChessPiece>();
	}

	public ChessPiece getPiece(String name, String color) {
		String key = name + color;
		if (pieces.containsKey(key)) {
			return pieces.get(key);
		} else {
			ChessPiece piece = new CreateChessPiece(name, color);
			pieces.put(key, piece);
			return piece;
		}
	}
}