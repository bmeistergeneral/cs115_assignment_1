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

            // Iterates through the array to check if new value is less than the values in the array.
            for (int i = 0; i < numElements; i++) {
                // Tries to find a better location for the new value.
                if (value <= list[i]) {
                    insertLocation = i;
                    break;
                }
            }

            // Checks to see if the integer values go before the end or at the end of the array.
            if (insertLocation < numElements) {
                // Moves the other values out of the way of where the new value will go.
                for (int i = numElements; i > insertLocation; i--) {
                   list[i] = list[i - 1];
                }
                // Places new value in new location.
                list[insertLocation] = value;
                numElements++;
            } else {
                list[numElements] = value;
                numElements++;
            }
        }
    }
}
