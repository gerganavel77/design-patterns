package deliveryCompany;

public class ObserverBoy implements ObserverPattern {

	@Override
	public void managePackageBox(StaffMember staffMember, String packageBox) {
		System.out.println("The observer boy collects the  " + packageBox + " from the " + staffMember.getTypeStaffMember()
		+ " and moves it diligently to the warehouse"); 
	}
}