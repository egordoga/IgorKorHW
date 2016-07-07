package parking;

/**
 * Created by Master on 03.07.2016.
 */
public class Area {

    int numberPlace;
    int typeId;
    boolean freePlace;
    //int quantityDays;
    //Date startDate;
    //Date endDate;


    Area place[] = new Area[50];

    /*public  void setArea() {
        this.numberPlace = numberPlace;
        this.typeId = typeId;
        this.freePlace = freePlace;
    }*/

    public   void setPlace(){

        for (int i = 0; i <10; i++) {
            // Area()
            place[i] = new Area();
            place[i].typeId = 1;
            place[i].numberPlace = i + 1;
            place[i].freePlace = true;
        }
        for (int i = 10; i < 40; i++) {
            place[i] = new Area();
            place[i].typeId = 2;
            place[i].numberPlace = i + 1;
            place[i].freePlace = false;
        }
        for (int i = 40; i < 45; i++) {
            place[i] = new Area();
            place[i].typeId = 3;
            place[i].numberPlace = i + 1;
            place[i].freePlace = true;
        }
        for (int i = 45; i < 50; i++) {
            place[i] = new Area();
            place[i].typeId = 4;
            place[i].numberPlace = i + 1;
            place[i].freePlace = false;
        }


    }

    public void showFree(){
        for (int i = 0; i < 50; i++) {
           // place[i] = new Area();
            if (place[i].freePlace){
                System.out.print( place[i].numberPlace + ", " );
            }
        }

    }

    //private void parkCar*/

}
