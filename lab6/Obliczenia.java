public class Obliczenia{
    static Wielomian w;

    static String setABC(double a, double b, double c){
        w = new Wielomian(a, b, c);
        return w.toString();
    }
    
    static double getAtX(double x){
        w = new Wielomian(1, 1, 1);
        return w._a*x*x + w._b*x + w._c;
    }
    
    static double integral(double x1, double x2){
        w = new Wielomian(1, 1, 1);
        return w._a*x2*x2*x2/3 + w._b*x2*x2/2 + w._c*x2 - w._a*x1*x1*x1/3 + w._b*x1*x1/2 + w._c*x1;
    }
}