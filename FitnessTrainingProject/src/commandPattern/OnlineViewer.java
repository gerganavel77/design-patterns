package commandPattern;

public class OnlineViewer {
	private String position;
	private String name;
	
	public OnlineViewer(String name) { 
		this.setName(name);
	}
	
	public String getName() { 
		return name;
	}
	
	public void setName(String name) { 
		this.name=name;
	}
	
	public void setTrainingPosition(String position)
	{
		this.position = position;
		System.out.println(this.getName() + " changed position to "+ this.position + ".");

	}

}