package linklist;

public class LinkList<T>
{
    public class Node<T>
    {
        public Node<T> next;
        public T value;

        public Node(T value, Node<T> next) {
            this.value = value;
            this.next = next;
        }
    }

    private int size;
    private Node<T> head;
    private Node<T> currentNode;
    public int GetSize()
    {
        return this.size;
    }

    public Node<T> GetHead()
    {
        return this.head;
    }

    public LinkList() {
        head = new Node<T>(null, head);
        currentNode = head;
        size = 0;
    }

    public void append(T value) {
        if (value == null) {
            throw new NullPointerException("Cannot add null element to the list");
        }        
        currentNode.next = new Node<T>(value, head);
        currentNode = currentNode.next ;
        size++;
    }


    public T remove(int pos) {
        try {
            if (pos > size || pos < 0) {
                //catching errors
                throw new IndexOutOfBoundsException("position cannot be greater than size or negative");
            }
            
            Node<T> before = head;
            for (int i = 1; i <= pos; i++) {
                before = before.next;
            }
            Node<T> destroy = before.next;
            T saved = destroy.value;
            before.next = before.next.next;
            destroy = null;
            size--;
            return saved;
        } catch (Exception e) {
            throw new IndexOutOfBoundsException(e.toString());
        }
        

    }
}


