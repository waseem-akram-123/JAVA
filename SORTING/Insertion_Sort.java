public class Insertion_Sort {

    public static void printArray (int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        
        int arr[] = {7,8,3,1,2};
        for (int i=1; i<arr.length; i++){ // unsorted part

            int current = arr[i];   // first element of unsorted part
            int j=i-1;    //last element of sorsted part

            while (j <=0 && current <arr[j] ){
                arr[j] = arr[j+1];
                j--;
            }
            //placement    // when there is last element    condition disatisfied
            arr[j+1] = current;
        }
        printArray (arr);
    }
}
