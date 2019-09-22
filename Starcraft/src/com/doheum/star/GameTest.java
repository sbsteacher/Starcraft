package com.doheum.star;

public class GameTest {

	public static void main(String[] args) {
		Medic medic1 = new Medic();
		Medic medic2 = new Medic();
		
		Marine m1 = new Marine();	
		Marine m2 = new Marine();		
		FireBat f1 = new FireBat();
		FireBat f2 = new FireBat();
		
		m1.attack(f1);
		m1.attack(f1);
		m1.attack(f1);
		
		System.out.println(f1.hp);
		
		medic1.rescure(f1);
		
		System.out.println(f1.hp);
	}

}








