package exercise5;

public class MementoPattern {
	public static void main(String[] args) {
		// setting up the username and password
		User user = new User("username", "password");

		// add user to LoginManager
		LoginManager loginManager = new LoginManager(user);

		// Attempt to log in with the incorrect password
		loginManager.login("username", "pass");

		// Attempt to log in again with the correct password
		loginManager.restore();
		loginManager.login("username", "password");
	}
}

class User {
	private String username;
	private String password;

	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}

	// The login method to manage login activity
	public boolean login(String username, String password) {
		if (this.username.equals(username) && this.password.equals(password)) {
			System.out.println("Login successful.");
			return true;
		} else {
			System.out.println("Login failed.");
			System.out.println("Please Login Again..");
			return false;
		}
	}

	// saving current state
	public LoginMemento save() {
		return new LoginMemento(username, password);
	}
	//restoring...
	public void restore(LoginMemento memento) {
		this.username = memento.getUsername();
		this.password = memento.getPassword();
	}
}

// The LoginManager class manages the login process and the state of the User object
class LoginManager {
	private User user;
	private LoginMemento memento;

	public LoginManager(User user) {
		this.user = user;
	}
	//login activity
	public boolean login(String username, String password) {
		boolean success = user.login(username, password);
		if (!success) {
			memento = user.save();
		}
		return success;
	}

	// The restore method restores the state of the User 
	public void restore() {
		if (memento != null) {
			user.restore(memento);
			memento = null;
		}
	}
}

// The LoginMemento class 
class LoginMemento {
	private String username;
	private String password;

	public LoginMemento(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}
}
