import java.util.ArrayList;
import java.util.Iterator;

/**
 * The class represents sales items on an online e-commerce site (such as Amazon.com).
 * SalesItem objects store all information relevant to this item, including description,
 * price, customer comments, etc.
 * 
 * NOTE: The current version is incomplete! Currently, only code dealing with customer 
 * comments is here.
 * 
 * @author Michael Kölling and David J. Barnes
 * @version 0.1 (2016.02.29)
 */
public class OnlineShop
{

 public static void main(String[] args){
     SalesItem item = new SalesItem("item 1", 299);

     System.out.println("Name: "+item.getName());
     System.out.println("Price: "+item.getPrice());
 }

}
