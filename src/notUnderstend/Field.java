package notUnderstend;

/**
 * Created by Master on 10.07.2016.
 */
public class Field {

    Boolean logic;
    int number;

    Field field[] = new Field[5];

    public Field(){}
    public Field(Boolean name, int age) {
        this.logic = name;
        this.number = age;
    }


    public void initField(){
        for (int i = 0; i <5 ; i++) {
            field[i] =  new Field(true, i);
        }
    }

    public void showField(){
        for (int i = 0; i < 5; i++) {
            System.out.println(field[i].logic + ", " + field[i].number);
        }
    }
}
