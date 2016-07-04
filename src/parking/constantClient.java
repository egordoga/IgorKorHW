package parking;

/**
 * Created by Master on 03.07.2016.
 */
public class constantClient extends Client{

    int plase;

    public constantClient(String name, String phone, Car car, int plase) {
        super(name, phone, car);
        this.plase = plase;
    }
}
