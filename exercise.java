import java.util.Scanner;
public class exercise{
	public static void main (String[] args){
	   
    System.out.print("Inserisci un numero: ");
    int n = new Scanner(System.in).nextInt();
    
    int y = 0, cnt = 0, cnt2 = 0;


    for (int i = 1; i <= n; ++i)
    {
        for (int z = 1; z <= n - i; ++z) 
        {
        System.out.print("  "); //with 2 spaces to have the straight pyramid 
        ++cnt;
        }

        while (y != 2 * i - 1) 
        {
            //print the lines
            if (cnt <= n - 1) {
            System.out.print((i + y) + " ");
            ++cnt;
        }else
            {
                ++cnt2;
                System.out.print((i + y - 2 * cnt2) + " ");
            }

        ++y;
      }
      cnt2 = cnt = y = 0;

      System.out.println();
    }			
    }
}