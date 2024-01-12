package java2.functions;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Shenoni rrezen e rrethit :");
        double radius = scan.nextDouble();
        scan.close();
        double area= CircleMethode(radius);
        if(radius<0){
            System.out.println("Error");
        }else{
            System.out.println("Numri i rrezes eshte :"+radius+", ndersa rezultati eshte :"+area);
        }
        
    }
    public static double CircleMethode(double radius){
        return Math.PI *Math.pow(radius,2);
    }
}
