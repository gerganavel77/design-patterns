package onlineChatRoomTask;

import java.util.ArrayList;

public class OnlineRoom {
	private static SpyBot spyBot;
	private static HandleF handleF = new HandleF();
	private static ArrayList<Chatter> chatters = new ArrayList();

	public static void addChatter(Chatter chatter) {
		if(chatter!= null) {
			chatters.add(chatter);
		}
	}
	
	public static void deleteChatter(Chatter chatter) {
		if(chatter!= null && chatters.contains(chatter)) {
			chatters.remove(chatter);
			System.out.println(chatter.getNickname() +
					" got deleted from the chat because he/she used the forbidden word 'cat'. DO NOT USE THE WORD 'CAT'!");
		}
	}
	
	public static void displayText(Chatter chatter, String text){
		if(!chatters.contains(chatter)){
			return;
		}
	
		System.out.println(chatter.getNickname()+" is saying: " + text);
		
		if(spyBot != null && text.contains("cat")){
			spyBot.deleteChatter(chatter);		
		}		
		else if(text.equals("addBot")){
			spyBot = handleF.startSpyBot();		
		}
	}
	
}