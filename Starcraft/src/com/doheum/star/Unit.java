package com.doheum.star;

public class Unit {
	int max_hp;
	int hp; 
	int speedMoving;
	int x;
	int y;
	
	//이동할 수 있음
	void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return String.format("나의 위치는 %d, %d이다", this.x, this.y);
	}
	
	
}
