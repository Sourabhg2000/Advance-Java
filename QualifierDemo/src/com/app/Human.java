package com.app;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {
	@Autowired
	Heart heart;
 
	public Human() {
		System.out.println("Human Constructor");
	}

	//@Autowired
	public Human(Heart heart) {
		super();
		System.out.println("In Constructor---->");
		this.heart = heart;
	}

	//@Autowired
	public void setHeart(Heart heart) {
		System.out.println("In Setter----->");
		this.heart = heart;
	}
	
	public void pumping()
	{
		if(heart!=null)
		{
		heart.pump();
		}
		else
		{
			System.out.println("You are Dead!!!");
		}
	}

}
