package week1.day1;

public class PositiveToNegative {
	public static void main(String[] args) 
    {
        int number = -40;
        int iPositive = ~(number - 1);
        
        if(number < 0)
        {
        	System.out.println(number+" is a negative number");
        	System.out.println("The Number"+number+ " Converted to "+iPositive);
        	
        }
       
    }

}
