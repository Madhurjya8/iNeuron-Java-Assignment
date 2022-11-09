
public class Q4 {

	public static void main(String[] args) {
		// 4. WAP to sort an array using Merge Sort Algorithm.
		int[] arr = new int[] {8, 3, 12, 5, 1, 10, 15, 16, 7};
		int l=0, r=arr.length-1;
		mergeSort(arr, l, r);
		for(int x : arr) {
			System.out.print(x+" ");
		}

	}
	
	static void mergeSort(int[] arr, int l, int r) {
		if(l < r) {
			int mid = l + (r-l)/2;
			mergeSort(arr, l, mid);
			mergeSort(arr, mid+1, r);
			merge(arr, l, mid, r);
		}
	}
	
	static void merge(int[] arr, int l, int m, int r) {
		int len1 = m-l+1, len2 = r-m;
		int[] left = new int[len1];
		int[] right = new int[len2];
		
		for(int i=0; i<len1; i++) {
			left[i] = arr[l+i];
		}
		
		for(int i=0; i<len2; i++) {
			right[i] = arr[m+1+i];
		}
		
		int i=0, j=0, k=l;
		while(i<len1 && j<len2) {
			if(left[i] <= right[j]) {
				arr[k] = left[i];
				i++;
			} else {
				arr[k] = right[j];
				j++;
			}
			k++;
		}
		
		while(i<len1) {
			arr[k] = left[i];
			i++;
			k++;
		}
		while(j<len2) {
			arr[k] = right[j];
			j++;
			k++;
		}
	}

}
