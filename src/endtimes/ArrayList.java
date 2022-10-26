package endtimes;

public class CustomArrayList <DesiredType> {

    Object[] array;
    int numberOfElements; // stores a count of the number of elements in array

    // all methods below must guarantee that
    // numberOfElements < array.length.

    public CustomArrayList( ) {
        array = new Object[10];
        numberOfElements = 0;
    }

    public int size() {
        return numberOfElements;  // needs fixing
    }

    public boolean isEmpty() {
        return numberOfElements == 0;
    }

    public void clear( ){
        numberOfElements = 0;
    }

    public void add(DesiredType item) {
        array[numberOfElements++] = item;
    }

}
