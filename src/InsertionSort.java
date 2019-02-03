
public class InsertionSort {
	int i,j,key;
	public void insertionSort(int arr[]) {
		int n = arr.length;
		for(int j=1; j<n; j++) {
			key=arr[j];
			i=j-1;
			while(i>0 && arr[i]>key) {
				arr[i+1]=arr[i];
				i=i-1;
			}
			arr[i+1]=key;
		}
	}
	static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
 
        System.out.println();
    }
	public static void main(String[] args) {
		int arr[] = {8, 11, 13, 5, 6};
	    
	    InsertionSort insertion = new InsertionSort();
		insertion.insertionSort(arr);
		printArray(arr);
	}
}
