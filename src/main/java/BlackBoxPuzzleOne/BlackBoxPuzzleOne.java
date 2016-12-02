package BlackBoxPuzzleOne;

public class BlackBoxPuzzleOne {
	
	public BlackBoxPuzzleOne (){
		
	}
	
	public static void main(String[] args) {
		YellowButton yb = new YellowButton();
		GreyLen gl = new GreyLen();
		RedBar rb = new RedBar();   
		BlueBar bb  = new BlueBar();
		
		gl.setLen(16);
		float firstAdd = (float) gl.getLen()/16;
		float twoAdd = firstAdd * 2;
		float threeAdd = firstAdd * 4;
		float fourAdd = firstAdd * 8;
		
		BlueButton blueOne = new BlueButton();
		BlueButton blueTwo = new BlueButton();
		BlueButton blueThree = new BlueButton();
		BlueButton blueFour = new BlueButton();
		
		yb.pressedFlag = true;
		
		if(yb.pressedFlag){
			rb.spike();
			bb.spike(firstAdd);
		}
		
		blueOne.press();		
		rb.increment();
		bb.increment(firstAdd);
		
		blueTwo.press();
		rb.increment();
		bb.increment(twoAdd);
		
		blueThree.press();
		rb.increment();
		bb.increment(threeAdd);
		
		blueFour.press();
		rb.increment();
		bb.increment(fourAdd);
		
		yb.pressedFlag = true;
		if(yb.pressedFlag){
			rb.spike();
			bb.spike(firstAdd);
			rb.showCursor();
			bb.showCursor();
		}
		
		blueThree.pop();
		rb.decrement();
		bb.decrement(threeAdd);
		
	}
	
}