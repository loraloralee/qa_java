package Tests;

import java.util.List;

import com.example.Feline;
import org.junit.Test;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    private Feline feline;

    @Before
    public void createNewFeline() {
        feline = new Feline();
    }

    @Test
    public void eatMeat() throws Exception{
        List<String> list=feline.eatMeat();
        List<String> actual=feline.getFood("Хищник");
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected,actual);

    }
    @Test
    public void getFamily(){
        String actual = feline.getFamily();
        String expected = "Кошачьи";
        assertEquals(expected,actual);
    }
    @Test
    public void getKittens(){
        int actual=feline.getKittens();
        int expected=1;
        assertEquals(expected,actual);
    }
}