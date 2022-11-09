
public class Q3 {

	public static void main(String[] args) {
		//	3. WAP to sort an array using Bubble Sort Algorithm.
		int[] arr = new int[] {8, 3, 12, 5, 1, 10, 15, 16, 7};
		
		bubbleSort(arr);
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}
	
	static void bubbleSort(int[] arr) {
		int n = arr.length;
		boolean swapped;
		
		for(int i=0; i<n; i++) {
			swapped = false;
			for(int j=0; j<n-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					// swap
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
					swapped = true;
				}
			}
			if(!swapped)
				break;
		}
		
	}

}
