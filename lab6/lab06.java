public class lab06{
    public static void main(String[] args){
        Wielomian w1 = new Wielomian(1);
        Wielomian w2 = new Wielomian(1, 2);
        Wielomian w3 = new Wielomian(1, 2, 3);
        Wielomian w4 = new Wielomian(1, 0, 4);
        Wielomian w5 = new Wielomian(0, 1, 5);

        System.out.println(w1);
        System.out.println(w2);
        System.out.println(w3);
        System.out.println(w4);
        System.out.println(w5);
    }
}