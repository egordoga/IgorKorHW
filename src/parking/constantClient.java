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

        ConstantClient[] listConstant = new ConstantClient[50];
        int size = 0;

        public void addConstClient(ConstantClient constantClient) {
            listConstant[size] = constantClient;
            size++;
        }

        private void showAddConstantClienttMenu(){
            System.out.println("Input name");
            String name = scanner.next();
            System.out.println("Input phone");
            String phone = scanner.next();
            System.out.println("Input car model");
            String model = scanner.next();
            System.out.println("Input car number");
            String number = scanner.next();
            System.out.println("Input car ID");
            int typeId = scanner.nextInt();

            //Area area = new Area();
            //area.showFree();

            System.out.println("Input car place");
            int place = scanner.nextInt();

            Car car = new Car(model, number, typeId);
            ConstantClient constantClient = new ConstantClient(name, phone, car, plase);
            //contact.initContact(name, phone);
            //contactList.addContact(contact);*/
        }


    }


