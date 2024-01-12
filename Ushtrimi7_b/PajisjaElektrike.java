/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ushtrimi7_b;

/**
 *
 * @author Bruger
 */
public abstract class PajisjaElektrike extends Pajisja {
    private int voltazhi;
    private char kategoriaShpenzuese;
    
    public PajisjaElektrike (int numriSerik, String prodhuesi,int voltazhi,char kt)throws PajisjaException{
    super(numriSerik,prodhuesi);
    if(voltazhi<0){
    throw new PajisjaException("Nuk mund te ket voltazh negativ");
    }
    this.voltazhi=voltazhi;
    kategoriaShpenzuese=kt;
    }
    public int getVoltazhi(){
    return voltazhi;
    }
    public char getKategoriaShpenzuese(){
    return kategoriaShpenzuese;
    }
    public void setVoltazhi(int v)throws PajisjaException{
    if(v<0){
    throw new PajisjaException("Not good");
    }
    voltazhi=v;
    }
    public void setKategoriaShpenzuese(char a){
    kategoriaShpenzuese=a;
    }
    public abstract boolean kaBateri();
    
    //prodhuesi> <voltazhi> - <kategoriaShpenzuese>
    public String toString(){
        return super.toString()+" "+voltazhi+" - "+kategoriaShpenzuese;
    }
    

}
