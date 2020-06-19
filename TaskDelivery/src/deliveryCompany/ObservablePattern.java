package deliveryCompany;

public interface ObservablePattern {
	public void notifyObserver(String packageBox);
    public void addObserver(ObserverPattern observerPattern);
}