
public class BubbleSort {
	public static void main(String[] args){
		boolean switchedSomething = true;
		int[] myArray = {2,3,5,1,4,6,8,7,9,10};
		printArray(myArray);
		for(int i = 0; i < myArray.length && switchedSomething == true; i ++){
			switchedSomething = false;
			for(int j = 1; j < myArray.length - i; j++){
				if(myArray[j] < myArray[j-1]){
					int temp = myArray[j];
					myArray[j] = myArray[j-1];
					myArray[j-1] = temp;
					switchedSomething = true;
				}
			}
		}
		printArray(myArray);
	}
	public static void printArray(int[] a){
		for(int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}
		System.out.println();
	}
}
