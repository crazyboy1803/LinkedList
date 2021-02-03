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
        //to check whether the list is empty or not.
        if(START  == null)
        {
           System.out.println("Doubly Linked List Is Empty");
        }
        else
        {            
            //if list is not empty the take input the value which we want to delete.
            Scanner sc4 = new Scanner(System.in);
            System.out.println("Enter the value you want to delete");
            int value = sc4.nextInt();
            //counter for whether the value is present or not.
            int count=0;
            Nodee current = START;
            //loop for check all the elements of linked list.
            while(current.next!=null)
            {
                if(current.data==value)
                {
                    //if the value is present the count will be increased.
                    count++;
                    break;
                }
                current=current.next;
            }
            //this is for checking last element of linked list.
            if(current.data==value)
                {
                    count++;                    
                }
            if(count>0)
            {
                //if counter value will be more than zero the  processing of deleting start.
                current = START;
                while(current.data != value)
                {
                    //to take the variable current to the node where the value present.
                    current = current.next;            
                }
                // to print deleted value.
                System.out.println("Delete :"+current.data);
                //for the first value of linked list.
                if(current.previous==null && current.next!=null)
                {
                    START =current.next;
                    START.previous = null;
                }
                //for the last value of linked list.
                else if(current.next==null && current.previous!=null)
                {
                    current.previous.next = null;
                }        
                //for only one value present in linked list.
                else if(current.next==null && current.previous==null)
                {
                    START=null;
                }
                //for any middle value.
                else
                {
                    current.previous.next = current.next;
                    current.next.previous = current.previous;
                }
            }
            else
            {                
                //when value is not present.
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
