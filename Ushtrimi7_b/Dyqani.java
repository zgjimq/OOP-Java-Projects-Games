/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ushtrimi7_b;

/**
 *
 * @author Bruger
 */
public class Dyqani {
    private String emri;
    Pajisja[] paj;
    private int index=0;
    public Dyqani (String emri , int nrM)throws PajisjaException{
        if(emri==null || emri.trim().isEmpty()){
            throw new PajisjaException("Nuk mund te jete emri i klases dyqani null ose zbrzet");
        }
        if(nrM<1){
        throw new PajisjaException("Vargu duhet te jete me i madh se 0");
        }
        this.emri=emri;
        paj=new Pajisja[nrM];
    }
    public boolean ekziston(Pajisja p){
    for(int i = 0 ; i < index;i++){
    if(paj[i].equals(p)){
    return true;
    }
    }
    return false;
    }
    public void shtoPajisjen(Pajisja p )throws PajisjaException{
        if(p==null){
        throw new PajisjaException("Nuk nund te jet null");
        }
        if(ekziston(p)){
        throw new PajisjaException("over");
        }
        if(index == paj.length){
        throw new PajisjaException("Nuk ka vent");
        }
    paj[index++]=p;System.out.println("done");
    }
    public void shtypMaterialin(String m ){
        for(int i = 0 ; i < index ;i++){
            if(paj[i] instanceof MulliriKafes mk){
                if(mk.getMateriali().equals(m)){
                    System.out.println((MulliriKafes)paj[i]);
                }
            }
        }
    }
    public void pajisjeVoltazhi(int vol){
        for(int i = 0; i < index;i++){
        if(paj[i] instanceof PajisjaElektrike pe){
            if(pe.getVoltazhi()==vol){
                System.out.println(pe);
            }
        }
        }
    }
    public void bateriaProdhuesi(boolean gjini,String pro){
    for(int i = 0 ; i <index ;i++){
        if(paj[i] instanceof PajisjaElektrike pe){
            if(pe.kaBateri()==gjini && paj[i].getProdhuesi().equals(pro)){
                System.out.println(paj[i]);
                return;
            }
        }
    
    }
    }
    
    public static void main(String[] args) {
        try{
        Dyqani d = new Dyqani("emri",0);// Do na jep exeption sepse vargu duhet te jete me i madh se 0 
       
        MulliriKafes m1= new MulliriKafes(-1,"Prodhuesi0","Material 0"); // Ketu do te jete exception sepse eshte -1
        MulliriKafes m2 = new MulliriKafes(2,"Prodhuesi","Material 1");
        
        Enelaresja e1= new Enelaresja(3,"",300,'S',5); // ketu do te jete exception sepse eshte bosh
        Enelaresja e2= new Enelaresja(4,"Prodhuesi2",500,'Z',7);
        
        MP3Player mp1 = new MP3Player(5,"Prodhuesi3",55,'A',32);
        MP3Player mp2 = new MP3Player(6,"Prodhuesi4",52,'A',32);
        
        


        
        d.shtoPajisjen(m1);
        d.shtoPajisjen(m2);
        d.shtoPajisjen(e1);
        d.shtoPajisjen(e2);
        d.shtoPajisjen(mp1);
        d.shtoPajisjen(mp2);
        
            System.out.println("=========Testimi i metodave=======");
            System.out.println("=========ekziston=======");
                System.out.println(d.ekziston(m1));
            System.out.println("===========shtypMaterialin===========");
            d.shtypMaterialin("Material 0");
            System.out.println("===========pajisjeVoltazhi========");
            d.pajisjeVoltazhi(300);
            System.out.println("============bateriaProdhuesi=======");
            d.bateriaProdhuesi(false, "Prodhuesi1");

        
        
        
        }catch(PajisjaException p){
            System.out.println(p.getMessage());
        }
    }
}
