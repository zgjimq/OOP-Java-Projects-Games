/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ushtrimi7_a;

/**
 *
 * @author Bruger
 */
public class Vrapuesi extends Atleti{
    public boolean garonIndividualisht(){
    return true;
    }
    public  String getRekuizita(){
    return "";
    }
    private int distanca;
    public Vrapuesi(int id,String emri,int mosha,boolean gjinia,int nrMedaljeve,int distanca)throws SportistiException{
    super(id,emri,mosha,gjinia,nrMedaljeve);
    
    if(distanca<0){
        throw new SportistiException("Distanca nuk mund te jet numer negativ");
        }
        this.distanca=distanca;
    }
    public int getDistanca(){
    return distanca;
    }    
    public void setDistanca(int d)throws SportistiException{
    if(d<0){
        throw new SportistiException("Distanca qe deshironi te modifikoni nuk mund te jete numer negativ");
    }
    this.distanca=d;    
    }
    //Vrapuesi i distances <distanca> m - <id> : <emri> <mashkull / femer> <mosha> vjec me <nrMedaljeve> medalje 
    public String toString(){
        return "Vrapuesi i distances "+distanca+"m"+ " : " + super.toString();
    }

    
}
