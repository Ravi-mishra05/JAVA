package Dailly_Questions_LC;

public class FindLengthOfShortestSubarray {

    public static void main(String[] args) {

    }

    public static int findLengthOfShortestSubarray(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int count = 0;
        for(int x : arr) {
            smallest  = Math.min(smallest, x);
            largest = Math.max(largest, x);
        }

        for(int i= 0; i < arr.length -1; i++){
            if (arr[i] < arr[i+1]) {
                continue;
            }
        }



        return count;
    }
}
