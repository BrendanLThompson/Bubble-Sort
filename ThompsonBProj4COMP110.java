//Brendan Thompson
//Project 4: Bubble Sort with classes.
//Due: April 16, 2019 5:30 p.m
import java.util.Arrays;
import java.util.Random;
public class ThompsonBProj4COMP110
{
   public static void main(String [] args)
   {
   System.out.println("Brendan Thompson, Project 4: OOP Excerise");
   System.out.println(" ");

   myArray array1 = new myArray();

   array1.populateArray();                                          //lines 65-71
   array1.printArray();                                             //lines 73-81
   array1.findMin();                                                //lines 83-95
   array1.findMax();                                                //lines 97-110
   array1.getElement(array1.lowlim, array1.uplim, array1.Element);  //lines 155-160
   array1.linSearch(array1.data, array1.Element);                   //lines 162-172                      
   array1.linSearchPrint();                                         //lines 175-187
   array1.sortArray();                                              //lines 112-138
   array1.findMedian();                                             //lines 140-153
   array1.binSearch (array1.Element);                               //lines 189-216
   
   System.out.println (" ");
   System.out.println("Brendan Thompson, End of Project 4");
   }
}
class myArray
{

int lowlim;
int uplim;
int Element;

Random r = new Random();
int low = 12;
int high = 20;
int Length = (r.nextInt(high-low) + low);
int data[] = new int [Length];
int size = Length + 1;
         
   
   myArray()                                                        //Constructor 1  
   {
   size = Length;
   lowlim = 10;
   uplim = 99;
   Element = ((int)(Math.random() * (uplim - lowlim +1)) + lowlim);
   }
   myArray(int size1)                                               //Constructor 2
   {
   size = size1;
   lowlim = 10;
   uplim = 99;
   }  
   myArray (int size1, int LL, int UP)                              //Constructor 3
   {
   size = size1;
   lowlim = LL;
   uplim = UP;
   }
   
   void populateArray()
   {
   for (int i = 0; i<data.length; i++)	
	   {
      data[i] = (int)(Math.random() * (uplim - lowlim +1)) + lowlim;
	   }  
   }

   void printArray()
   {  
   System.out.println ("Array Size: " + Length);
	for (int i = 0; i<size; i++)
	   {
      System.out.print (data[i] + " ");
	   }
   System.out.println (" ");
   }

   int findMin()
   {
   int smallest = data[0];
   for(int i=0; i < data.length; i++)
      {
         if (data[i] < smallest)
            {
               smallest = data[i];
            }
         }
   System.out.print ("Minimum = " + smallest);    
   return smallest;   
   }

   int findMax()
   {
   int largest = data[0];
   for(int i=0; i < data.length; i++)
      {
         if (data[i] > largest)
         {
            largest = data[i];
         }
      }
   System.out.print (", Maximum = " + largest);  
   System.out.println (" "); 
   return largest;   
   }

   boolean sortArray()
   {
   System.out.println ("Sorting: ");
   boolean sorted = false;
   for (int i = 0;  i < data.length && !sorted; i++)
      {
         sorted = true;
         for (int j = 0; j < data.length; j++)
            {
               if (j == data.length - 1)
               {
                  System.out.println (data[j] + " ");
                  break;
               }   
               if (data[j] > data[j+1])
               {
                  int temp = data[j];
                  data[j] = data[j+1];
                  data[j+1] = temp;
                  sorted = false;
               } 
            System.out.print (data[j] + " ");
            }
      }   
      System.out.println (" ");           
     return sorted;
   }

   double findMedian()
   {
   double median;
      if (data.length % 2 == 0)
      {
         median = ((data[data.length/2] + data[data.length/2 - 1])/(2.0));
      }
      else
      {
         median = data[data.length/2];
      }      
   System.out.println ("Median = " + median);
   return median;
   }
   
   int getElement(int lowlim, int uplim, int Element)
   {
   System.out.println (" ");
   System.out.println ("Linear Searching: " + Element);
   return Element;
   }
   
   int linSearch(int[] data, int Element)
   {
      for (int i= 0; i < data.length; i++)
      {
         if (data[i] == Element)
         {   
         return i;
         } 
      }      
   return -1;    
   }
   
   void linSearchPrint()
   {
   int result = linSearch(data, Element);
   if(result == -1)
      { 
      System.out.println("Item not found"); 
      System.out.println (" ");
      }
    else
      {
      System.out.println("Item found, index " + result);
      System.out.println (" ");
      }  
   }
   
   int binSearch (int Element)
   {
      int from = 0;
      int to = size;
      int mid;
      System.out.println (" "); 
      System.out.println ("Binary Searching: " + Element);
      while (to >= from)
      {
         mid = ((from + to) / 2);
         if (Element == data[mid])
         {
         System.out.println ("Item found, index: " + mid); 
         return mid;
         }
         else if (Element < data[mid])
         {
         to -= 1;
         }
         else
         {
         from += 1;
         }      
      }
   System.out.println ("Item not found");    
   return -1;
   }
}