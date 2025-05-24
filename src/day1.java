//Print the array in reverse order.
public class day1 {
    public static void main(String[] args) {
        int []arr ={3,5,7,2,6};
        for (int i=0;i< arr.length/2;i++){
            int temp = arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }

        for (int i : arr){
            System.out.print(i+" ");
        }
    }
}
