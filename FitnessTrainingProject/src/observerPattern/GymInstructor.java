package observerPattern;

public class GymInstructor {
	Trainee trainee;
	
	public void positionChange(String newPosition)
	{
		this.trainee.setTrainingPosition(newPosition);
	} 
	
	public GymInstructor(Trainee trainee)
	{
		this.trainee = trainee;
	}
	
}