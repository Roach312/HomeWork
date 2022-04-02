public class IndexStorage {

    private final int arrSize;

    public IndexStorage(int arrSize) {
        if (arrSize < 1){
            throw new IllegalArgumentException("Массив не может быть пустым!");
        }
        this.arrSize = arrSize;
    }

    public int size(){
        return arrSize;
    }

    public int get(int index) {
        if (index < 0 || index > size() - 1){
            throw new IndexOutOfBoundsException("Такого индекса: [" + index + "] в массиве не существует!");
        }

        int[] array = new int[size()];

        for (int i = 0; i < array.length; i++) {
            array[i] = (i % 2 == 0) ? i : -i;
        }

        return array[index];
    }

    public int[] reverse() {

        int[] array = new int[size()];

        for (int i = array.length-1; i >= 0; i--) {
            int pos = array.length - i;
            array[i] = get(pos-1);
        }

        return array;
    }
}
