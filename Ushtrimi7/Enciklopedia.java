/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ushtrimi7;

/**
 *
 * @author Bruger
 */
public class Enciklopedia extends Libri {
     public boolean kaDetyra(){
    return false;
    }
    public boolean kaKopertina(){
    return true;
    }
    private int nrAutoreve;
    
    
    
    

    public Enciklopedia(int nrAutoreve, int isbn, String titulli, int vitiPublikimit) throws LibriException {
        
        super(isbn, titulli, vitiPublikimit);
        if(nrAutoreve<0){
        throw new LibriException("Nuk eshte pozitiv numri i autoreve");
        }
        this.nrAutoreve = nrAutoreve;
    }

    public int getNrAutoreve() {
        return nrAutoreve;
    }

    public void setNrAutoreve(int nrAutoreve)throws LibriException {
         if(nrAutoreve<0){
        throw new LibriException("Nuk eshte pozitiv numri i autoreve");
        }
        this.nrAutoreve = nrAutoreve;
    }
    //Enciklopedia <isbn> : <titulli> - <vitiPublikimit> ka <nrAutoreve> autore
    public String toString(){
    return "Enciklopedia "+super.toString()+" ka "+nrAutoreve+ " autore";
    }

    
}
