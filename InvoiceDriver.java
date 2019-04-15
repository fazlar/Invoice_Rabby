import java.util.Scanner;
import java.text.SimpleDateFormat;  
import java.util.Date; 
import java.util.InputMismatchException; 
public class InvoiceDriver {
 
    public static void main(String[] args) {
        
      Invoice check1 = new Invoice(112, "Book", 3, 125.98);
      Invoice check2 = new Invoice(101, "Phone", 2, 456.35);
      Invoice check3 = new Invoice(187, "Laptop", 1, 2345.68);
	 
	 
      
      items(check1,check2, check3);
    }
    
    public static void items(Invoice chk1, Invoice chk2, Invoice chk3)
    {
		while(true){
		try{
        Scanner sn = new Scanner(System.in);
		Invoice to_am = new Invoice();
		System.out.println("Please enter Invoice SL Number: ");
		int sl = sn.nextInt();
		System.out.println("Please enter Cuatomer Name: ");
		String coname = sn.next();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
        Date date = new Date();
        //check1-----------------------------------------------------------
        System.out.println("Please enter Item Number: ");
        chk1.setitem_number(sn.nextInt());
        
        System.out.println("Please enter Item Name: ");
        chk1.setname(sn.next());
        
        System.out.println("Please enter quantity: ");
        chk1.setquantity(sn.nextInt());
        
        System.out.println("Please enter price: ");
        chk1.setprice(sn.nextDouble());
        //check2-----------------------------------------------------------
        System.out.println("Please enter Item Number: ");
        chk2.setitem_number(sn.nextInt());
        
        System.out.println("Please enter Item Name: ");
        chk2.setname(sn.next());
        
        System.out.println("Please enter quantity: ");
        chk2.setquantity(sn.nextInt());
        
        System.out.println("Please enter price: ");
        chk2.setprice(sn.nextDouble());
        //check3---------------------------------------------------------
        System.out.println("Please enter Item Number: ");
        chk3.setitem_number(sn.nextInt());
		
        
        System.out.println("Please enter Item Name: ");
        chk3.setname(sn.next());
        
        System.out.println("Please enter quantity: ");
        chk3.setquantity(sn.nextInt());
        
        System.out.println("Please enter price: ");
        chk3.setprice(sn.nextDouble());
		
		
		System.out.print("\t \t\t \b\bALLAH IS ALMIGHTY  ");
		System.out.print("\n\n\t \t\t   Invoices");
		System.out.print("\n\t\t\tFR IT SULATION ");
		System.out.print("\nSL No : " +sl);
		System.out.print("\nCustomer Name : " +coname );
		System.out.print("\t\t\t Date : "+date);
		System.out.print("\n\n-----------------------------------------------------------------------------\n");
        //-----------------------------------------------------------
        System.out.print("SL NO");
        System.out.print("\t PRODUCT NAME");
        System.out.print("\t PRODUCT quantity");
        System.out.print("\t PRODUCT PRICE");
        System.out.print("\t TOTAL PRICE\n");
        chk1.displayLine();
		System.out.println();
        chk2.displayLine();
		System.out.println();
        chk3.displayLine();
		 System.out.print("\n-----------------------------------------------------------------------------\n");
		double ok =chk1.total_am()+chk2.total_am()+chk3.total_am();
		System.out.println("\t\t\t\t\t\t\tTotal_Amount = "+ok);
		if (ok > 1000)
			System.out.println("\t\t\t\t\t\t\tdiscount = "+(ok * 0.10));
		else
			System.out.println("\t\t\t\t\t\t\tdiscount = "+ 0.0);
		
		System.out.println("\n\n\n\t\t DONET BLOOD SAVE LIFE");
		break;
		}
		
		catch (InputMismatchException e){
			System.out.println(e);
		}
		}
    }
    
}
