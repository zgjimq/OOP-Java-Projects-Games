/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ushtrimi7_b;

/**
 *
 * @author Bruger
 */
public class MP3Player extends PajisjaElektrike implements Perdoret{
    public boolean kaBateri(){
    return true;
    }
    public String getPerdoimi(){
    return "argëtues";
    }
    private int memoria;
    public MP3Player(int numriSerik, String prodhuesi,int voltazhi,char kt,int memoria)throws PajisjaException{
    super(numriSerik,prodhuesi,voltazhi,kt);
    this.memoria=memoria;
    }
    public int getMemoria(){
    return memoria;
    }
    public void setMemoria(int m)throws PajisjaException{
        if(m<0){
        throw new PajisjaException("nuk mund te behet set metoda per memorie");
        }
        memoria=m;
    }
    //MP3Player - <numriSerik> : <prodhuesi> <voltazhi> - <kategoriaShpenzuese> : <memoria> GB 
    public String toString(){
    return "MPRPlayer - "+super.toString()+" : "+memoria+ " GB";
    } 
}
