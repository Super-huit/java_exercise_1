import java.util.Scanner;

public class Launcher {
    public static void  main(String[] args){
        System.out.print("Bonjour\n");
        while(1==1)
        {
                Scanner scanner = new Scanner( System.in );
                String a = scanner.nextLine();
                if (a.equals("quit"))
                {
                    break;
                }
                System.out.print("Unknown command\n");
        }
    }
}