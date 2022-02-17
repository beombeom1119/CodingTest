import java.util.Scanner;

public class BackJun1330 {

    public static void main(String[] args) {

        int a;
        int b;

        Scanner bum = new Scanner(System.in);
        a = bum.nextInt();
        b = bum.nextInt();

        if (a < b)
        {
            System.out.println("<");
        }
        else if (a>b)
        {
            System.out.println(">");
        }
        else
        {
            System.out.println("==");
        }
    }
}
