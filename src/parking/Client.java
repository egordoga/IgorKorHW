package parking;

/**
 * Created by Master on 03.07.2016.
 */
public class Client {

     String name;
     String phone;
     Car car;

     Client[] list = new Client[10];
     int size = 0;

     public void addClient(Client client) {
        list[size] = client;
        size++;
     }
}
