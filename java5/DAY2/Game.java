package java5.DAY2;

import java.time.*;
import java.time.format.DateTimeFormatter;
public class Game{
	private String arena;
	private LocalDate date;
	
	public Game(String arena){
		this.arena=arena;
		this.date=LocalDate.now();
	}
	public String getArena(){
		return arena;
	}
	public LocalDate getData(){
		return date;
	}
	
	public void begin(Team home, Team away){
		//String formmatedDate=this.date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		String forma=this.date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println(
			"\nThis matchup takes place at the "+this.arena+" arena on :"+forma
		);
	}
}
