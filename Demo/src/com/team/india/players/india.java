package com.team.india.players;

import java.util.Scanner;

public class india {
	
	Scanner sc=new Scanner(System.in);
	players p=new players();
	public void addplayer()
	{
		
	
		p.setPid(sc.nextInt());
		p.setName(sc.next());
		p.setAddress(sc.next());
		p.setMbno(sc.nextLong());
		p.setSalary(sc.nextDouble());
		p.setAge(sc.nextInt());
		p.setStatus(sc.nextBoolean());
		p.setScore(sc.nextLong());
		}
	
	
	
	
	public void viewplayer()
	
	{  
		p.getPid();
		p.getName();
		p.getAddress();
		p.getMbno();
		p.getSalary();
		p.getAge();
        p.getStatus();
		p.getScore();
		
		
		
		
	}
	public void updateScore()
	{
           long s=sc.nextLong();
           long ns=s+p.getScore();
           p.setScore(ns);
	
	
	}
	
}
	
	
	
	


