package onlineChatRoomTask;

public abstract class PatternF {
	protected SpyBotF spyBotF;
	protected ChatterF chatterF;
	
	public SpyBot startSpyBot()
	{
		return spyBotF.startSpyBot();
	}
	
	public Chatter generateChatter(String nickname)
	{
		return chatterF.generateChatter(nickname);		
	}
	
	
}