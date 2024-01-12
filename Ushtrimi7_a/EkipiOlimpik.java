/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ushtrimi7_a;

/**
 *
 * @author Bruger
 */
public class EkipiOlimpik {
    private String emri;
    private int index;
    Sportisti [] sport;
    public EkipiOlimpik(String e , int nrM)throws SportistiException{
    if(e==null || e.trim().isEmpty()){
        throw new SportistiException("Emri i ekipit olimplik nuk mund te jet i zbrazet apo null");
        }
    if(nrM < 1){
   throw new  SportistiException("Vargu duhet te jete me i madh se 0");
    }
   
        emri=e;
        sport = new Sportisti[nrM];
    }
  
    
    public boolean ekziston(Sportisti s){
    for(int i=0;i<index ;i++){
        if(sport[i].equals(s)){
            return true;
        }
    }
    return false;
    }
    
    public void shtoSportistin(Sportisti s)throws SportistiException{
    if(s==null){
        throw new SportistiException ("Nuk mund te jet null vlera");    
    }
    if(ekziston(s)){
    throw new SportistiException("Ky ekzsiton");
    }    
    if(index==sport.length){
    throw new SportistiException ("Nuk ka vend me ne varg");
    }
    sport[index++]=s;
        System.out.println("U shtu");
        
    }
    
    public void shtypDistancen(int dis){
    for(int i = 0 ; i< index;i++){
        if(sport[i] instanceof Vrapuesi vr){
        if(vr.getDistanca()==dis){
            System.out.println(vr);
            }
        }
    
    }
    }
    
    //atletetMosha
    public void atletetMosha(int mo){
    for(int i=0;i<index;i++){
        if(sport[i] instanceof Atleti a){
            if(a.getMosha()==mo){
                System.out.println((Atleti)sport[i]);
            }
        }
    }
    }
    public void atetetMosha(int mo){
    for(int i=0;i<index;i++){
            if(sport[i].getMosha()==mo){
                System.out.println(sport[i]);
            }
        
    }
    }
    public void gjiniaMeERe(boolean tf, int mo){
    Sportisti s= null;
    for(int i =0 ; i< index;i++){
    if(sport[i].getGjinia()==tf || sport[i].getMosha()<mo){
        s=sport[i];
            }
        }
        System.out.println(s);
    }
    public static void main(String[] args) {
        try{
            EkipiOlimpik eo=new EkipiOlimpik("",2);// do na jep exception sepse vargu nuk mund te jet zero ose emrin bosh
            
                                        //string
            Vrapuesi v1 = new Vrapuesi(100,null,20,true,2,30);// ky do naj jep exception sepse nuk mund te jete bosh ose null
            
            Vrapuesi a2 = new Vrapuesi(-200,"Emri2",30,false,1,24);// do naj jep exception sepse nuk mund te jet negativ numri
            
            
            Karateisti k1 = new Karateisti(300,"rmri3",22,true,"Kunfu");
            
            
            Futbollisti f1 = new Futbollisti(400,"SUIIIII",19,true,10);
            
            eo.shtoSportistin(v1);
            eo.shtoSportistin(a2);
            eo.shtoSportistin(k1);
            eo.shtoSportistin(f1);

            System.out.println("Testimi i metodave");
            System.out.println("============shtypDistancen============");
            eo.shtypDistancen(30);
            
            System.out.println("===============atletetMosha=========");
            eo.atletetMosha(20); 
            
            System.out.println("=============gjiniaMeERe===========");
            eo.gjiniaMeERe(true, 29);
        }catch(SportistiException e){
            System.out.println(e.getMessage());
           // System.out.println( e.getStackTrace());
        }
    }
    
}
