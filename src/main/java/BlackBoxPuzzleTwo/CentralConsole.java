package BlackBoxPuzzleTwo;

/**
 * redBubble light on  &  blueBubble off;red bar can not control;
 * redBubble off & blueBubble on;blue bar can not control,show add 10;
 * redBubble on & blueBubble on ;  blue bar and red bar both can control;
 * 
 * greenBuble on : grey bar double
 * greenBuble off: grep bar equal
 * 
 * @author liuke
 *
 */

public class CentralConsole {
	
	private boolean greenBulbCentral = false;
	private boolean blueBulbCentral = false;
	private boolean redBulbCentral = false;
	
	private double  greyBarLen = 0;
	private double  blueBarLen = 0;
	private double  redBarLen = 0;
	
	private boolean greenButtonPressed = false;
	private boolean redButtonPressed = false;
	private boolean blueButtonPressed = false;
	
	private boolean littleRedBulb = true;
	private boolean littleBlueBulb = true;
	
	private double dialCentral = 0;//max = 40
	private double dialRed = 0;
	private double dialBlue = 40;
	
	public double setGreyBarLen(double len){
		greyBarLen = len;
		if(greenBulbCentral)
			dialCentral = len;
		else 
			dialCentral = len * 2;
		
		return dialCentral;
	}
	
	public void setBlueBarLen(double len) throws Exception{
		blueBarLen = len;
		if(littleRedBulb){
			dialRed = len;
		}else if (redBulbCentral){
			dialCentral = len;
		}else{
			throw new Exception("no red Bulb light!");
		}
	}
	
	public void setRedBarLen (double len) throws Exception{
		redBarLen =  len;
		if(littleRedBulb){
			dialBlue = redBarLen - len;
		}else if(redBulbCentral){
			dialCentral = dialCentral - len;
		}else{
			throw new Exception("no blue Bulb light!");
		}
		
	}
	
	public void pressGreen(){
		greenButtonPressed = true;
		greenBulbCentral = true;
	}
	
	public void popGreen(){
		greenButtonPressed = false;
		greenBulbCentral = false;
	}
	
	public void pressRed(){
		redButtonPressed = true;
		redBulbCentral = true;
		littleRedBulb = false;
	}
	
	public void popRed(){
		redButtonPressed = false;
		redBulbCentral = false;
		littleRedBulb = true;
	}
	
	public void pressBlue(){
		blueButtonPressed = true;
		blueBulbCentral = true;
		littleBlueBulb = false;
	}
	
	public void popBlue(){
		blueButtonPressed = false;
		blueBulbCentral = false;
		littleBlueBulb = true;
	}

}
