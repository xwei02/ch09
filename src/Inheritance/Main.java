package Inheritance;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Chihua", 152275, 42, "Java");
        Teacher t2 = new Teacher("Kevin", 180002, 52, "DL");
        Student s1 = new Student("David", 51021001, 19, "Java");
        Student s2 = new Student("Howard", 51021002, 20, "Java");

        //ArrayList 寫法
        ArrayList<People> peopleInSchool = new ArrayList<>();
        peopleInSchool.add(t1);
        peopleInSchool.add(t2);
        peopleInSchool.add(s1);
        peopleInSchool.add(s2);

        for (People p : peopleInSchool){
            System.out.println(p.name);
        }

        //Array 寫法
        /*People[] peopleInSchool = new People[4];
        peopleInSchool[0] = t1;
        peopleInSchool[1] = t2;
        peopleInSchool[2] = s1;
        peopleInSchool[3] = s2;

        for (int i = 0; i < 4; i++) {
            System.out.println(peopleInSchool[i].name);
        }*/

        /*System.out.println(t1.equals(t2));
        t1.teach();
        t2.eat();
        s1.sit();
        s2.learn();*/
    }
}
