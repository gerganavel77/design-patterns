package commandPattern;

public class GymInstructor {

	private Command command;	

	public void setCommand(Command command) {
		this.command = command;
	}
	public void positionChange() {
		System.out.println("The gym instructor changed the position.");
		this.command.execute();
	}
}