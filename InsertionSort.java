
public class InsertionSort {
	public static void main(String[] args){
		int temp = 0;
		int[] myArray = {10,2,4,6,5,7,8};
		printArray(myArray);
		for(int i = 1; i < myArray.length; i++){
			int current = myArray[i];
			for(int j = i-1; j >= 0 && current < myArray[j]; j--){
				myArray[j+1] = myArray[j];
				myArray[j] = current;
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
