//Bubble Sort, one of the most inefficient ways to sort a lot of array integers~
//It's important to know how it works, however.

public class bubbleSort{
	public static void main(String[] args) {
		//unsorted array with random ints
		int[] unsorted = {5, 21, 75, 65, 1, 41, 34};
		
		//Running our unsorted array into our bubble sort method
		int[] sorted = bubbleSortArray(unsorted);
		
		//Printing array
		for(int i = 0; i < unsorted.length; i++){
			System.out.println(sorted[i]);
		}
	}
	
	public static int[] bubbleSortArray(int[] arr){
		int tempVar = 0;
		
		//Loop through the array by number of ints it contains
		for(int i = 0; i < arr.length; i++){
			
			//Loop through the array
			//However we shorten how much we loop based on how many ints we've sorted
			for(int j = 0; j < arr.length - 1 - i; j++){
				int current = arr[j];
				int next = arr[j + 1];
				
				//If the current int is bigger than the int to its right then swap.
				if(current > next){
					tempVar = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tempVar;
					
				}
			}
		}
		
		return arr;
	}
}

