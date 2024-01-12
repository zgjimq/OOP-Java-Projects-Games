package java5.Det;

public class Main {
    public static void main(String[] args) {
        Team prishtina=new Team("Prishtina");
        prishtina.setPlayer("SHOOTING_GUARD", "Michael Jordan"); 
        prishtina.setPlayer("POINT_GUARD", "Randy Brown");
        prishtina.setPlayer("SMALL_FORWARD", "Scottie Pippen");
        prishtina.setPlayer("POWER_FORWARD", "Dennis Rodman");
        prishtina.setPlayer("CENTER", "Bill Wennington");

        Team Gjilani=new Team("Gjilani");
        Gjilani.setPlayer("SHOOTING_GUARD",  "Joe Dumars");
            Gjilani.setPlayer("POINT_GUARD", "Grant Hill");
            Gjilani.setPlayer("SMALL_FORWARD", "Otis Thorpe");
            Gjilani.setPlayer("POWER_FORWARD", "William Bedford");
            Gjilani.setPlayer("CENTER", "Isiah Thomas");

            Game game=new Game("Stadimu i qytetit");
            game.begin(prishtina, Gjilani);
    }
    
}
