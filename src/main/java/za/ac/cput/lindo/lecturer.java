package za.ac.cput.lindo;

/**
 * Created by LILO on 2016/03/06.
 */
public class lecturer {
    String name;
    String department;

    public lecturer(String nm, String dep){
        name = nm;
        department = dep;
    }

    public String getName(){
        return name;
    }

    public  String getDepartment(){
        return department;
    }
}
