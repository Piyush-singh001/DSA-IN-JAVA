import java.util.Random;
import java.util.Scanner;


public class stringMethod {
    public static void main(String[] args) throws InterruptedException {
     Scanner sc = new Scanner(System.in);

//     String name = "Piyush singh";
//     int length =name.length();
//     char letter = name.charAt(0);
//     int index = name.indexOf("s");
//     int lastindex = name.lastIndexOf("s");

//     name =name.toUpperCase();
//     name =name.toLowerCase();
//        name=name.trim();
//        name = name.replace("P","A");

//        String respons ="";
//        while(!respons.equals("Q")){
//            System.out.println("Enter the Q for Exit the loop");
//            respons = sc.next().toUpperCase();
//        }
//
//        int age ;
//        do{
//            System.out.println("Your age is can't be negative");
//            System.out.println("Enter the age: ");
//            age = sc.nextInt();
//        }while(age<0);

        //Number guessing game
//    Random random = new Random();
//    int number = random.nextInt(1,101);
//    int guessnum ;
//    int n=0;
//    do{
//        System.out.print("Enter the number under(1-100): ");
//        guessnum = sc.nextInt();
//        if(number < guessnum ){
//            System.out.println("Guess number is high ");
//        }else{
//            System.out.println("Guess number is low ");
//        }
//        n++;
//    }while (!(number == guessnum));
//        System.out.println("you guess the number in atampt "+ n);


        System.out.print("Enter the number: ");
        int n =sc.nextInt();
        for(int i = 1 ;i<=10 ;i++){
            System.out.println(n+ " * "+i+" = "+ n * i);
            Thread.sleep(1000);
        }
     sc.close();
    }
}
