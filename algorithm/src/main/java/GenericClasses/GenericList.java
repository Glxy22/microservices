package GenericClasses;

public class GenericList<T> {

    private T[] items = (T[]) new Object[10];
    private int count;
    private int index;

    public T getItem(int  index){
        return items[index];
    }
    public void setItem(T item){
        items[count++] = item;
    }



}
