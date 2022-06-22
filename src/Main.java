import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main
{
    public static void main(String args[])
    {
        // Add products
        List<Products> products = new ArrayList<>();

        Products products1 = new Products(1,"Nokia C30","Nokia C30 smart phone",
                "Mobile","Nokia", 25000.00F,23,Availibility.Instock);
        products.add(products1);

        Products products2 = new Products(2,"Samsung galaxy","Samsung galaxy smart phone",
                "Mobile","Samsung", 20000.00F,14,Availibility.Instock);
        products.add(products2);

        Products products3 = new Products(3,"Asus Rog Strix","DDR5 GPU",
                "GPU","Asus", 25000.00F,10,Availibility.Instock);
        products.add(products3);

        Products products4 = new Products(4,"HyperX Cloud 2","Surround Headset",
                "Headset","HyperX", 35000.00F,11,Availibility.Instock);
        products.add(products4);

        //System.out.println(products);


        // Write file in data.txt

        try
        {
            var myconsole = new PrintStream(new File("data.txt"));
            System.setOut(myconsole);
            myconsole.println(products);
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e);
        }

        Scanner sc = new Scanner(System.in);
        //String cate=sc.nextLine();
        String cate="GPU";
        String br="Nokia";

        cate.toLowerCase();
        br.toLowerCase();


        // Filter products by category,brand,availability
        List<Products> filtered = products.stream()
                .filter(productfilter -> productfilter.getCategory().toLowerCase().equals(cate))
                .filter(productfilter -> productfilter.getBrand().toLowerCase().equals(br))
                .filter(productfilter -> productfilter.getAvailibility().equals(Availibility.Instock))
                .collect(Collectors.toList());

        //float startPrice=sc.nextFloat();
        //float endPrice=sc.nextFloat();


        // Filter by price range
        float startPrice=1000.0F;
        float endPrice=2000.0F;

        if(Products.getPrice()>=startPrice && Products.getPrice()<=endPrice)
        {
            List<Products> filteredPrice = products.stream()
                    .filter(pricefilter -> pricefilter.getName().equals(startPrice))
                    .collect(Collectors.toList());
            System.out.println(filteredPrice);
        }

        System.out.println(filtered);


        // Purchase
        int stockAmount=Products.getAmounInstock();
        int enterAmount=sc.nextInt();

        if(stockAmount>=enterAmount)
        {
            System.out.println("a");
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
                System.out.println("Successfully wrote to the file.");
            }
            catch (IOException e)
            {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
        else
        {
            //throw exception
        }



    }
}
