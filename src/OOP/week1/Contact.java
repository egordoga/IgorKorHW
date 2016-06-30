package OOP.week1;

/**
 * Created by Игорь on 28.06.2016.
 */
public class Contact {

    public String name;
    public String phone;

    public void initContact(String name, String phone){
        this.name = name;
        this.phone = phone;
    }

    public String toJson() {
        return String.format("{name : %s, phone : %s}", name, phone);
    }

    public String asString(){
        return name;
    }
}
