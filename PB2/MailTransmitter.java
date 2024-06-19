package PB2;

import java.util.ArrayList;
import java.util.List;

public class MailTransmitter implements Transmitter {
    private List<Message> mailbox = new ArrayList<>();
    private int capacity;
    
    public MailTransmitter(int capacity) {
        this.capacity = capacity;
    }
    
    public void store(Message message) {
        mailbox.add(message);
        if (mailbox.size() >= capacity) {
            for (Message mail : mailbox) {
                mail.getReceiver().notify("You have a new letter.");
            }
            mailbox.clear();
        }
    }
    
    public Message retrieve(Person receiver) {
        for (Message message : mailbox) {
            if (message.getReceiver().equals(receiver)) {
                mailbox.remove(message);
                return message;
            }
        }
        return null;
    }
}
