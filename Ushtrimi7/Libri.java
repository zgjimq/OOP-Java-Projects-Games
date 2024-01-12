/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ushtrimi7;

/**
 *
 * @author Bruger
 */
public abstract class Libri implements Botohet{
    private int isbn;
    private String titulli;
    private int vitiPublikimit;

    public Libri(int isbn, String titulli, int vitiPublikimit)throws LibriException {
        if(isbn<0){
        throw new LibriException(" ISBN Nuk eshte numer pozitiv");
        }
      if(vitiPublikimit<0){
      throw new LibriException("VITI I PUBLIKIMIT Nuk eshte numer pozitiv");
      }
      if(titulli==null || titulli.trim().equals("")){//trim per nese e ben ("  "); mundet te jete ne provim
          throw new LibriException("NULL OSE ZBRAZET");
      }
        this.isbn = isbn;
        this.titulli = titulli;
        this.vitiPublikimit = vitiPublikimit;
    }
    public void setTitulli(String titulli)throws LibriException {
        if(titulli==null || titulli.trim().isEmpty()){// njejt si equals
        throw new LibriException("Titulli mund te jet null ose zbrazet");
        }
        this.titulli = titulli;
    }

    public void setVitiPublikimit(int vitiPublikimit)throws LibriException {
        if(vitiPublikimit<0){
        throw new LibriException("Numri nuk eshte pozitiv");
        }
        this.vitiPublikimit = vitiPublikimit;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getTitulli() {
        return titulli;
    }

    public int getVitiPublikimit() {
        return vitiPublikimit;
    }
    
    public abstract boolean kaDetyra();
   
    
    //public abstract boolean kaDetyra();
   //isbn : titulli - vitiPublikimit
    public String toString(){
        return isbn+ " : "+titulli+" - "+vitiPublikimit;
        
    }
    public boolean equals(Object o){
        if(o instanceof Libri){
        return isbn == getIsbn();
        }
        return false;
    }
}
