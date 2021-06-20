package Models;

import java.util.ArrayList;
import java.util.Iterator;

public class Methods {

    public int MethodCountAllStudent(Institute kpi){
        int numberofstudents = 0;
        for (Iterator<Faculty> i = kpi.getFaculties().iterator(); i.hasNext();){
            Faculty curFaculty = i.next();
            numberofstudents += curFaculty.getStudents().size();
        }
        return(numberofstudents);
    }

    public String MethodFindBiggestFaculty(Institute kpi){
        int studentsnumber = 0;
        Faculty jkl = new Faculty("none", new ArrayList<>());
        for (Iterator j = kpi.getFaculties().iterator(); j.hasNext();){
            Faculty o = (Faculty) j.next();
            if (o.getStudents().size() > studentsnumber){
                studentsnumber = o.getStudents().size();
                jkl = o;
            }
        }
        for (Iterator j = kpi.getFaculties().iterator(); j.hasNext();){
            Faculty o = (Faculty) j.next();
            if (o.getStudents().size() < studentsnumber){
                studentsnumber = o.getStudents().size();
                jkl = o;
            }
        }
        return(jkl.getName());
    }

    public ArrayList<Student> MethodFindBestStudent(Institute kpi){
        ArrayList<Student> studentBest = new ArrayList<>();
        for (Faculty curFaculty : kpi.getFaculties()) {
            for (Student curStudent : curFaculty.getStudents()){
                if (curStudent.getScore() < 60 ){
                    studentBest.add(curStudent);
                }
            }
        }
        ArrayList<Student> st = new ArrayList<>();
        for( Student thisStudent: studentBest){
            st.add(thisStudent);
            //studName = studName + thisStudent.getName() + " ";
        }
        return(st);

    }
}
