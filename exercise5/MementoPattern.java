package exercise5;

import java.util.ArrayList;
import java.util.List;

public class MementoPattern {
	public static void main(String[] args) {
		Originator originator = new Originator();
		Caretaker caretaker = new Caretaker();

		originator.setState("State 1");
		caretaker.addMemento(originator.createMemento());
		originator.setState("State 2");
		caretaker.addMemento(originator.createMemento());
		originator.setState("State 3");
		originator.restoreFromMemento(caretaker.getMemento(1));
		System.out.println(originator.getState()); 
	}
}

class Memento {
	private String state;

	public Memento(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}

class Originator {
	private String state;

	public void setState(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public Memento createMemento() {
		return new Memento(state);
	}

	public void restoreFromMemento(Memento memento) {
		this.state = memento.getState();
	}
}

class Caretaker {
	private List<Memento> mementoList = new ArrayList<>();

	public void addMemento(Memento memento) {
		mementoList.add(memento);
	}

	public Memento getMemento(int index) {
		return mementoList.get(index);
	}
}
