package commandPattern;

import java.util.ArrayList;
import java.util.List;

public class Trainee {
	private String position;
	private List<OnlineViewer> onlineViewers = new ArrayList<OnlineViewer>();

	public void setTrainingPosition(String position)
	{
		this.position = position;
		for(OnlineViewer onlineViewer: this.onlineViewers) {
			onlineViewer.setTrainingPosition(this.position);
		}		
	}
	public void subscribe(OnlineViewer onlineViewer) {
		this.onlineViewers.add(onlineViewer);		
	}
}