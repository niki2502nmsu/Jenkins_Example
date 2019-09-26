import java.util.*;
import java.io.*;
public class RealEstateManager 
{
    public static void main(String args[])throws Exception
    {
                 try {
	                FileReader reader = new FileReader("file1.txt");
			int character;

			while ((character = reader.read()) != -1) 
                       {
				System.out.print((char) character);
	                }
	               reader.close();
	         } 
                catch (IOException e) 
                {
			e.printStackTrace();
                }
                Scanner sc=new Scanner(System.in);
                System.out.println("\t");
                System.out.println("Enter number of rooms: ");
                int num=sc.nextInt();
                System.out.println("Enter Rent: ");
                int rent=sc.nextInt();
                RealEstate Estate1 = new RealEstate(num,rent);     
                RealEstateManager obj = new RealEstateManager(); 
                obj.getdetails(Estate1);
        
    }
    public static void getdetails(RealEstate object)
    {
       
        System.out.println("Number of Rooms are "+object.getNumberOfRooms());
        System.out.println("Rent per month is "+object.getRent());        
            
    }
   
    }