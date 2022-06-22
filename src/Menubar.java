import java.util.Scanner;

public class Menubar
{
    public static int MenuData()
    {
        int selection;
        Scanner sc = new Scanner(System.in);

        System.out.println("Select option");

        selection=sc.nextInt();

        return selection;
    }
}
