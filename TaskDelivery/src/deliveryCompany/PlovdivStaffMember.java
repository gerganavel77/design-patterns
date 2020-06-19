package deliveryCompany;

public class PlovdivStaffMember extends StaffMember {

	public PlovdivStaffMember(Status status, ObserverPattern observerPattern) {
		super(status, observerPattern);
		level = StaffMember.PLOVDIV;
	}
	
	@Override
	public void showStatus() {
		System.out.println("The status of Plovdiv Staff Member is: " + status.getStatusName());
	}
	
	@Override
	protected String getTypeStaffMember() {
		return "Plovdiv Staff Member"; 
	}

	@Override
	protected void takePackage(String packageBox) {
		System.out.println(packageBox + " is taken by Plovdiv Staff Member");
	}

}