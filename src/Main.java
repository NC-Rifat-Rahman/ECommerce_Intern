import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main
{

    public static void main(String args[])
    {
        List<Products> products = new ArrayList<>();

        //Sort by Price
        Collections.sort(products, new SortbyPrice());
        for (int i = 0; i < products.size(); i++)
            System.out.println(products.get(i));

        //Sort by Name
        Collections.sort(products, new SortByName());
        for (int i = 0; i < products.size(); i++)
            System.out.println(products.get(i));

        Menubar bar = new Menubar();

        int userSelected;

        do
        {
            userSelected=bar.MenuData();

            switch (userSelected)
            {
                case 0:
                    FilterWithoutPrice fwp=new FilterWithoutPrice();
                    break;
                case 3:
                    FilterByPriceRange range = new FilterByPriceRange();
                    break;
                case 7:
                    Purchase purchase=new Purchase();
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
        while(userSelected>=8);

    }


}

