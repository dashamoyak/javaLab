package parampampam;

/**
 * Created by Asus on 18.03.2017.
 */
public class Main {
    public static void main(String[] args){
        int n = 6275267;
        String s;
        s = Integer.toString(n);
        s = "0"+s+"0";
        for(int i = 1; i < 8; i++){
            if(Integer.parseInt(""+s.charAt(i)) < Integer.parseInt(""+s.charAt(i-1)) + Integer.parseInt(""+s.charAt(i+1))){
                System.out.printf("%c\t%d\n", s.charAt(i), i-1);
            }
        }

    }
}
