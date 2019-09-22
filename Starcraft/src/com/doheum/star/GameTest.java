package com.doheum.star;

public class GameTest {

	public static void main(String[] args) {
		SiegeTank st1 = new SiegeTank();
		SiegeTank st2 = new SiegeTank();
		
		Medic medic1 = new Medic();
						
		st1.attack(st2);
		
		System.out.println(st2.hp);		
		medic1.cure(st2);
		System.out.println(st2.hp);
		
		System.out.println("------------");
		FireBat fb1 = new FireBat();
		st1.attack(fb1);
		
		System.out.println(fb1.hp);		
		medic1.cure(fb1);
		System.out.println(fb1.hp);
	}

}








