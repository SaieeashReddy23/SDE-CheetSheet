public class Main2 {

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(maxSubArraySum(arr));
    }


    // This is kandans solution ,o(N).

    public static int maxSubArraySum(int[] arr){

     int l = arr.length;

     int currSum = 0;
     int max = Integer.MIN_VALUE;

     int s = 0;
     int start = 0;
     int end = 0;

     for(int i=0;i<l;i++){
         currSum += arr[i];

         if(currSum > max){
             max = currSum;
             start = s;
             end = i;
         }
         if(currSum < 0){
             currSum = 0;
             s = i+1;
         }

     }

        System.out.println("Start :" + start);
        System.out.println("End :" + end);
     return max;
    }

    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
