package com.doheum.star;

public class GameTest {

	public static void main(String[] args) {
		Barrack barrack = new Barrack();
		
		
		
		Unit unit1 = barrack.makeUnit(1); //마린 주소값
		Unit unit2 = barrack.makeUnit(1); //마린 주소값
		Unit unit3 = barrack.makeUnit(1); //마린 주소값
		Unit unit4 = barrack.makeUnit(1); //마린 주소값
		
		
		unit1.hp -= 1;
		unit2.hp -= 2;
		unit3.hp -= 3;
		unit4.hp -= 4;
		
		System.out.println(unit1.hp);
		System.out.println(unit2.hp);
		System.out.println(unit3.hp);
		System.out.println(unit4.hp);
		
		System.out.println(unit1);
		System.out.println(unit2);
		System.out.println(unit3);
		System.out.println(unit4);
		
	}

}








