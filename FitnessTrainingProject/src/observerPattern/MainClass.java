package observerPattern;

public class MainClass {

	public static void main(String[] args) {
		Trainee trainee = new Trainee();
		GymInstructor gymInstructor = new GymInstructor(trainee);
		Observer onlineViewer1 = new OnlineViewer("Ivan Todorov");
		Observer onlineViewer2 = new OnlineViewer("Aleksander Ivailov");
		Observer onlineViewer3 = new OnlineViewer("Konstantina Radoslavova");
		
		trainee.subscribe(onlineViewer1);
		trainee.subscribe(onlineViewer2);
		trainee.subscribe(onlineViewer3);
		
		gymInstructor.positionChange("Lie Down");
		gymInstructor.positionChange("Stand Up");
		



	}

}