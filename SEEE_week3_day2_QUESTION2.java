import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  public static void main(String... args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    if (n <= 0)
    {
      System.out.println("Invalid Input");
    }
      else
      {
        for (int i = 1; i <= n; i++)
           {
             for (int j = 1; j <= i; j++)
           {
              System.out.print("&");
        }
        System.out.println();
      }
    }
  }
}
