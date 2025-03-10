// **************************************************************** 
// ListTest.java 
// 
// A simple test program that creates an IntList, puts some 
// ints in it, and prints the list. 
// 
// **************************************************************** 
public class ListTest 
{ 
 public static void main(String[] args) 
 { 
 IntList myList = new IntList(10); 
 myList.add(100); 
 myList.add(50); 
 myList.add(200); 
 myList.add(25); 
 System.out.println(myList); 

 IntList intList = new IntList(10);
        intList.add(10);
        intList.add(5);
        intList.add(20);
        intList.add(15);

        // Print the unsorted list
        System.out.println("IntList contents:");
        System.out.println(intList);
    }
}