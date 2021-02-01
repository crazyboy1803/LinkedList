import java.util.Scanner;
class Nodee
{
    int data;
    Nodee previous;
    Nodee next;
}
public class DoublyLinkedList 
{
    Nodee START;
    DoublyLinkedList()
    {
        START = null;
    }
    void addnode()
    {
        
    }
    void deletenode()
    {
        
    }
    void traversenode()
    {
        if(START ==null)
        {
          System.out.println("Doubly List Empty");
        }
        else
        {
            
        }
    }
    void searchnode()
    {
        
    }
    public static void main(String args[])
    {
        DoublyLinkedList obj = new DoublyLinkedList();
        while(true)
        {
            System.out.println("press 1 for insert");
            System.out.println("press 2 for delete");
            System.out.println("press 3 for traverse");
            System.out.println("press 4 for search");
            System.out.println("press 5 for Exit");
            
            System.out.println(".......Enter ur choice.......");
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();
            
            if(ch == 1)
            {
                obj.addnode();
            }
            else if(ch == 2)
            {
                obj.deletenode();
            }
            else if(ch == 3)
            {
                obj.traversenode();
            }
            else if(ch == 4)
            {
                obj.searchnode();
            }
            else if(ch == 5)
            {
                System.exit(0);
            }
            else
            {
                System.out.println("......Wrong choice......");
            }
        }
    }
}
