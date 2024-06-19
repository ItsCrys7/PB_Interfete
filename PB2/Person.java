package PB2;

public class Person {
    private String name;
    private Transmitter transmitter;
    
    public Person(String name) {
        this.name = name;
    }
    
    public void setTransmitter(Transmitter transmitter) {
        this.transmitter = transmitter;
    }
    
    public void send(Person receiver, String content) {
        Message message = new Message(this, receiver, content);
        transmitter.store(message);
    }
    
    public Message receive() {
        return transmitter.retrieve(this);
    }

    public void notify(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'notify'");
    }
}
