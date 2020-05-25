package onlineChatRoomTask;

public class MainClass {

	public static void main(String[] args) {
		PatternF patternF = new HandleF();
		
		Chatter chatter1 = patternF.generateChatter("darkstar887");
		Chatter chatter2 = patternF.generateChatter("oceanfighter441");
		Chatter chatter3 = patternF.generateChatter("galaxy6211");
		
		OnlineRoom.addChatter(chatter1);
		OnlineRoom.addChatter(chatter2);
		OnlineRoom.addChatter(chatter3);
		
		chatter1.textSend("Hello, dear chatters! Are you fans of Tom the cat?");
		chatter2.textSend("addBot");
		chatter3.textSend("Yes, I am a big admirer of Tom the cat.");
	}

}