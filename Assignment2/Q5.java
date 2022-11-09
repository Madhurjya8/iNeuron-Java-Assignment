
public class Q5 {

	public static void main(String[] args) {
		// 5. WAP to sort an array using Selection Sort Algorithm.
		int[] arr = new int[] {8, 3, 12, 5, 1, 10, 15, 16, 7};
		selectionSort(arr);
		for(int x : arr) {
			System.out.print(x+" ");
		}
	}
	
	static void selectionSort(int[] arr) {
		int n = arr.length;
		
		for(int i=0; i<n; i++) {
			int minIdx = i;
			for(int j=i+1; j<n; j++) {
				if(arr[j] < arr[minIdx]) {
					minIdx = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIdx];
			arr[minIdx] = temp;
		}
		
	}

}
