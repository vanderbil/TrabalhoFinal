package mediator;

public class Main 
{
    public static void main(String[] args) 
    {
        IChatRoom chatroom = new ChatRoom();
         
        User user1 = new ChatUser(chatroom,"1", "Maria");
        User user2 = new ChatUser(chatroom,"2", "José");
        User user3 = new ChatUser(chatroom,"3", "João");
        User user4 = new ChatUser(chatroom,"4", "Ana");
         
        chatroom.addUser(user1);
        chatroom.addUser(user2);
        chatroom.addUser(user3);
        chatroom.addUser(user4);

        
        user1.send("Hello brian", "2");
        user2.send("Hey buddy", "1");
        
    }
}

