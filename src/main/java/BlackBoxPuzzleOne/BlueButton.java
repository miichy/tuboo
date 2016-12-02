package BlackBoxPuzzleOne;

public class BlueButton {

	public boolean pressed = false;

	public void press(){
		this.pressed = true;
	}
	
	public void pop(){
		this.pressed = false;
	}
	
	public boolean getPressedStatus(){
		return pressed;
	}
	
}
