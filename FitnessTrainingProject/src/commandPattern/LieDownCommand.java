package commandPattern;

public class LieDownCommand implements Command{
	
	private Trainee trainee;
	
	public LieDownCommand(Trainee trainee) {
		this.trainee = trainee;
	}
	@Override
	public void execute() {
		trainee.setTrainingPosition("Lie Down");
	}
}