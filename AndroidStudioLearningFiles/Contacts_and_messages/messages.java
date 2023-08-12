package Contacts_and_messages;

public class messages {
    private String senderName ;
    private String receiverName;
    private String messageSent;
    
    public messages(String senderName, String receiverName, String messageSent){
        this.senderName = senderName;
        this.receiverName = receiverName;
        this.messageSent = messageSent;
    }

    public  String getSenderName(){
        return senderName;
    }
     public String getReceiverName(){
        return receiverName;
    }
     public String getMessage(){
        return messageSent;
    }
}
