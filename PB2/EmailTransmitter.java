package PB2;

import java.util.List;
import java.util.ArrayList;

public class EmailTransmitter implements Transmitter {
    private List<Message> messages = new ArrayList<>();
    
    public void store(Message message) {
        messages.add(message);
        message.getReceiver().notify("You have a new email.");
    }
    
    public Message retrieve(Person receiver) {
        for (Message message : messages) {
            if (message.getReceiver().equals(receiver)) {
                messages.remove(message);
                return message;
            }
        }
        return null;
    }
}
