public class Student{
    private int ID;
    private String Imie;
    private String Nazwisko;

    Student(int id, String i, String n){
        ID = id;
        Imie = i;
        Nazwisko = n;
    }

    String getStudent(int id){
        return Imie + " " + Nazwisko;
    }

    int getID(){
        return ID;
    }

    static int number = 0;
    {
        number++;
    }

    static int numberOfStudents(){
        return number;
    }

    void print(){
        System.out.println(ID + " " + Imie + " " + Nazwisko);
    }
}