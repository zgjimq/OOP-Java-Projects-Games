/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ushtrimi7_b;

/**
 *
 * @author Bruger
 */
public abstract class Pajisja {
    private int numriSerik;
    private String prodhuesi;
    
    public Pajisja(int numriSerik, String prodhuesi)throws PajisjaException{
        if(numriSerik<0){
            throw new PajisjaException("Nuk mund te jete numer negativ numri serik");
        }
        if(prodhuesi==null || prodhuesi.trim().isEmpty()){
            throw new PajisjaException("Nuk mund te jet null nje prodhues ose blank");
        }
        this.numriSerik=numriSerik;
        this.prodhuesi=prodhuesi;
    }
    public int getNumrinSerik(){
    return numriSerik;
    }
    public String getProdhuesi(){
    return prodhuesi;
    }
    public void setProdhuesi(String p)throws PajisjaException{
    if(p == null || p.trim().isEmpty()){
        throw new PajisjaException("Nuk mund te modifikohet sepse eshte null ose diqka");
    }
    prodhuesi=p;
    }
    public String toString(){
    return numriSerik + " : " + prodhuesi;
    }
    public boolean equals(Object o){
    if(o instanceof Pajisja p){
    return numriSerik == p.getNumrinSerik();
    }
    return false;
    }
}
