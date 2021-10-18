/**Klasa Rnd
*Represents array of random numbers
*@author Alicja Osam-Gyaabin
*@version 0.1
*/

public class Rnd{
    /**Dlugosc tablicy*/
    int N;
    /**Liczba k*/
    double k;
    /**Tablica, gdzie kazda komorka to suma k pseudolosowych liczb z przedzialu 0.0-1.0*/
    double [] tab;

    /**Konstruktor*/
    Rnd(int a, int b){
        N = a;
        k = b;
        tab = new double[N];
        for(int i=0; i<N; i++){
            for(int j=0; j<k; j++){
                tab[i] += Math.random();
            }
        }
    }

    /**funkcja wypisujaca*/
    void Print(){
        for(int i=0; i<N; i++){
            System.out.println("[" + i + "]="+tab[i]);
        }
    }

    /**
    *@return min najmniejsza wartosc w tablicy
    */
    double Min(){
        double min = tab[0];
        for(int i=1; i<N; i++){
            if(tab[i] < min){
                min = tab[i];
            }
        }
        return min;
    }

    /**
    *@return max najwieksza wartosc w tablicy
    */
    double Max(){
        double max = tab[0];
        for(int i=1; i<N; i++){
            if(tab[i] > max){
                max = tab[i];
            }
        }
        return max;
    }

    /**
    *@return av srednia wartosc w tablicy
    */
    double Average(){
        double av = tab[0];
        for(int i=1; i<N; i++){
            av += tab[i];
        }
        return av/N;
    }
}
