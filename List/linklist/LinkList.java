package linklist;

public class LinkList<T>
{

    private class Node<T>
    {
        Node<T> next;
        T value;

        private Node(T value, Node<T> next) {
            this.value = value;
            this.next = next;
        }
    }

    private int size;
    private Node<T> head;

    public int GetSize()
    {
        return this.size;
    }

    public LinkList() {
        head = new Node<T>(null, head);
        size = 0;
    }

    public void append(T value) {
        if (value == null) {
            throw new NullPointerException("Cannot add null element to the list");
        }        
        head.next = new Node<T>(value, head);
        size++;
    }

    // public static void main(String [] args)
    // {

    // }
}

