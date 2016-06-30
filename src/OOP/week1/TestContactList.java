package OOP.week1;

/**
 * Created by Игорь on 30.06.2016.
 */
public class TestContactList {

    public static void main(String[] args) {
        ContactList contactList = new ContactList();

        Contact contact = new Contact();
        contact.initContact("Vasya", "05044558822");

        contactList.addContact(contact);

        System.out.println(contactList.asJson());
    }
}
