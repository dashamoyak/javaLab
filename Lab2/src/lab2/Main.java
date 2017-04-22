package lab2;

import java.lang.Math;


/**
 * Created by Asus on 18.03.2017.
 */
public class Main {
    public static void main(String[] args){
        double x0 = -3.3;
        double xn = 2.92;
        double dx = 0.38;

        System.out.printf("x\t\t\t|\ty\n");
        while (x0 <= xn){
            double y = Math.pow(x0-3, 2) * Math.tan(0.1 * x0);
            System.out.printf("--------------------------\n");
            System.out.printf("%f\t|\t%f\n", x0, y);
            x0 += dx;
        }


    }
}
