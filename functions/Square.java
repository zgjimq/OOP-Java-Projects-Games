package java2.functions;
import java.lang.Math;
import java.util.Scanner;
public class Square{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Formuna r2:");
        System.out.println("Numri qe deshironi ta vendosni ne katror ose r-in:");
        double nr1=scan.nextDouble(); 
        scan.close();
        double area = SquareMethod(nr1);
        if(nr1<0){
            System.out.println("Error");
        }else{
            System.out.println("Numri qe keni zgedhur eshte "+nr1+" dhe r2 i kesaj eshte "+area);
        }
    }
    public static double SquareMethod(double a){
        return Math.pow(a,2);
    }
}