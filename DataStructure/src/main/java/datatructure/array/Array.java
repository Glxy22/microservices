package datatructure.array;

public class Array {
    private int[] items;
    private int count;

    public Array(int length) {
        items = new int[length];
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }

    public void insert(int num) {
        //resize the array if it is full
        if (items.length == count) {

            int[] newItems = new int[count * 2];   //create new array twice the size

            for (int i = 0; i < count; i++) {  //copy items
                newItems[i] = items[i];

            }
            items= newItems;         //set addess of newItems to items
        }
        //add item at the end
        items[count++] = num;
    }

}
