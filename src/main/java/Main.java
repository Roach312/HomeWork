public class Main {

    public static void main(String[] args){

        IndexStorage arr = new IndexStorage(13);

        printArray(arr.reverse());

        //-------------------------------------------------------------

        arr = new ArrayIndexStorage(new int[] {13,14,15,16,17,18,19,20,21,22,23,24});

        printArray(arr.reverse());
    }

    public static void printArray(int[] array){
        StringBuilder arrStr = new StringBuilder("[");

        for (int i = 0; i < array.length; i++){
            arrStr.append(array[i]).append(i != array.length - 1 ? ", " : "]");
        }

        System.out.println(arrStr);
    }



}
