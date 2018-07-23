package first.calc.easy.easycalc;

/**
 * Created by Mujahid on 7/23/2018.
 */

public class Student {
    String name;
    String Father_name;
    String blood_group;
    int age;
    int id;


    public Student(String name, String father_name, String blood_group, int age, int id) {
        this.name = name;
        Father_name = father_name;
        this.blood_group = blood_group;
        this.age = age;
        this.id = id;
    }

    public void setAge(int age){
        if(age >= 18 && age <= 60 ){
            this.age = age;
        }
    }


}
