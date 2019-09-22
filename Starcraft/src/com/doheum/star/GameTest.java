package com.doheum.star;

public class GameTest {

	public static void main(String[] args) {		
		Marine m1 = new Marine();	
		Marine m2 = new Marine();		
		FireBat f1 = new FireBat();
		FireBat f2 = new FireBat();
		
		System.out.println("m1.hp : " + m1.hp);
		System.out.println("m2.hp : " + m2.hp);
		System.out.println("m1.powerOfAttack : " + m2.powerOfAttack);
		
		m1.attack(m2);
		m1.attack(f1);
		System.out.println("m1.hp : " + m1.hp);
		System.out.println("m2.hp : " + m2.hp);
	
		f1.attack(f2);
		f1.attack(m1);
	}

}








