public class Invoice 
{
    private int item_number;
    private String name;
    private int quantity;
    private double price;
    private double total_cost;
	private double total_amount;
    
	public Invoice(){
		
	}
    public Invoice(int item_num, String nm, int quan, double pri)
    {
        item_number = item_num;
        name = nm;
        quantity = quan;
        price = pri;
        total_cost = 0;
		
    }
    
    public int getitem_number()
    {
        return item_number;
    }
    public String getname()
    {
        return name;
    }
    public int getquantity()
    {
        return quantity;
    }
    public double getprice()
    {
        return price;
    }
    public double gettotal_cost()
    {
        return total_cost;
    }  
      public double gettotal_amount()
    {
        return total_amount;
    }    
    public void  setitem_number( int item_n)
    {
        item_number = item_n;
		
    }
    public void setname(String n)
    {
        name = n;
    }
    public void setquantity(int quan)
    {
        quantity = quan;
        total();
    }
    public void setprice(double pri)
    {
        price = pri;
        total();
    }
    public void total()
    {
        total_cost = price * quantity;
	   total_am();
		
    } 
	public  double total_am()
    {
       total_amount = total_cost;
	   return total_amount;
    } 
    public void displayLine()
    {
        System.out.print(item_number);
        System.out.print("\t\t \b\b"+name);
        System.out.print("\t\t "+quantity);
        System.out.print("\t \t"+price);
        System.out.print("\t \t"+total_cost);
    } 
	
	
}
