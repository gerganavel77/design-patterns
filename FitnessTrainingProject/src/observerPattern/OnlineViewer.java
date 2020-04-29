package observerPattern;
public class OnlineViewer implements Observer {
	private String position;
	private Observable trainee;
	private String name;
	
	public OnlineViewer(String name) { 
		this.setName(name);
	}

	@Override
	public void update() {
		if(trainee == null) {
			System.out.println("There is no trainee!");
			return;
		}
		
		position = trainee.getUpdate();
		System.out.println(this.getName() + " changed position to "+ this.position+".");
		
	}

	@Override
	public void setTrainee(Observable trainee) {
		this.trainee = trainee;
	}
	
	public String getName() { 
		return name;
	}
	
	public void setName(String name) { 
		this.name=name;
	}
	
	public String getTrainingPosition() {
		return this.position;
	}

	public void setTrainingPosition(String position) {
		this.position = position;
	}


}