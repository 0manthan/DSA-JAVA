import java.sql.SQLOutput;

public class SinglyLinkedList
{
    private Node head;
    private Node tail;

    private int size;

    public SinglyLinkedList()
    {
        this.size = 0;
    }

    public void insertFirst(int val)
    {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null)
        {
            tail=head;
        }
        size++;
    }

    public void insertLast(int val)
    {
        if(tail == null)
        {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertPosition(int val, int pos)
    {
        if(pos>size)
        {
            System.out.println("Position out of range");
        }

        if(pos==0)
        {
            insertFirst(val);
        }
        else if(pos==size)
        {
            insertLast(val);
        }
        else
        {
            Node node = new Node(val);
            Node temp=head;
            for(int i=1;i<pos;i++)
            {
                temp=temp.next;
            }
            node.next = temp.next;
            temp.next = node;
            size++;
        }

    }

    public void  deleteFirst()
    {
        if(head==null)
        {
            System.out.println("List is empty");
        }
        else
        {
            head=head.next;
            size--;
        }
    }

    public void deleteLast()
    {
        Node temp=head;
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        temp.next=null;
        size--;
    }

    public void deletePosition(int pos)
    {
        if(pos>size)
        {
            System.out.println("Position out of range");
        }
        if(pos==0)
        {
            deleteFirst();
        }
        else if(pos==size)
        {
            deleteLast();
        }
        else
        {
            Node temp=head;
            for(int i=1;i<pos;i++)
            {
                temp=temp.next;
            }
            temp.next=temp.next.next;
            size--;
        }
    }

    public void display()
    {
        Node temp = head;
        while(temp!= null)
        {
            System.out.print(temp.value+"->");
            temp = temp.next;
        }
        System.out.print("End");
    }

    private class Node
    {
        private int value;
        private Node next;
        public Node(int value)
        {
            this.value = value;
        }
        public Node(int value, Node next)
        {
            this.value = value;
            this.next = next;
        }
    }
}
