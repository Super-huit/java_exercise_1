import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toMap;

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
                else if (a.equals("fibo"))
                {
                    System.out.println("La Question");
                    int nb = scanner.nextInt();
                    if (nb == 0)
                    {
                        System.out.println("1");
                    }
                    else if (nb == 1 || nb == 2)
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
                else if (a.equals("freq"))
                {
                    System.out.println("La Question");
                    String b = scanner.nextLine();
                    Path path = Paths.get(b);
                    try {
                        String content = java.nio.file.Files.readString(path);
                        content = content.toLowerCase(Locale.ROOT);
                        String[] words = content.split(" ");
                        List<String> list = Arrays.asList(words);
                        Map<Object, Integer> frequencyMap = list.stream()
                                .collect(toMap(
                                        s -> s, // key is the word
                                        s -> 1, // value is 1
                                        Integer::sum));
                        List<Object> res = list.stream()
                                .sorted(comparing(frequencyMap::get).reversed()) // sort by descending frequency
                                .distinct() // take only unique values
                                .limit(3)   // take only the first 10
                                .collect(toList()); // put it in a returned list
                        for(int i=0;i<3;i++)
                        {
                            System.out.print(res.get(i)+" ");
                        }
                        System.out.println();

                        
                    } catch (Exception e) {
                        System.out.println("Unreadable file: " + e.toString());
                    }
                    
                }
                else 
                {
                    System.out.print("Unknown command\n");
                }
                
        }
    }
}