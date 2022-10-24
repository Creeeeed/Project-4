package endtimes;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayList {
    Object[] array;
    int elements = 0;

    public int size() {
        return elements;
    }

    public boolean isEmpty() {
        if (elements == 0){
            return true;
        }else{
            return false;
        }

    }
    public boolean contains(Object o) {
        return false;
    }

    public <T> T[] toArray(T[] a) {
        return null;
    }


    public boolean add(Integer integer) {
        array[elements++] = integer;
    }

    public boolean remove(Object o) {
        return false;
    }


    public boolean containsAll(Collection<?> c) {
        return false;
    }

    public boolean addAll(int index, Collection<? extends Integer> c) {
        return false;
    }


    public boolean removeAll(Collection<?> c) {
        return false;
    }

    public boolean retainAll(Collection<?> c) {
        return false;
    }


    public void clear() {

    }

    public Integer get(int index) {
        return null;
    }


    public Integer set(int index, Integer element) {
        return null;
    }


    public void add(int index, Integer element) {

    }

    public Integer remove(int index) {
        return null;
    }

    public int indexOf(Object o) {
        return 0;
    }


    public int lastIndexOf(Object o) {
        return 0;
    }


    public ListIterator<Integer> listIterator() {
        return null;
    }

    public ListIterator<Integer> listIterator(int index) {
        return null;
    }

    public List<Integer> subList(int fromIndex, int toIndex) {
        return null;
    }




}
