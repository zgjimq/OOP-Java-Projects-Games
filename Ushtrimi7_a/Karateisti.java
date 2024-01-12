/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ushtrimi7_a;

/**
 *
 * @author Bruger
 */
public class Karateisti extends Sportisti{
    public boolean garonIndividualisht(){
    return false;
    }
    public String getRekuizita(){
        return ""; 
    }
    private String stili;
    
    public Karateisti(int id,String emri,int mosha,boolean gjinia,String stili)throws SportistiException{
    super(id,emri,mosha,gjinia);
    
    if(stili==null || stili.trim().isEmpty())
        throw new SportistiException("Stili nuk mund te jete null ose bosh");
    this.stili=stili;
    }
    public String getStili(){
        return stili;
    }
    public void setStili(String s) throws SportistiException{
    if(stili==null || stili.trim().isEmpty())
        throw new SportistiException("Stili qe don te modifikohet nuk mund te jete null ose bosh");
    
    stili=s;
    }
    //Karateisti me stil <stili> - <id> : <emri> <mashkull / femer> <mosha> vjec
    public String toString(){
        return "Karateisti me stil "+stili+" "+super.toString();
    }
    
    
}
