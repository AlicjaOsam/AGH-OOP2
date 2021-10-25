import java.util.HashMap;
import java.util.Map;

public class Wydzial{
    Map<Integer, String> Students = new HashMap<Integer, String>();

    void dodaj(Student s){
        int i = s.getID();
        if(Students.containsKey(i)){
            System.out.println("Ostrzeżenie! Dany numer ID istnieje już w bazie.");
        }
        else{
            Students.put(i, s.getStudent(i));
        }
    }

    void printStudents(){
        for(Integer key : Students.keySet()){
            String value = Students.get(key);
            System.out.println(key + " " + value);
        }
    }
}