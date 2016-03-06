package za.ac.cput.lindo;

/**
 * Created by LILO on 2016/03/06.
 */
public class student {
    String name;
    String course;

    public student(String nm, String cour){
        name = nm;
        course = cour;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }
}
