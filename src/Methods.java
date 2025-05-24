import java.security.Principal;
import java.util.Scanner;

public class Methods {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String name = "Piyush";

        PrintHello(name , 20);

    }



        static void PrintHello(String name , int age){
            System.out.println("Hello! "+name+ " you are " +age+
                    " years old");
        }


}
