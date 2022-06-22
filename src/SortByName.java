import java.util.Comparator;

public class SortByName implements Comparator<Products>
{
        public int compare(Products a, Products b)
        {
            return a.getName().compareTo(b.getName());
        }
}
