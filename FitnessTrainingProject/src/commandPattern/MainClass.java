package commandPattern;

public class MainClass {

	public static void main(String[] args) {
		GymInstructor gymInstructor = new GymInstructor();
		Trainee trainee = new Trainee();
		
		OnlineViewer onlineViewer1 = new OnlineViewer("Ivan Todorov");
		OnlineViewer onlineViewer2 = new OnlineViewer("Aleksander Ivailov");
		OnlineViewer onlineViewer3 = new OnlineViewer("Konstantina Radoslavova");
		
		trainee.subscribe(onlineViewer1);
		trainee.subscribe(onlineViewer2);
		trainee.subscribe(onlineViewer3);
		
		Command positionLieDown = new LieDownCommand(trainee);
		Command positionStandUp = new StandUpCommand(trainee); 
		
		gymInstructor.setCommand(positionStandUp);
		gymInstructor.positionChange();
		gymInstructor.setCommand(positionLieDown);
		gymInstructor.positionChange();
		
		
		
	}

}