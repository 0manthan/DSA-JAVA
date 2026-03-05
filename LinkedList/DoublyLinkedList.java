
public class DoublyLinkedList
{
    private Node head;
    private Node tail;

    private int size;

    public DoublyLinkedList()
    {
        this.size = 0;
    }

    public void insertFirst(int val)
    {
        Node node = new Node(val);
        node.next = head;
        if (head != null)
            head.prev = node;
        node.prev = null;
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
        node.prev = tail;
        node.next=null;
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
            if(pos<=size/2)
            {
                Node node = new Node(val);
                Node temp=head;
                for(int i=1;i<pos;i++)
                {
                    temp=temp.next;
                }
                node.next = temp.next;
                temp.next.prev = node;
                node.prev = temp;
                temp.next = node;
                size++;
            }
            else
            {
                Node node = new Node(val);
                Node temp=tail;
                for(int i=size;i>pos;i--)
                {
                    temp=temp.prev;
                }
                node.next = temp;
                temp.prev.next = node;
                node.prev = temp.prev;
                temp.prev = node;
                size++;
            }

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
            head.prev=null;
            size--;
        }
    }

    public void deleteLast()
    {
        Node temp=tail;
        tail=tail.prev;
        tail.next=null;
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
            if(pos<=size/2)
            {
                Node temp=head;
                for(int i=1;i<pos;i++)
                {
                    temp=temp.next;
                }
                temp.next=temp.next.next;
                temp.next.next.prev = temp;
                size--;
            }
            else
            {
                Node temp=tail;
                for(int i=size;i>pos;i--)
                {
                    temp=temp.prev;
                }
                temp.prev=temp.prev.prev;
                temp.prev.prev.next = temp;
                size--;
            }
        }
    }

    public void display()
    {
        Node temp = head;
        while(temp!= null)
        {
            System.out.print(temp.value+"-><-");
            temp = temp.next;
        }
        System.out.print("End");
    }

    class Node
    {
        private int value;
        private Node next;
        private Node prev;
        public Node(int value)
        {
            this.value = value;
        }
        public Node(int value, Node next, Node prev)
        {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
