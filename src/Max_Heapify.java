
public class Max_Heapify {
	static void maxHeapify(int[] arr, int i) {
		int largest=0;
		int left = 2*i;
		int right = 2*i+1;
		if(left<=arr.length && arr[left-1]>arr[i-1] ) {
			largest = left-1;
		}
		else largest = i;
		if(right<=arr.length && arr[right-1]>arr[largest]) {
			largest = right-1;
		}
		if(largest != i) {
			int temp = arr[largest];
			arr[largest] = arr[i];
			arr[i]=temp;
			
		}		
		maxHeapify(arr, largest);
		for(int j=0; j<arr.length; j++) {
			System.out.print(arr[j]+" ");
		}
	}
	public static void main(String args[]){
		int[] arr = {6,5,9,0,8,2,7,1,3};
		maxHeapify(arr, 1);
	}
}
