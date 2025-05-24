import java.util.Arrays;

public class day2 {



    //bubble sorting
   public static void bubbleShort(int[] arr){
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-i-1;j++){
               if (arr[j]>arr[j+1]) {
                   int temp = arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
               }
            }
        }
        printArray(arr);
    }

 //selection shorting
 public static void selectionShort(int[] arr){
     for (int i=0;i<arr.length-1;i++){
         int small =i;
         for (int j=i+1;j<arr.length;j++){
             if (arr[small]>arr[j]) {
                 small = j;
             }
         }
         int temp = arr[small];
         arr[small]=arr[i];
         arr[i]=temp;
     }
     printArray(arr);
 }

//print array method
    public static void printArray(int[] arr){
       for (int e:arr){
           System.out.print(" "+e);
       }
    }

    //main function
    public static void main(String[] args){
        //Find the “Kth” max and min element of an arra
    /*Approach (Java):
    Sort the array.
    Kth min = arr[k-1]
    Kth max = arr[n-k]
*/
        int []arr={2,4,7,4,8,9,1};
//        int temp =0;
//        int k=3;
//        Arrays.sort(arr);
//
//        for (int e : arr){
//            System.out.println(e);
//        }
//        int kth_min =arr[k-1];
//        int kth_max =arr[arr.length-k];
//        System.out.printf("kth Max = %d and kth Min = %d",kth_max,kth_min);
       // bubbleShort(arr);
        selectionShort(arr);
    }


}
