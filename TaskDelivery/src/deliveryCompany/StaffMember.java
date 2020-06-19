package deliveryCompany;

public abstract class StaffMember implements ObservablePattern {

	protected int level;
	public static int PLOVDIV = 1;
	public static int BULGARIA = 2;
	public static int OUTSIDE_BULGARIA = 3;
	protected StaffMember nextStaffMember;
	protected Status status;
	protected ObserverPattern observerBoy;

	public StaffMember(Status status, ObserverPattern observerPattern) {
		setStatus(status);
		addObserver(observerPattern);
	}
	
	@Override
	public void addObserver(ObserverPattern observerPattern) {
		this.observerBoy = observerPattern;
	}

	public void setNextStaffMember(StaffMember nextStaffMember) {
		this.nextStaffMember = nextStaffMember;
	}
	
	protected abstract String getTypeStaffMember();
	
	@Override
	public void notifyObserver(String packageBox) {
		observerBoy.managePackageBox(this, packageBox);
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
	protected abstract void takePackage(String packageBox);

	public void controlPackageBox(int level, String packageBox) {

		if (this.level == level) {
			showStatus();
			takePackage(packageBox);
			setStatus(new GetReadyStatus());
			showStatus();
			notifyObserver(packageBox);
			setStatus(new StayAndWaitStatus());
			showStatus();
			return;
		}

		if (this.nextStaffMember != null) {
			this.nextStaffMember.controlPackageBox(level, packageBox);
		}

	}

	public abstract void showStatus();
}