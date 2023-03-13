import org.example.Posters;
import org.example.PostersManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FindAllTest {

    PostersManager pManager = new PostersManager(4);

    Posters movie1 = new Posters("Джентельмены");
    Posters movie2 = new Posters("Вперед");
    Posters movie3 = new Posters("Бладшот");
    Posters movie4 = new Posters("Тролли");

    @BeforeEach
    public void setup() {
        pManager.save(movie1);
        pManager.save(movie2);
        pManager.save(movie3);
        pManager.save(movie4);
    }

    @Test
    public void findLastLessTest() {


        Posters[] expected = {movie4, movie3, movie2, movie1};
        Posters[] actual = pManager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }


}
