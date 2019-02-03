import java.util.Scanner;

public class FractionSol {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int posCount=0;
        int negCount=0;
        int zeroCount=0;
        double arrLen= arr.length;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>0){
                posCount++;
                //System.out.println(posCount);
            }
            if(arr[i]<0){
                ++negCount;
            }
            if(arr[i]==0){
                ++zeroCount;
            }
        }
        System.out.println(posCount);
        System.out.println(arr.length);
        double posNums=posCount/arrLen;
        double negNums=negCount/arrLen;
        double zerNums=zeroCount/arrLen;
        System.out.println(posNums);
        System.out.println(negNums);
        System.out.println(zerNums);
    }

   

    public static void main(String[] args) {
       

        int[] arr = new int[6];

        
        int arrItems1[] = {-4, 3, -9, 0, 4, 1};

        for (int i = 0; i < 6; i++) {
            int arrItem = arrItems1[i];
            arr[i] = arrItem;
        }

        plusMinus(arr);

        
    }
}