import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterByPriceRange
{
    public static void main (String args[])
    {
        List<Products> products = new ArrayList<>();

        // Filter by price range
        //float startPrice=sc.nextFloat();
        //float endPrice=sc.nextFloat();

        float startPrice=1000.0F;
        float endPrice=2000.0F;

        if(Products.getPrice()>=startPrice && Products.getPrice()<=endPrice)
        {
            List<Products> filteredPrice = products.stream()
                    .filter(pricefilter -> Boolean.parseBoolean(pricefilter.getName()))
                    .collect(Collectors.toList());
            System.out.println(filteredPrice);
        }
        else
        {
            // TO-DO
        }
    }

}
