package OOP.week1;

public class ContactList {

    private Contact[] list = new Contact[10];
    private int size = 0;

    public void addContact(Contact contact){
        list[size]=contact;
        size++;
    }


    // MY
    public void removeContact(int position){
        for (int i = position-1; i <  list.length; i++) {
            list[position-1] = list[position];
            if (list[position] == null){
                break;
            }
        }
        getContact(int position)
    }

    public Contact getContact(int position){
        return list[position];
    }

    public String asJson(){
        String result = "{\n\tlist : [";

        for (int i = 0; i < size; i++) {
            Contact currContact = list[i];
            result += "\t\t" + currContact.toJson();
        }

        result += "\t\n]\n}";
        return result;
    }

    public String asString(){
        String result = "CONTACT LIST\n";

        for (int i = 0; i < size; i++) {
            Contact currContact = list[i];
            result += "\t" + i + ". " + currContact.asString() + "\n";
        }

        return result;

    }


}
