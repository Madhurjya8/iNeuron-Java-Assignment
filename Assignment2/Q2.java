
public class q2 {

	public static void main(String[] args) {
		//2. WAP to sort an array using Quick Sort Algorithm.
		int[] arr = new int[] {8, 3, 12, 5, 1, 10, 15, 16, 7};
		int n = arr.length;
		qSort(arr, 0, n-1);
		for(int x: arr) {
			System.out.print(x+" ");
		}
		System.out.println();

	}
	static void qSort(int[] arr, int l, int h) {
		if(l<h) {
			int p = partition(arr, l, h);
			qSort(arr, l, p);
			qSort(arr, p+1, h);
		}
	}
	
	// Hoare's Partition
	static int partition(int[] arr, int l, int h) {
		int pivot = arr[l];
		int i = l-1, j=h+1;
		
		while(true) {
			do {
				i++;
			} while(arr[i] < pivot);
			
			do {
				j--;
			} while(arr[j] > pivot);
			
			if(i>=j) 
				return j;
			// swap arr[i] and arr[j]
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}

}
