public class BubbleSort {
	static int[] bubbleSort(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			int swapped = 0;
			for(int j=0; j<arr.length-i-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1] = temp;
					swapped = 1;
				}
			}
			if(swapped  == 0) {
				break;
			}
		}
		return arr;
	}
	
	
	public static void main(String[] args) {
	int[] arr = {3,6,5,1,2,4};
	int[] result = bubbleSort(arr);
		for(int i=0; i<result.length; i++) {
		System.out.print(result[i]+" ");
		}
	}
}
