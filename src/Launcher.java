import java.util.Scanner;

public class Launcher {
    public static void  main(String[] args){
        System.out.print("Bonjour\n");
        while(true)
        {
                Scanner scanner = new Scanner( System.in );
                String a = scanner.nextLine();
                if (a.equals("quit"))
                {
                    break;
                }
                if (a.equals("fibo"))
                {
                    int nb = scanner.nextInt();
                    if (nb == 0)
                    {
                        System.out.println("1");
                    }
                    else if (nb == 1)
                    {
                        System.out.println("1");
                    }
                    else if (nb > 1)
                    {
                        int f1 = 1;
                        int f2 = 1;
                        int nb2 = 0;
                        for (int j = 2; j < nb ;j++)
                        {
                            nb2 = f1 + f2;
                            f1 = f2;
                            f2 = nb2; 
                        }
                        System.out.println(nb2);
                    }
                }
                else 
                {
                    System.out.print("Unknown command\n");
                }
                
        }
    }
}