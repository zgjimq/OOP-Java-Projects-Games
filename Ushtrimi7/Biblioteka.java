/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ushtrimi7;

/**
 *
 * @author Bruger
 */
public class Biblioteka {
    private String emri;
    Libri [] librat;
    private int index=0;
    public Biblioteka(String e ,int nrM)throws LibriException{
        if(nrM<1){
	throw new LibriException("vlere jo e sakte per vargun!");
        }
        if(e==null || e.equals("")){
	throw new LibriException("drejtimi i zbrazet ose null!");
	}
	this.emri=e;
	librat=new Libri[nrM];
    
    }
    public boolean ekziston(Libri a){
    for(int i = 0 ;i < index;i++){
       if(librat[i].equals(a)) {
           return true;
           
       }
    }
    return false;
            
    }
    public void shtoLibrin(Libri s)throws LibriException{
    if(s==null){
    throw new LibriException(" Libri qe eshte derguar eshte null");
    }
    if(index==librat.length){
    throw new LibriException("Nuk ka vend ne varg per:"+s);
    }
    if(ekziston(s)){
    throw new LibriException("Ka liber G");
    }
    librat[index++]=s;
    }
    public void meNgjyra(boolean tr){
    for(int i = 0 ; i< index ;i++){
    if(librat[i].eshteMeNgjyra()==tr){
        System.out.println(librat[i]);
        return;
        }
    }
    }
    public void libratEVitit(int haha){
    for(int i = 0 ;i<index;i++){
    if(librat[i].getVitiPublikimit()>haha){
        System.out.println(librat[i]);
    }
    }
    }
    public static void main(String[] args) {
        try{
        Biblioteka b1 = new Biblioteka("UBT Library",10);
        LibriShkollor l1 = new LibriShkollor("wdq",1,"titull",30);
        LibriShkollor l2 = new LibriShkollor("diqka",2,"titull",50);
        b1.shtoLibrin(l1);
        b1.shtoLibrin(l2);

        
        
        }catch(LibriException l){
            //System.out.println(l.getMessage());
            l.getStackTrace();
        } 
    }
    
    
}
