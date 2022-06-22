import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile
{
    public static void main(String args[]) throws FileNotFoundException
    {
        FileInputStream fis = new FileInputStream("data.txt");
        Scanner in = new Scanner(fis);

        while(in.hasNext())
        {
            System.out.println(in.nextLine());
        }
    }
}
