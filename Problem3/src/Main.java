public class Main {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};

        System.out.println(maxProfit(arr));
    }


    /*
    * Brute force , taking one element and checking difference between all the other elements in the array whose are
    *  having greater than value of the selected element . we have max value in which we store the mac=x difference.
    * */

    public static  int maxProfit(int[] arr){
        int l = arr.length;
        int[] accArr = new int[l];

        int acc = 0;
        for(int i=0;i<l;i++){
            acc += arr[i];
            accArr[i] = acc;
        }

        int max = Integer.MIN_VALUE;

        for(int i=0;i<l;i++){
            for(int j=i;j<l;j++){
                if(arr[i] < arr[j]){
                    int temp = arr[j] - arr[i];
                    if(max < temp){
                        max = temp;
                    }
                }
            }
        }



        if(max < 0){
            return 0;
        }

        print(arr);
        print(accArr);

        return max;
    }

    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print( arr[i] + " , ");
        }

        System.out.println();
    }
}