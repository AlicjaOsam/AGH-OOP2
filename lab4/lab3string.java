/**
 * Klasa lab3string
 * 
 * @author Alicja Osam-Gyaabin
 * @version 0.1
 */

public class lab3string{
    static int dlugosc(String s){
        return s.length();
    }
    
    static int ile_razy_literka_wystepuje(String s, char c){
        char [] tab = s.toCharArray();
        int ile = 0;
        for(int i=0; i<s.length(); i++){
            if(tab[i] == c){
                ile++;
            }
        }
        return ile;
    }

    static boolean czy_takie_same(String s1, String s2){
        if(s1.equals(s2)){
            return true;
        }return false;
    }

    static String wspak(String s){
        char [] tab = s.toCharArray();
        char [] temp = new char[s.length()];
        for(int i=0; i<s.length(); i++){
            temp[s.length()-1-i] = tab[i];
        }
        return s.copyValueOf(temp);
    }

    static boolean czy_plaindrom(String s1){
        String s2 = wspak(s1);
        if(czy_takie_same(s1, s2)){
            return true;
        }return false;
    }

    static boolean czy_abecadlowe(String s){
        char [] tab = s.toCharArray();
        for(int i=0; i<s.length()-1; i++){
            if(tab[i] > tab[i+1]){
                return false;
            }
        }
        return true;
    }

    static String rot13(String s){
        char [] tab = s.toCharArray();
        for(int i=0; i<s.length(); i++){
            if(tab[i] > 96 && tab[i] < 110){
                tab[i] += 13;
            }
            else if(tab[i] > 109 && tab[i] < 123){
                tab[i] -= 13;
            }
            else if(tab[i] > 64 && tab[i] < 78){
                tab[i] += 13;
            }
            else if(tab[i] > 77 && tab[i] < 91){
                tab[i] -= 13;
            }
        }
        return s.copyValueOf(tab);
    }
}