/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ushtrimi7_a;

/**
 *
 * @author Bruger
 */
public class Futbollisti extends Sportisti{
    public boolean garonIndividualisht(){
    return false;
    }
    public String getRekuizita(){
        return "top"; 
    }
    private int numri;
    
    public Futbollisti(int id,String emri,int mosha,boolean gjinia,int numri)throws SportistiException{
         super (id,emri,mosha,gjinia);
         
    if(numri<0){
        throw new SportistiException("Numri eshte negativ");
    }
        this.numri=numri;
    }
    public int getNumri(){
    return numri;
    }
    public void setNumri(int n)throws SportistiException{
    if(numri<0)
    throw new SportistiException("Numri qe deshiron te modifikohet eshte numer negativ");
     numri=n;
    }
    //Futbollisti <id> : <emri> <mashkull / femer> <vitiProdhimit> vjec– nr: <numri> 
    public String toString(){
        return "Futbollisti "+super.toString()+" -nr:"+numri;
    }
    
    
    
}
