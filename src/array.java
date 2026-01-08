public class array {

    public static void main(String[] args){
        int[][] array ={
                {2,5,9},
                {4,6,8}
        };

        for(int i =0 ; i< array.length;i++){
            for(int j = 0 ; j< 3;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

    }
}
