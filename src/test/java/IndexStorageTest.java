import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class IndexStorageTest {
    @Test
    public void getIndexCheck() throws IOException {

        IndexStorage arr = new IndexStorage(13);
        int expected = 2;
        int actual = arr.get(2);
        Assertions.assertEquals(expected, actual);

        Throwable thrown = assertThrows(IndexOutOfBoundsException.class, () -> {
            int actual2 = arr.get(-1);
            actual2 = arr.get(100500);
        });
        Assertions.assertNotNull(thrown.getMessage());

        Throwable thrown2 = assertThrows(IllegalArgumentException.class, () -> {
            IndexStorage arr2 = new IndexStorage(0);
        });
        Assertions.assertNotNull(thrown2.getMessage());


    }

    @Test
    public void getReverseArrayCheck(){
        IndexStorage arr = new IndexStorage(13);
        int[] expected = {12, -11, 10, -9, 8, -7, 6, -5, 4, -3, 2, -1, 0};
        int[] actual = arr.reverse();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void getChildIndexCheck(){
        ArrayIndexStorage arr2 = new ArrayIndexStorage(new int[] {13,14,15,16,17,18,19,20,21,22,23,24});
        int expected = 15;
        int actual = arr2.get(2);
        Assertions.assertEquals(expected, actual);

        Throwable thrown = assertThrows(IndexOutOfBoundsException.class, () -> {
            int actual2 = arr2.get(-1);
            actual2 = arr2.get(100500);
        });
    }
}
