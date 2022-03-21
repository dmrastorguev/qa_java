package ru.yandex.prakticum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    @Spy
    private Feline feline;

    @Test
    public void eatMeat() throws Exception {
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Трава у дома", "Зеленая, зеленая трава"));
        assertEquals(List.of("Трава у дома", "Зеленая, зеленая трава"), feline.eatMeat());
    }

    @Test
    public void getFamily() {
        Feline feline = new Feline();
        String  actual = feline.getFamily();
        String  expected = "Кошачьи";
        assertEquals(expected,actual) ;
    }


    @Test
    public void getKittens() {
        Mockito.when(feline.getKittens(1)).thenReturn(40);
        int actual = feline.getKittens();
        assertEquals(40,actual) ;
    }

    @Test
    public void testGetKittens() {
        Feline feline = new Feline();
        int actual = feline.getKittens(10);
        int expected = 10 ;
        assertEquals(expected,actual) ;
    }
}