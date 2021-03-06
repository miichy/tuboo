package BlackBoxPuzzleOne;

public class BlueBar implements Bar{
	
	public float maxLen = 16;
	public float currenCursor = 0;
	public float offset;
	
//	public BlueBar(float offset){
//		this.offset = offset;
//	}
	
	public void setMaxLen(float a){
		maxLen = a;
	}
	
	public void setCurrentCursor(float a){
		currenCursor = a;
	}

	@Override
	public Float showCursor() {
		System.out.println(currenCursor);
		return currenCursor;
	}

	@Override
	public Float spike() {
		System.out.println(currenCursor);
		return currenCursor;
	}
	
	public Float spike(float f){
		System.out.println(currenCursor + f);
		return currenCursor + f;
	}

	@Override
	public Float increment() {
		currenCursor += this.offset;
		System.out.println(currenCursor);
		return currenCursor;
	}
	
	public Float increment(float f){
		currenCursor += f;
		System.out.println(currenCursor);
		return currenCursor;
	}

	@Override
	public Float decrement() {
		currenCursor -= this.offset;
		System.out.println(currenCursor);
		return currenCursor;
	}
	
	public Float decrement(float f){
		currenCursor -= f;
		System.out.println(currenCursor);
		return currenCursor;
	}

}
