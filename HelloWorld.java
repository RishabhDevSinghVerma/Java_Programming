/* 1
   1 2
   1 2 3
   1 2 3 4
   Print this Pattern
 */

import java.util.Scanner;
public class HelloWorld {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j<=n-i+1; j++) {

                System.out.print(n);
                n=n-1;


            }
            System.out.println();
        }

    }
}






