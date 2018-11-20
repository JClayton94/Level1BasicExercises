package exercises;

public class LevelOneBasic {

	public static void main(String[] args) {
		
		boolean isAdd = true;
		
		int[] numArray = new int[10];
		
		for(int j = 0; j < 10; j++) {
			
			numArray[j] = j;
			
		}
		
		System.out.println(addNumbers(1,1,true));
		//System.out.println(helloWorld());
		
		for(int k = 0; k < numArray.length; k++) {
			
			System.out.println(numArray[k]);
			
		}

		for(int i = 0; i < 10; i++) {
			System.out.println(addNumbers(i,numArray[i],isAdd));
		}

	}
//	public static String helloWorld() {
//
//		return "Hello World!";
//
//	}
	public static int addNumbers(int firstNum, int secNum, boolean isAdd) {
		if(firstNum == 0) {
			return secNum;
		}
		else if(secNum == 0) {
			return firstNum;
		}
		if(isAdd) {
			return firstNum + secNum;
		}
		else {
			return firstNum*secNum;
		}
	}

}
