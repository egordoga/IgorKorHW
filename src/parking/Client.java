package parking;

/**
 * Created by Master on 03.07.2016.
 */
public class Client {

    private String name;
    private String phone;
    private Car car;

    public Client(String name, String phone, Car car) {
        this.name = name;
        this.phone = phone;
        this.car = car;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    Client client = new Client(getName(), getPhone(), getCar());

    public Client addClient;

}
