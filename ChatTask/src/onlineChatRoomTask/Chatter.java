package onlineChatRoomTask;

public class Chatter{
   private String nickname;
   
   public void textSend(String text){
	      OnlineRoom.displayText(this,text);
	   }
   public Chatter(String nickname){
	      this.nickname  = nickname;
	   }
   
   public String getNickname() {
      return nickname;
   }
   
   
   public void setNickname(String nickname) {
	      this.nickname = nickname;
	   }
 
}