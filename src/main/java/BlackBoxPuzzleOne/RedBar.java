package BlackBoxPuzzleOne;

public class RedBar implements Bar{
	
	public int maxLen = 10;
	public int currentCursor = 0;

	public void setMaxLen(int len) {
		maxLen = len;
	}
	
	public void setCurrentCursor(int l){
		currentCursor = l;
	}

	@Override
	public Integer showCursor() {
		System.out.println(currentCursor);
		return currentCursor;		
	}

	@Override
	public Integer spike() {
		System.out.println(currentCursor + 2);
		return currentCursor;
	}
	
	public Integer spike(int i){
		System.out.println(currentCursor + 2);
		return currentCursor + 2;
	}

	@Override
	public Integer increment() {
		currentCursor += 2;
		System.out.println(currentCursor);
		return currentCursor;
	}

	@Override
	public Integer decrement() {
		currentCursor -= 2;
		System.out.println(currentCursor);
		return currentCursor;
	}
	
}
