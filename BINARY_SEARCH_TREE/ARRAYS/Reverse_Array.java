public class Reverse_Array {
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5};

        int n= arr.length;

        for (int i=0; i<n/2; i++){
            int firstval = arr[i];
            int lastval = arr[n-i-1];

            arr[i] = lastval;
            arr[n-i-1] = firstval;
        }
        for (int i=0; i<n; i++){
            System.out.print(arr[i]);
        }
    }
}
