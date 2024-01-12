package java2.functions;

import java.util.Scanner;

public class Triangle {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Shtyp numrin base te trekendeshit:");
        double base=scan.nextDouble();
        System.out.println("Shtyp gjatesin vertikale te trekendeshit:");
        double verticalHeight=scan.nextDouble();
        scan.close();
        
        double area=TriagleMethode(base, verticalHeight);
        if(base<0 || verticalHeight<0){
            System.out.println("error");
        }else{
            System.out.println("Baze qe keni shtypur eshte :"+base+", ndersa gjatesia vertikale e trekendesit eshte "
            +verticalHeight + ", dhe rezultati eshte :"+area );
        }
    }
    public static double TriagleMethode(double base, double verticalHeight){
        return base*verticalHeight/2;
    }
}
