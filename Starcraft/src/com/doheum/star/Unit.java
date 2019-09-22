package com.doheum.star;

public class Unit {
	int hp; 
	int powerOfAttack;
	int speedMoving;
	int x;
	int y;
	
	//이동할 수 있음
	void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	void attack(Unit enemy) {
		//enemy.hp = enemy.hp - this.powerOfAttack;
		enemy.hp -= this.powerOfAttack;
	}
	
	@Override
	public String toString() {
		return String.format("나의 위치는 %d, %d이다", this.x, this.y);
	}
	
	
}
