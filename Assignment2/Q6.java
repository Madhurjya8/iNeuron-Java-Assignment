
public class Q6 {

	public static void main(String[] args) {
		// 6. WAP to check whether an array is a subset of another array.
		int arr1[] = { 8, 3, 12, 5, 1, 10, 15, 16, 7 };
        int arr2[] = { 10, 5, 17 };
 
        
 
        if (isSubset(arr1, arr2))
            System.out.print("Array 2 is a subset of Array 1");
        else
            System.out.print("Array 2 is not a subset of Array 1");

	}
	
	static boolean isSubset(int arr1[], int arr2[])
	{
		int len1 = arr1.length;
        int len2 = arr2.length;
        if(len1 < len2)
        	return false;
        
		for (int i = 0; i < len2; i++) {
			boolean found = false;
			for (int j = 0; j < len1; j++) {
				if (arr2[i] == arr1[j]) {
					found = true;
					break;
				}	
			}
				
			if (!found)
				return false;
		}
		
		return true;
	}

}
