package OOP.week1;

import java.util.Scanner;

/**
 * Created by Игорь on 29.06.2016.
 */
public class ContactListMenu {

    private Scanner scanner = new Scanner(System.in);
    private ContactList contactList;

    public void start(ContactList contactList){

        this.contactList = contactList;
        while (true) {
            showMainMenu();

            int chois = scanner.nextInt();

            if(chois == 1){
                showAddContactMenu();
            } else if (chois == 2){
                showAllContactMenu();
            } else if (chois == 3){
                showContactDetailsMenu();
            }else if (chois == 0){
                break;
            }
        }
    }

    private void showAllContactMenu() {
        System.out.println(contactList.asString());
    }

    private void showContactDetailsMenu(){
        System.out.println("Input contact position");
        int position = scanner.nextInt();

        Contact contact = contactList.getContact(position);
        System.out.println(contact.toJson());
    }

    private void showAddContactMenu(){
        System.out.println("Input name");
        String name = scanner.next();
        System.out.println("Input phone");
        String phone = scanner.next();

        Contact contact = new Contact();
        contact.initContact(name, phone);
        contactList.addContact(contact);
    }

    public void showMainMenu(){
        System.out.println("1. Add Contact");
        System.out.println("2. Show All");
        System.out.println("3. Show Contact details");
        System.out.println("0. Exit");
    }
}
