import java.util.Comparator;

public class SortbyPrice implements Comparator<Products>
{
    public int compare(Products a, Products b)
    {
        return (int) (a.getPrice() - b.getPrice());
    }
}
