import java.util.Scanner;
import java.util.Random;

public class learn {
    public static void main(String[] args){
//       System.out.println("Hello World");
//
//        int age=20;
//        double price = 19.99;
//        char grad = 'A';
//        boolean isStudent = true;
//        String name = "Piyush";
//        System.out.println("I am "+age+" old");
//        System.out.println("I have "+price+"rs");
//        System.out.println("My grad is "+ grad);
//        System.out.println("My name is "+name);
//
//        if(isStudent){
//            System.out.println("I are a Student");
//        }else{
//            System.out.println("I are not Student");
//        }

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        boolean  isHeads = random.nextBoolean();

        if(isHeads){
            System.out.println("Heads");
            System.out.println();
        }
        else{
            System.out.println("Tails");
        }


//        System.out.print("Enter your name: ");
//        String name = sc.nextLine();
//        System.out.print("Enter your age: ");
//        int age = sc.nextInt();
//        System.out.println("Your name is "+ name);
//        System.out.println("you are "+age+" Years old");


        sc.close();
    }
}
