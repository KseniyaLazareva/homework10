import org.example.Posters;
import org.example.PostersManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FindAllTest {

    PostersManager pManager = new PostersManager(3);

    Posters movie1 = new Posters("Джентельмены");
    Posters movie2 = new Posters("Вперед");
    Posters movie3 = new Posters("Бладшот");
    Posters movie4 = new Posters("Тролли");
    Posters movie5 = new Posters("Номер один");

    @BeforeEach
    public void setup() {
        pManager.save(movie1);
        pManager.save(movie2);
        pManager.save(movie3);
        pManager.save(movie4);
        pManager.save(movie5);
    }

    @Test
    public void findAllLessTest() {
        Posters[] expected = {movie5, movie4, movie3};
        Posters[] actual = pManager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}