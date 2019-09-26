public class RealEstate 
{
    //Global Variables
    private int NumberOfRoom;
    private int Rent;
    
    //Non-parameterized constructor
    public RealEstate()
    {
        NumberOfRoom=0;
        Rent=0;
       
    }
    //Parameterized constructor
    public RealEstate(int NumberOfRoom1,int Rent1)
    {
        NumberOfRoom=NumberOfRoom1;
        Rent=Rent1;
        
    }
   
    //Getter function to return Number of rooms
    public int getNumberOfRooms()
    {
        return NumberOfRoom;
    }
    
    //Getter function to return Rent
    public int getRent()
    {
        return Rent;
    }
    
    
}


