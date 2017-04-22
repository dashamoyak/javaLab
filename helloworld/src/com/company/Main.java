package com.company;
import java.lang.Math;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x, y, d;

        x = in.nextDouble();


        if (Math.sqrt(x) < 1.5){
            y = Math.pow( Math.pow(x, 3) + 5, 1/3);
        }
        else {
            y = Math.cos( Math.sqrt( Math.abs( x * Math.log( 10 * x ) ) ) );
        }

        if (x == 0){
            d = Math.pow( y+2, 2 );
        }
        else if ( x > 0 ){
            d = Math.pow( y + Math.pow(x, 2), 1/3 );
        }
        else {
            d = Math.pow( Math.sin(x), 3 ) / Math.cos(0.4 * x);
        }

        System.out.printf("x=%f y=%f d=%f", x, y, d);


    }
}
