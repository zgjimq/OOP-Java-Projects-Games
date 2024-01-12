/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ushtrimi7_b;

/**
 *
 * @author Bruger
 */
public class Enelaresja extends PajisjaElektrike implements Perdoret {
    public boolean kaBateri(){
    return false;
    }
    public String getPerdoimi(){
    return "shtepiak";
    }
    private int nrProgrameve;
    
    public Enelaresja(int numriSerik, String prodhuesi,int voltazhi,char kt,int nrProgrameve)throws PajisjaException{
    super(numriSerik,prodhuesi,voltazhi,kt);
    if(nrProgrameve<0){
     throw new PajisjaException("Nr i programeve nuk mund te jete negativ");
    }
    this.nrProgrameve=nrProgrameve;
    }
    public int getNrProgrameve(){
    return nrProgrameve;
    }
    public void setNrProgrameve(int i)throws PajisjaException{
        if(i<0){
        throw new PajisjaException("Nuk mund te modifikohet nrProgrameve ne negativ");
        }
        
        nrProgrameve=i;
    }
    //Enelaresja me < nrProgrameve> programe - <numriSerik> : <prodhuesi> <voltazhi> - <kategoriaShpenzuese> 
    public String toString(){
        return "Enelaresja me "+nrProgrameve+" programe -"+super.toString();
    }
    
}
