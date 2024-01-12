/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ushtrimi7_a;

/**
 *
 * @author Bruger
 */
public abstract class Sportisti implements Rekuizita{
    private int id;//readonly
    private String emri;
    private int mosha;
    private boolean gjinia;
    
    public Sportisti(int id,String emri,int mosha,boolean gjinia) throws SportistiException{
        if(id<0){
        throw new SportistiException("Numri id nuk eshte pozitiv");
        }
        if(emri==null || emri.trim().isEmpty()){
        throw new SportistiException("Emri eshte bosh ose null");
        }
        if(mosha<0)
            throw new SportistiException("Mosha nuk mund te jete numer negativ!");
        this.emri=emri;
        this.id=id;
        this.mosha=mosha;
        this.gjinia=gjinia;
        }
        
    public int getId(){
    return id;
    }
    public String getEmri(){
    return emri;
    }
    public int getMosha(){
    return mosha;
    }
    public boolean getGjinia(){
    return gjinia;
    }
    //////////////////////
    public void setEmri(String e) throws SportistiException{
    if(e==null || e.trim().isEmpty())
        throw new SportistiException("Emri i cili don me u modifikuar ja eshte null ja eshte bosh");
    emri=e;
    }
    public void setMosha(int m)throws SportistiException{
    if(m<0)
        throw new SportistiException("Mosha qe deshiron te modifikohet nuk ka mundesi te jete negativ");
    mosha=m;
    }
    public void setGjinia (boolean b){
    gjinia=b;
    }
    public abstract boolean garonIndividualisht();
    
    //<id> : <emri> <mashkull / femer> <mosha> vjec
    public String toString(){
    return emri+" "+ (gjinia ? "mashkull":"femen")+" "+mosha+" vjeq";
    }
    /*
    public boolean equals(Object o){
        if(o instanceof Libri){
        return isbn == getIsbn();
        }
        return false;
    }
    */
    public boolean equals(Object o){
    if(o instanceof Sportisti s){
        if(id == s.getId()){
        return true;
        }
        else{
        return false;
        }
    }
    return false;
    }
    }
    
            
            

