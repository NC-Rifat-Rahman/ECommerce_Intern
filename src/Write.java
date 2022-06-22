import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Write {

    public static void main(String args[])
    {
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
    }
}
