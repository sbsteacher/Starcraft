package com.doheum.star;

public class Medic extends Unit {
	
	public Medic() {
		this.max_hp = 40;
		this.hp = max_hp;
		this.speedMoving = 6;
	}
	
	void rescure(Unit unit) {
		if(unit.hp < unit.max_hp) {
			while(unit.hp < unit.max_hp) {
				unit.hp++;
			}
		}
	}
}
