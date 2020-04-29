package observerPattern;

import java.util.ArrayList;
import java.util.List;


public class Trainee implements Observable{

	private List<Observer> observers = new ArrayList<Observer>();
	private String position;

	public void setTrainingPosition(String position) {
		this.position = position;
		this.notifyObservers();
	}
	
	@Override
	public void notifyObservers() {
		for(Observer observer: this.observers) {
			observer.update();
		}
		
	}
	
	@Override
	public void subscribe(Observer observer) {
		observer.setTrainee(this);
		this.observers.add(observer);
		
	}
	
	@Override
	public String getUpdate() {
		return position;
	}



	@Override
	public void unsubscribe(Observer observer) {
		this.observers.remove(observer);
	}

}