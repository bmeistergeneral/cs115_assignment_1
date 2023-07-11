public class SortedIntList extends IntList {

    public SortedIntList(int size)
    {
        super(size);
    }

    //------------------------------------------------------------
    // Adds an integer to the list. If the list is full,
    // prints a message and does nothing.
    // ------------------------------------------------------------
    public void add(int value)
    {
        if (numElements == list.length)
            System.out.println("Can't add, list is full"); else
        {
            list[numElements] = value;
            numElements++;
        }
    }
}
