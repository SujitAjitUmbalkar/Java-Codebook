// Doubly Circular

class node
{
    public int data;
    public node next;  
    public node prev;  
}

class DoublyCLL
{
    private node first;
    private node last;
    private int iCount;

    public DoublyCLL()
    {
        first = null;
        last = null;
        iCount = 0;
    }

    public void InsertFirst(int no)
    {
        node newn = new node();   // #
        newn.data = no;
        newn.next = null;
        newn.prev = null;

        if(first == null && last == null)   // #
        {
            first = newn;
            last = newn;
            first.next = first;   // #
            first.prev = first;   // #
        }
        else
        {
            newn.next = first;
            newn.prev = last;     // #
            first.prev = newn;    // #
            last.next = newn;     // #
            first = newn;
        }
        iCount++;
    }

    public void InsertLast(int no)
    {
        node newn = new node();   // #
        newn.data = no;
        newn.next = null;
        newn.prev = null;

        if(first == null && last == null)   // #
        {
            first = newn;
            last = newn;
            first.next = first;   // #
            first.prev = first;   // #
        }
        else
        {
            last.next = newn;     // #
            newn.prev = last;     // #
            newn.next = first;    // #
            first.prev = newn;    // #
            last = newn;
        }
        iCount++;
    }
    
    public void InsertAtPos(int no, int pos)
    {
        int iCnt = 0;
        node temp = null;
        node newn = null;

        if(pos < 1 || pos > iCount+1)
        {
            System.out.println("Invalid position");
            return;
        }

        if(pos == 1)
        {
            InsertFirst(no);
        }
        else if(pos == iCount+1)
        {
            InsertLast(no);
        }
        else
        {
            temp = first;

            newn = new node();   // #
            newn.data = no;
            newn.next = null;
            newn.prev = null;

            for(iCnt = 1; iCnt < pos-1; iCnt++)
            {
                temp = temp.next;
            }

            newn.next = temp.next;
            newn.prev = temp;                // #
            temp.next.prev = newn;           // #
            temp.next = newn;

            iCount++;
        }
    }
    
    public void DeleteFirst()
    {
        if(first == null && last == null)   // #
        {
            return;
        }
        else if(first == last)              // #
        {
            first = null;
            last = null;
        }
        else
        {
            first = first.next;
            first.prev = last;     // #
            last.next = first;     // #
        }
        iCount--;
    }

    public void DeleteLast()
    {
        if(first == null && last == null)   // #
        {
            return;
        }
        else if(first == last)              // #
        {
            first = null;
            last = null;
        }
        else
        {
            last = last.prev;        // #
            last.next = first;       // #
            first.prev = last;       // #
        }
        iCount--;
    }

    public void DeleteAtPos(int pos)
    {
        int iCnt = 0;
        node temp = null;

        if(pos < 1 || pos > iCount)
        {
            System.out.println("Invalid position");
            return;
        }

        if(pos == 1)
        {
            DeleteFirst();
        }
        else if(pos == iCount)
        {
            DeleteLast();
        }
        else
        {
            temp = first;

            for(iCnt = 1; iCnt < pos; iCnt++)
            {
                temp = temp.next;
            }

            temp.prev.next = temp.next;   // #
            temp.next.prev = temp.prev;   // #
            iCount--;
        }
    }
    
    public void Display()
    {
        node temp = null;

        if(first == null && last == null)  // #
        {
            return;
        }

        temp = first;

        do                                 // #
        {
            System.out.print("| "+temp.data+" |<-> ");
            temp = temp.next;
        }while(temp != first);             // #

        System.out.println("null");
    }

    public int Count()
    {
        return iCount;
    }
}

class program378
{
    public static void main(String A[])
    {
        DoublyCLL sobj = new DoublyCLL();
        int iRet = 0;

        sobj.InsertFirst(51);
        sobj.InsertFirst(21);
        sobj.InsertFirst(11);

        sobj.InsertLast(101);
        sobj.InsertLast(111);        
        sobj.InsertLast(121);

        sobj.Display();
    
        iRet = sobj.Count();

        System.out.println("Number of elements in the LinkedList are : "+iRet);

        sobj.InsertAtPos(105,5);

        sobj.Display();
    
        iRet = sobj.Count();

        System.out.println("Number of elements in the LinkedList are : "+iRet);

        sobj.DeleteAtPos(5);

        sobj.Display();
    
        iRet = sobj.Count();

        System.out.println("Number of elements in the LinkedList are : "+iRet);
    }
}
