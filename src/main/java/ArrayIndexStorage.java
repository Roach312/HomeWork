public class ArrayIndexStorage extends IndexStorage{

    private final int[] array;

    public ArrayIndexStorage(int[] array){
        super(array.length);
        this.array = array;
    }

    @Override
    public int get(int index) {
        if (index < 0 || index > size() - 1){
            throw new IndexOutOfBoundsException("Такого индекса: [" + index + "] в массиве не существует!");
        }
        return array[index];
    }
}
