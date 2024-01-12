package java5.Det;

import java.util.HashMap;
import java.util.Map;

public class Team {
    private String name;
	private Map<String,String>player;
	
	public Team(String name){
		this.name=name;
		this.player=new HashMap<>();
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getPlayer(String position){
		return this.player.get(position);
	}
	public void setPlayer(String position,String name){
		this.player.put(position,name);
	}
}
