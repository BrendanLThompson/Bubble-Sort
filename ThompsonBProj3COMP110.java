//Brendan Thompson
//Bubble Sort.
import java.util.Random;
import java.util.Arrays;
public class ThompsonBProj3
{
   public static void main(String [] args)
   {
   System.out.println("Brendan Thompson, Project 3: Bubble Sort");
   System.out.println(" ");
   
   //Random Array Length
   Random r = new Random();
   int low = 12;
   int high = 20;
   int Length = r.nextInt(high-low) + low;
   int[] Array1 = new int[Length];
   System.out.println ("Number of random Numbers: " + Length);
   System.out.println (" ");
   
   //Number generator
   System.out.println ("Sample Data:");
      for(int i = 0; i < Array1.length; i++) 
      {
      Array1[i] = (r.nextInt(89) + 10);
      System.out.print(Array1[i] + " ");
      }
   System.out.println (" ");
   
   //Maximum value
   int largest = Array1[0];
      for(int i=0; i < Array1.length; i++)
      {
         if (Array1[i] > largest)
         {
         largest = Array1[i];
         }
      }
   
   //Minimum value
   int smallest = Array1[0];
      for(int i=0; i < Array1.length; i++)
      {
         if (Array1[i] < smallest)
         {
         smallest = Array1[i];
         }
      }
   System.out.println (" ");
   System.out.println ("Minimum = " + smallest + ", Maximum = " + largest);
   
   //Average
   int total = 0;
      for (int element : Array1)
      {
      total += element;
      }
   int average = 0;
      if (Array1.length > 0)
      {
      average = total / Array1.length;
      }
   System.out.println (" ");
   System.out.println ("Average = " + average);
   System.out.println (" ");   
   
   //Sorting
   boolean sorted = false;
      for (int i = 0;  i < Array1.length && !sorted; i++)
      {
      sorted = true;
         for (int j = 0; j < Array1.length; j++)
         {
            if (j == Array1.length - 1)
            {
               System.out.print (Array1[j] + " ");
               break;
            }   
            if (Array1[j] > Array1[j+1])
            {
            int temp = Array1[j];
            Array1[j] = Array1[j+1];
            Array1[j+1] = temp;
            sorted = false;
            } 
           System.out.print (Array1[j] + " ");
         }
      System.out.println (" ");
      }        
  
   //Median
   double median;
      if (Array1.length % 2 == 0)
      {
      median = ((Array1[Array1.length/2] + Array1[Array1.length/2 - 1])/(2.0));
      }
      else
      {
      median = Array1[Array1.length/2];
      }
   System.out.println (" ");      
   System.out.println ("Median = " + median);
   
   System.out.println (" ");
   System.out.println("Brendan Thompson, End of Project 3");
   }
}      
         
  
