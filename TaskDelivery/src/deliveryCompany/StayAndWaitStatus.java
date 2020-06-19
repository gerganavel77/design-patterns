package deliveryCompany;

public class StayAndWaitStatus implements Status {

	private String statusName = "STAY_AND_WAIT_STATUS";

	@Override
	public String getStatusName() {
		return statusName;
	}

}