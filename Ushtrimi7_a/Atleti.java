/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ushtrimi7_a;

/**
 *
 * @author Bruger
 */
public abstract class Atleti extends Sportisti{
    private int nrMedaljeve;
     public Atleti(int id,String emri,int mosha,boolean gjinia,int nrMedaljeve) throws SportistiException{
        super(id,emri,mosha,gjinia);
        
        if(nrMedaljeve<0){
            throw new SportistiException("Nr i medalave nuk mund te jete negativ");
        }
        this.nrMedaljeve=nrMedaljeve;
     }
     public int getNrMedaljeve(){
        return nrMedaljeve;
     }
     public void setNrMedaljeve(int s){
        nrMedaljeve=s;
     }
     public String toString(){
        return super.toString()+" "+nrMedaljeve+" medalje";
     }
}
