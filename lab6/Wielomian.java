public class Wielomian{

    Wielomian(double a){
        _a = a;
    }

    Wielomian(double a, double b){
        _a = a;
        _b = b;
    }

    Wielomian(double a, double b, double c){
        _a = a;
        _b = b;
        _c = c;
    }

    public String toString(){
        String s = "f(x)=";
        if(_a != 0){
            s += _a;
            s += "x^2";
        }
        if(_b != 0){
            if(_a != 0){
                s += "+";
            }
            s += _b;
            s += "x";
        }
        if(_c != 0){
            if(_b != 0 || _a != 0){
                s += "+";
            }
            s += _c;
        }
        return s;
    }

    double _a = 0;
    double _b = 0;
    double _c = 0;
}