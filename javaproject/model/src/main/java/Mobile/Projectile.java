package Mobile;

import contract.IProjectile;

public class Projectile extends Mobile implements IProjectile{

	public Projectile(int x, int y) {
		super(x, y);
		
		// TODO Auto-generated constructor stub
	}
	public void changeDirection(){
		if(dir == 1){
			dir = 2;
		}
		else if(dir == 2){
			dir = 1;
		}
		else if(dir == 3){
			dir = 4;
		}
		else if(dir == 4){
			dir = 3;
		}
	}

}
