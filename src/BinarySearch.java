import java.util.Arrays;

public class BinarySearch {
	
	static int binarySearch(int[] arr, int target) {
		Arrays.sort(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int l_index = 0;
		int r_index = arr.length-1;
		int result =0;
		int mid=0;
		while(l_index<=r_index) {
			mid = (l_index+r_index)/2;
			if(arr[mid]==target) {
				result=mid;
				break;
			}
			else if(target>arr[mid]) {
				l_index = mid+1;
			}
			else if(target<arr[mid]) {
				r_index = mid-1;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] arr = { 2, 6, 5, 1, 9, 3, 4, 8};
		int target = 8;
		int result = binarySearch(arr, target);
		System.out.println(result);
	}
}
