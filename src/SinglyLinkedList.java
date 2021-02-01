import java.util.Scanner;
class Node
{
    int rollno;
    Node next;
}
public class SinglyLinkedList
{
    Node START;
    SinglyLinkedList()
    {
        START = null;
    }
    void addnode()
    {
        System.out.println("Enter Data");
        Scanner sc2 = new Scanner(System.in);
        int rn = sc2.nextInt();
        
        Node newnode = new Node();
        newnode.rollno = rn;
        newnode.next = null;
        
        if(START == null)
        {
            START = newnode;
        }
        else
        {
            Node current = START;
            while(current.next != null)
            {
                current = current.next;
            }
            current.next = newnode;
        }
        System.out.println("Data Inserted.....");
    }
    void deletenode()
    {
        
    }
    void traversenode()
    {
        if(START == null)
        {
            System.out.println("List Empty");
        }
        else
        {
            Node current;
            for(current = START;current != null ;current = current.next)
            {
                System.out.print(" " +current.rollno);
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
            
            Node current;
            int count=0;
            for(current=START;current != null ;current=current.next)
            {
                if(current.rollno == sea)
                {
                    count++;
                    break;
                }
                if(count>0)
                {
                    System.out.println("FOund");
                }
                else
                {
                    System.out.println("Not Found");
                }
            }
        }
    }
    public static void main(String arg[])
    {
        SinglyLinkedList obj = new SinglyLinkedList();
        while(true)
        {
            System.out.println("press 1 for insert");
            System.out.println("press 2 for delete");
            System.out.println("press 3 for traverse");
            System.out.println("press 4 for search");
            System.out.println("press 5 for Exit");
            
            System.out.println("Enter ur choice");
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();
            
            switch(ch)
            {
                case 1:
                    obj.addnode();
                    break;
                case 2:
                    obj.deletenode();
                    break;
                case 3:
                    obj.traversenode();
                    break;
                case 4:
                    obj.searchnode();
                    break;
                case 5:
                    System.exit(0);
                   break;
                default:
                    System.out.println("Wrong choice");
                    
            }
        }
    }
}
