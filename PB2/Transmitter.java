package PB2;

public interface Transmitter {
    void store(Message message);
    Message retrieve(Person receiver);
}
