package deliveryCompany;

public class OutsideBulgariaStaffMember extends StaffMember {

	public OutsideBulgariaStaffMember(Status status, ObserverPattern observerPattern) {
		super(status, observerPattern);
		level = StaffMember.OUTSIDE_BULGARIA;
	}
	@Override
	public void showStatus() {
		System.out.println("The status of the Outside Bulgaria Staff Member is: " + status.getStatusName());
	}
	
	@Override
	protected String getTypeStaffMember() {
		return "Outside Bulgaria Staff Member";
	}

	@Override
	protected void takePackage(String packageBox) {
		System.out.println(packageBox + " is taken by Outside Bulgaria Staff Member");
	}


}