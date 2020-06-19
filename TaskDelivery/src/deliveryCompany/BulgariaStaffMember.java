package deliveryCompany;

public class BulgariaStaffMember extends StaffMember {

	public BulgariaStaffMember(Status status, ObserverPattern observerPattern) {
		super(status, observerPattern);
		level = StaffMember.BULGARIA;
	}
	
	@Override
	public void showStatus() {
		System.out.println("The status of Bulgaria Staff Member is: " + status.getStatusName());
	}
	
	@Override
	protected String getTypeStaffMember() {
		return "Bulgaria Staff Member";
	}

	@Override
	protected void takePackage(String packageBox) {
		System.out.println(packageBox + " is taken by Bulgaria Staff Member");
	}

}