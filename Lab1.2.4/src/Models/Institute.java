package Models;
import java.util.ArrayList;

public class Institute {
    private String name;
    private ArrayList<Faculty> faculties;

    public Institute(String name, ArrayList<Faculty> faculties){
        this.name = name;
        this.faculties = faculties;
    }

    public ArrayList<Faculty> getFaculties(){
        return (ArrayList<Faculty>) faculties.clone();
    }

    public String getName(){
        return name;
    }
}
