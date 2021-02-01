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
        System.out.println("Enter Data");
        Scanner sc2 = new Scanner(System.in);
        int item = sc2.nextInt();
        
        Nodee newnode = new Nodee();
        newnode.data = item;
        newnode.previous=null;
        newnode.next=null;
        
        if(START == null)
        {
            START = newnode;
        }
        else
        {
            Nodee current = START;
            while(current.next!=null)
            {
                current=current.next;
            }
            current.next=newnode;
            newnode.previous=current;
        }
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
            System.out.println("-------forward --------");
            //forward
            Nodee current;
            for (current = START;current != null;current=current.next)
            {
                System.out.print(" "+current.data);
            }
            //reverse
            System.out.println("\n-------backward --------");
            for(current = current;current.previous != null;current=current.previous)
            {
                System.out.print(" "+current.data);
            }
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
