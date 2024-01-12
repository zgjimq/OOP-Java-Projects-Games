package java5.Det;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Game {
    private String arena;
    private LocalDate date;
    public Game(String area){
        this.arena=area;
        this.date=LocalDate.now();
    }

    public String getArena(){
        return arena;
    }
    public void setArena(String arena){
        this.arena=arena;
    }
    public LocalDate getDate(){
        return this.date;
    }
    public void setDate(LocalDate ld){
        this.date=ld;
    }
    public void begin(Team home, Team away){
        String formattedDate=this.date.format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        //POINT_GUARD
        //SHOOTING_GUARD
        //SMALL_FORWARD
        //POWER_FORWARD
        //CENTER
        System.out.println("\nThis game takes place at the "+this.arena+" arena on "+formattedDate+
        "\nTonights game takes place between the "+home.getName()+" and the "+away.getName()+
        "\nThe starting lineup for the home team are:\nHas the point guard:"+home.getPlayer("POINT_GUARD")+
        "\nHas the SHOOTING_GUARD:"+home.getPlayer("SHOOTING_GUARD")+
        "\nHas the SMALL_FORWARD:"+home.getPlayer("SMALL_FORWARD")+
        "\nHas the CENTER:"+home.getPlayer("CENTER")+
        "\nHas the POWER_FORWARD:"+home.getPlayer("POWER_FORWARD")+"\n\nThe starting lineup for the away team are:\n" +
                "Has the point guard:"+away.getPlayer("POINT_GUARD")+
        "\nHas the SHOOTING_GUARD:"+away.getPlayer("SHOOTING_GUARD")+
        "\nHas the SMALL_FORWARD:"+away.getPlayer("SMALL_FORWARD")+
        "\nHas the CENTER:"+away.getPlayer("CENTER"));
    }
}
