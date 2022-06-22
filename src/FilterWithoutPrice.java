import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FilterWithoutPrice
{
    public static void main(String args[])
    {
        List<Products> products = new ArrayList<>();

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
    }

}
