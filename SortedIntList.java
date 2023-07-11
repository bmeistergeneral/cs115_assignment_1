public class SortedIntList extends IntList {

    public SortedIntList(int size)
    {
        super(size);
    }

    //------------------------------------------------------------
    // Adds an integer to the list. If the list is full,
    // prints a message and does nothing.
    // ------------------------------------------------------------
    public void add(int value) {
        if (numElements == list.length) {
            System.out.println("Can't add, list is full");
        } else {
            int insertLocation = numElements; // by default at the end

            for (int i = 0; i < numElements; i++) {
                if (value <= list[i]) {
                    insertLocation = i;
                    break;
                }
            }

            if (insertLocation < numElements) {
                for (int i = numElements; i > insertLocation; i--) {
                   list[i] = list[i - 1];
                }
                list[insertLocation] = value;
                numElements++;
            } else {
                list[numElements] = value;
                numElements++;
            }
        }
    }
}
