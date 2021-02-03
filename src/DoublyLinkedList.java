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
        if(START == null)
        {
            System.out.println("Doubly Linked List Empty");
        }
        else
        {
            System.out.println("Deleted Element : "+START.data);
            if(START.next==null)
            {
                START=null;
            }
            else
            {
                START = START.next;
                START.previous = null;
            }     
        }
    }
    void deleteFromLast()
    {
        if(START == null)
        {
            System.out.println("Doubly Linked List Empty");
        }
        else
        {
            if(START.next == null)
            {
                System.out.println("Deleted Element :"+START.data);
                START = null;
            }
            else
            {
                Nodee current =START ;
                Nodee Secondlast = null;
                while(current.next != null)
                {
                    Secondlast = current;
                    current = current.next;
                }
                System.out.println("Deleted Element :"+ current.data);
                Secondlast.next=null;
            }
        }        
    }
    void DeleteFromValue()
    {
        if(START  == null)
        {
           System.out.println("Doubly Linked List Is Empty");
        }
        else
        {            
            Scanner sc4 = new Scanner(System.in);
            System.out.println("Enter the value you want to delete");
            int value = sc4.nextInt();            
            int count=0;
            Nodee current = START;
            while(current.next!=null)
            {
                if(current.data==value)
                {
                    count++;
                    break;
                }
                current=current.next;
            }
            if(current.data==value)
                {
                    count++;                    
                }
            if(count>0)
            {
                current = START;
                while(current.data != value)
                {
                    current = current.next;            
                }
                System.out.println("Delete :"+current.data);
                if(current.previous==null)
                {
                    START =current.next;
                    START.previous = null;
                }
                else if(current.next==null)
                {
                    current.previous.next = null;
                }
                else
                {
                    current.previous.next = current.next;
                    current.next.previous = current.previous;
                }
            }
            else
            {
                System.out.println("Value Not Found");
            }            
        }
        
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
            for (current = START;current.next != null;current=current.next)
            {
                System.out.print(" "+current.data);
            }
            System.out.print(" "+current.data);
            //reverse
            System.out.println("\n-------backward --------");
            Nodee current1 = current;
            for(;current1!= null;current1=current1.previous)
            {
                System.out.print(" "+current1.data);
            }
        }
    }
    void searchnode()
    {
        if(START == null)
        {
            System.out.println("List Empty");
        }
        else
        {
            System.out.println("Enter searching element");
            Scanner sc3 = new Scanner(System.in);
            int sea = sc3.nextInt();
            
            Nodee current;
            int count=0;
            for(current=START;current != null ;current=current.next)
            {
                if(current.data == sea)
                {
                    count++;
                    break;
                }
            }
            if(count>0)
                {
                    System.out.println("Found");
                }
                else
                {
                    System.out.println("Not Found");
                }
        }
    }
    public static void main(String args[])
    {
        DoublyLinkedList obj = new DoublyLinkedList();
        while(true)
        {
            System.out.println("\npress 1 for insert");
            System.out.println("press 2 for delete");
            System.out.println("press 3 for deleteFromLast");
            System.out.println("press 4 for deleteFromValue");
            System.out.println("press 5 for traverse");
            System.out.println("press 6 for search");
            System.out.println("press 7 for Exit");
            
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
                obj.deleteFromLast();
            }
            else if(ch == 4)
            {
                obj.DeleteFromValue();
            }
            else if(ch == 5)
            {
                obj.traversenode();
            }
            else if(ch == 6)
            {
                obj.searchnode();
            }
            else if(ch == 7)
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
