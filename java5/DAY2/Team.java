package java5.DAY2;

import java.util.*;
public class Team{
	private String name;
	private Map<String,String>player;
	
	public Team(String name){
		this.name=name;
		this.player=new HashMap<>();
		
	}
	public String getName(){
		return name;
	}
	public String getPlayer(String position){
		return this.player.get(position);
	}
	public void setPlayer(String position,String player){
		this.player.put(position,player);
	}
}
