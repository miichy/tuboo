package BlackBoxPuzzleOne;

public class GreyLen {
	
	public float len = 0;//<16
	
	public void setLen(float l){
		if(l > 16 | l < 0)
			throw new IllegalArgumentException();
		
		len = l;
	}
	
	public float getLen(){
		return len;
	}

}
