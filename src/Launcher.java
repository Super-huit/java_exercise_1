import java.util.Scanner;

public class Launcher {
    public static void  main(String[] args){
        System.out.print("Bonjour\n");
        try ( Scanner scanner = new Scanner( System.in ) ) {
                string a = scanner.nextInt();
                if (a != "quit")
                {
                    System.out.print("Unknown command");
                }
        }
        }
    }
}