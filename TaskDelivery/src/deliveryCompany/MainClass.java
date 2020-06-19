package deliveryCompany;

public class MainClass {

	private static StaffMember getChain(Status status, ObserverPattern observerPattern) {
		StaffMember plovdivStaffMember = new PlovdivStaffMember(status, observerPattern);
		StaffMember bulgariaStaffMember = new BulgariaStaffMember(status, observerPattern);
		StaffMember outsideBulgariaStaffMember = new OutsideBulgariaStaffMember(status, observerPattern);

		plovdivStaffMember.setNextStaffMember(bulgariaStaffMember);
		bulgariaStaffMember.setNextStaffMember(outsideBulgariaStaffMember);
		return plovdivStaffMember;
	}

	public static void main(String[] args) {

		Status start = new StayAndWaitStatus();
		ObserverPattern observerBoy = new ObserverBoy();
        StaffMember chain = getChain(start, observerBoy);
		chain.controlPackageBox(1, "Huawei Nova 5T");
		System.out.println();
		chain.controlPackageBox(2, "Aquarium with fish");
		System.out.println();
		chain.controlPackageBox(3, "LG TV");
		System.out.println();
		chain.controlPackageBox(1, "Bag of potatoes");
		System.out.println();
		chain.controlPackageBox(3, "Basket with chocolates");
		System.out.println();
		chain.controlPackageBox(2, "Car tyres");
		System.out.println();
		chain.controlPackageBox(1, "Samsung fridge");
		System.out.println();

	}

}