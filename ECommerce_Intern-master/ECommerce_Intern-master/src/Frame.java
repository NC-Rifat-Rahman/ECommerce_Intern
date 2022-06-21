import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame implements ActionListener
{
    JMenuBar menuBar;
    JMenu filterProducts;
    JMenu price;
    JMenu name_price;
    JMenu purchase;
    JMenuItem category;
    JMenuItem brand;
    JMenuItem available;


    Frame()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

         menuBar = new JMenuBar();

         filterProducts = new JMenu("Products");
         price = new JMenu("Price");
         name_price = new JMenu("Name/Price");
         purchase = new JMenu("Purchase");

         category=new JMenu("Category");
         brand=new JMenu("brand");
         available=new JMenu("available");

         category.addActionListener(this);
         brand.addActionListener(this);
         available.addActionListener(this);

         filterProducts.add(category);
         filterProducts.add(brand);
         filterProducts.add(available);

         menuBar.add(filterProducts);
         menuBar.add(price);
         menuBar.add(name_price);
         menuBar.add(purchase);

         this.setJMenuBar(menuBar);
         this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==filterProducts)
        {

        }
    }
}
