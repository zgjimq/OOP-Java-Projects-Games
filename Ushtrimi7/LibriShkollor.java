/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ushtrimi7;

/**
 *
 * @author Bruger
 */
public class LibriShkollor extends Libri {
    public boolean kaDetyra(){
    return true;
    }
    public boolean kaKopertina(){
    return false;
    }
    
    public boolean eshteMeNgjyra(){
    return false;
    }
    
    private String drejtimi;

    public LibriShkollor(String drejtimi, int isbn, String titulli, int vitiPublikimit) throws LibriException {
        
        super(isbn, titulli, vitiPublikimit);
        if(drejtimi==null || drejtimi.trim().isEmpty()){
            throw new LibriException("Drejtimi ja osht null ja ske shkrujt kurgjo");}
        this.drejtimi = drejtimi;
    }
    //Libri Shkollor <isbn> : <titulli> - <vitiPublikimit> : <drejtimi>

    public String getDrejtimi() {
        return drejtimi;
    }

    public void setDrejtimi(String drejtimi)throws LibriException {
        if(drejtimi==null || drejtimi.trim().isEmpty()){
            throw new LibriException("Drejtimi ja osht null ja ske shkrujt kurgjo");
        }
        this.drejtimi = drejtimi;
    }
    public String toString(){
        return "Libri shkollor "+super.toString()+ " : "+drejtimi;
    }
    
}
