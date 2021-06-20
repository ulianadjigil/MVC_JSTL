package Models;


public class Student {
    private String name, surname;
    private int idBook, averageScore;

    public Student(String name, String surname, int idBook, int averageScore){
        this.name = name;
        this.surname = surname;
        this.idBook = idBook;
        this.averageScore = averageScore;
    }

    public int getScore(){
        return averageScore;
    }

    public String getName(){
        return name + " " + surname;
    }

}
