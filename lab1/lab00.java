import java.lang.Math.*;

/**Klasa lab00
*Represents trochoid
*@author Alicja Osam-Gyaabin
*@version 0.1
*/

public class lab00{
    public static void main(String[] args){
	/**Liczba a*/
        double a = 1.7;
	/**Liczba b*/
        double b = 1.2;
	/**Liczba h*/
        double h = 1.3;
	/**Liczba t*/
        double t = 1.4;
	/**Liczba x*/
        double x;
	/**Liczba y*/
        double y;
        for(t=1.4; t<29.65; t=t+0.005){
            x = (a-b)*Math.cos(t)+h*Math.cos((a-b)/b*t);
            y = (a-b)*Math.sin(t)-h*Math.sin((a-b)/b*t);
            System.out.println(x + " "+y);
        }
    }
}
