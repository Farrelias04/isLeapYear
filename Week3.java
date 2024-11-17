import java.util.Scanner;

public class Week3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");

        int x = input.nextInt();
        input.nextLine();

        if(x > 0)
        {
            System.out.println(x + " is positive");
        }
        else
        {
            System.out.println(x + " is not positive");
        }

        /* To see if the value, x, is even or odd */
        boolean b = (x % 2 == 0);

        System.out.println(b);

        //Day object
        Day d = new Day(25, 12, 1966);
        System.out.println(d);
        //This particular section code works with Day.java

        System.out.println(d.newYear());

        System.out.println(d.isCentury());
        //as mentioned before, this works with Day.java source file, similar to Python
    }
}
