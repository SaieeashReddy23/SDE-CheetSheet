public class Main {
    public static void main(String[] args) {
        int[] arr = {0,1,2,0,1,2,1,2,0,0,0,1};
        print(arr);
        sortArray(arr);
        print(arr);
    }


    /*
    *
    * Sorting the 0's ,  1's , 2's  in an array
    *
    * */
    public static void sortArray(int[] arr){

        int l = arr.length;

        int[] count = new int[3];

        for(int i=0;i<l;i++){
            count[arr[i]]++;
        }

        int k = 0;
        int i=0;
        while(i < l){
            while(count[k] > 0 && i < l){
                arr[i] = k;
                count[k]--;
                i++;
            }
            k++;
        }
    }

    public static void swap(int[] arr,  int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static  void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}