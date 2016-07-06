    package parking;

    import java.util.Scanner;

    /**
     * Created by Master on 03.07.2016.
     */
    public class ConstantClient extends Client{

        int plase;

        Scanner scanner = new Scanner(System.in);

        public ConstantClient(String name, String phone, Car car, int plase) {
            super(name, phone, car);
            this.plase = plase;
        }

        parking.ConstantClient[] listConstant = new parking.ConstantClient[50];
        int size = 0;

        public void addConstClient(parking.ConstantClient constantClient) {
            listConstant[size] = constantClient;
            size++;
        }

        private void showAddContactMenu(){
            System.out.println("Input name");
            String name = scanner.next();
            System.out.println("Input phone");
            String phone = scanner.next();
            System.out.println("Input phone");
         /*   String phone = scanner.next();

            ConstantClient constantClient = new ConstantClient("Ivanov", "0502252255", );
            contact.initContact(name, phone);
            contactList.addContact(contact);*/
        }


    }


