package Models;

import javax.servlet.ServletContext;
import java.util.ArrayList;

public class MyModel {
       public Object getBase(){
            Student s1 = new Student("Сеня", "Сидоров", 1312, 80);
            Student n1 = new Student("Ульяна", "Джигиль", 1210, 100);
            Student n2 = new Student("Настя", "Гриценко", 1211, 100);
            Student n3 = new Student("Альбина", "Суюсанова", 1212, 100);
            Student n4 = new Student("Петя", "Иванов", 1213, 99);
            Student s2 = new Student("Вася", "Пупкин", 1234, 50 );

            ArrayList<Student> smallStudList = new ArrayList<>();
            smallStudList.add(s1);
            smallStudList.add(s2);




            ArrayList<Student> bigStudList = new ArrayList<>();
            bigStudList.add(n1);
            bigStudList.add(n2);
            bigStudList.add(n3);
            bigStudList.add(n4);

            Faculty fiot = new Faculty("FIOT", bigStudList);

            Faculty fti = new Faculty("FTI", smallStudList);
            ArrayList<Faculty> facultiesInKpi = new ArrayList<>();
            facultiesInKpi.add(fiot);
            facultiesInKpi.add(fti);
            Institute k = new Institute("KPI", facultiesInKpi);
            return(k);


        }

}