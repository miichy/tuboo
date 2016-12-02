package BlackBoxPuzzleOne;

public class YellowButton {
	
	public boolean pressedFlag = false;
	
	public void click(){
		pressedFlag = true;
	}
	
	public boolean getPressedStatus(){
		return pressedFlag;
	}

}
