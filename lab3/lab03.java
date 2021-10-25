public class lab03{

    public static void main(String[] args){
        Wydzial w = new Wydzial();
        Student s1 = new Student(27236, "Jan", "Nowak");
        w.dodaj(s1);
        Student s2 = new Student(89347, "Ela", "Kowalska");
        w.dodaj(s2);
        Student s3 = new Student(9546, "Entomologia", "Motylkowska");
        w.dodaj(s3);
        w.printStudents();
    }
}