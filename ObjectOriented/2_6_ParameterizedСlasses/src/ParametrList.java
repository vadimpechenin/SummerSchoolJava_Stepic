public class ParametrList<E> {
    private Object [] data;
    private int size;

    public ParametrList() {
        size = 0;
        data = new Object[100];
    }

    public int size(){
        return size;
    }

    public void add(E element){
        data[size] = element;
        size++;
    }

    public E get(int index){
        return (E) data[index];
    }

    public void set(int index,E element){
        data[index] = element;
    }

    public void remove(int index) {
        rangeCheck(index);

//        modCount++;
//        E oldValue = data(index);

        int numMoved = size - index - 1;
        if (numMoved > 0)
            System.arraycopy(data, index+1, data, index,
                    numMoved);
        data[--size] = null; // clear to let GC do its work
//        size--;
//        return oldValue;
    }

    private void rangeCheck(int index) {
        if (index >= size)
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
    }

    private String outOfBoundsMsg(int index) {
        return "Index: "+index+", Size: "+size;
    }

    public int find(E value){
        int answer = -1;
        for (int i =0; i<size; i++){
            if (value==data[i]){
                return i;
            }
        }
        return answer;
    }

    public void insert(int index,E element){
        rangeCheck(index);
        size++;
        int numMoved = size - index - 1;
        if (numMoved > 0)
            System.arraycopy(data, index, data, index+1,
                    numMoved);
        data[index] = element;
//        size++;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < size; i++){
            s.append(data[i]).append(" ");
        }
        return s.toString();
    }
}
