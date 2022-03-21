package ru.yandex.prakticum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import static org.junit.Assert.*;


@RunWith(Parameterized.class)
public class LionParameterizedTest {
    @Mock
    private Feline feline;

    private final String lionSex;
    private final Boolean expectedSex;

    public LionParameterizedTest(String lionSex, Boolean expectedSex) {
        this.lionSex = lionSex;
        this.expectedSex = expectedSex;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void doesHaveMane() throws Exception {
        Lion lion = new Lion(lionSex, feline);
        boolean actual = lion.doesHaveMane();
        assertEquals(expectedSex,actual) ;
    }
}





