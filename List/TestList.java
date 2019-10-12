import linklist.*;
public class TestList
{
    public static void main(String [] args)
    {
        LinkList<Integer> testList1 = new LinkList<Integer>();
        testList1.append(1);
        testList1.append(2);
        testList1.append(3);
        
        LinkList.Node currentNode = testList1.GetHead();

        do {
            System.out.println(currentNode.value);
            currentNode = currentNode.next;
        } while (currentNode.value != null);
        
    }
}