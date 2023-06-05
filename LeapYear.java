import java.util.Scanner;

public class LeapYear
{
    public static void main(String[] args)
    {
       Scanner keyboard = new Scanner (System.in);
       int year;
       
       System.out.println("Enter a the year?");
       year = keyboard.nextInt();
       
       boolean isLeapYear = isLeapYear(year);
       
       if (isLeapYear)
       
       { 
         System.out.println (year + " is a leap year.");
       }
       
       else 
       {
         System.out.println (year + " is not a leap year.");
       }
     }
     
     public static boolean 
     isLeapYear (int year) 
     {
      if  
      ( year % 4 != 0) 
     { return false;
     
     } else if 
       (year % 100 != 0) 
       { return true;
       } else return year % 400 == 0;
       
     }
   } 
       
       
