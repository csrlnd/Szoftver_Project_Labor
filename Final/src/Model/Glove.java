package Model;

public class Glove extends Equipment {

	private int lifeCounter;

	public void effect(Virologist v) {
		reduceLife();
	}
	
	@Override
	public void PickUpBy(Virologist v) {
		v.pickUp(this);
	}

	public void reduceLife(){
		lifeCounter--;
		if(lifeCounter == 0){
			super.getVirologist().remove(this);
		}
	}
}