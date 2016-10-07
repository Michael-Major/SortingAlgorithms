
public class SelectionSort {
	public static void main(String[] args){
		int[] myArray = {10,2,4,6,5,7,8};
		 printArray(myArray);
		for(int i = 0; i < myArray.length - 1; i++){
			int index = i;
			for(int j = i+1; j < myArray.length; j++){
				if(myArray[index] > myArray[j])
					index = j;
			}
			int temp = myArray[i];
			myArray[i] = myArray[index];
			myArray[index] = temp;
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
