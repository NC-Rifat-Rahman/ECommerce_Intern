import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Purchase
{
    public static void main(String args[])
    {
        List<Products> products = new ArrayList<>();

        int stockAmount=Products.getAmounInstock();
        //int enterAmount=sc.nextInt();
        int enterAmount=10;

        if(stockAmount>=enterAmount)
        {
            Date date = new Date();
            //System.out.print(date);

            stockAmount-=enterAmount;

            try {
                FileWriter myWriter = new FileWriter("purchaselog.txt");
                myWriter.write(date.toString());
                myWriter.write(Products.getName());
                myWriter.write(stockAmount);

                String x= String.valueOf(Products.getPrice());
                myWriter.write(x);

                myWriter.close();
            }
            catch (IOException e)
            {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
        else
        {
            //TO-DO
        }
    }

}
