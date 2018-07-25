package first.calc.easy.easycalc;

/**
 * Created by Mujahid on 7/23/2018.
 */

public class Student {

    private String name;
    private String reg_no;
    private int image;

    public Student(String name, String reg_no, int image) {
        this.name = name;
        this.reg_no = reg_no;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getReg_no() {
        return reg_no;
    }

    public int getImage() {
        return image;
    }
}
