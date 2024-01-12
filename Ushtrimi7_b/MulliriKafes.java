/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ushtrimi7_b;

/**
 *
 * @author Bruger
 */
public class MulliriKafes extends Pajisja implements Perdoret{
    public boolean kaBateri(){
    return false;
    }
    public String getPerdoimi(){
        return "Shtepiak";
    }
    public String materiali;
    public MulliriKafes(int numriSerik, String prodhuesi,String materiali)throws PajisjaException{
    super(numriSerik,prodhuesi);
        if(materiali==null || materiali.trim().isEmpty()){
        throw new PajisjaException("Nuk mund te jete materiali null ose empty");
        }
        this.materiali=materiali;
    }
    public String getMateriali(){
    return materiali;
    }
    public void setMateriali(String m)throws PajisjaException{
    if(materiali==null || materiali.trim().isEmpty()){
        throw new PajisjaException("Nuk mund te jete materiali null ose empty");
        }
        materiali=m;
    }
       public String toString(){
            return "Mulliri i kafes prej "+materiali+" - "+super.toString();
       } 
}
