package knu.fit.ist.ta;

import knu.fit.ist.ta.lab2.Calculate;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import knu.fit.ist.ta.exam.CalculateExam;
import knu.fit.ist.ta.exam.Results;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TaApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void test1() {
        assertEquals(0.02f, 0.025f, 0.01f);
    }

    @Test
    void test2() {

        assertEquals(Float.MAX_VALUE, Calculate.lab2equation(0));
        assertEquals(0, Calculate.lab2equation(0.5f));
        assertEquals(0.05f, Calculate.lab2equation(2));

    }
@Test
    void testFormula()
    {
        assertEquals(0.8181818181818182, CalculateExam.Calculate(6));
        assertEquals(9, CalculateExam.Calculate(1));
    }
    
    @Test
    void testFormulaWithManyArgs()
    {
        Results fr = new Results();
        double[] mas = new double[]{7d, 7.5d, 8d};
        fr.SetArgs(mas);
        assertEquals("[0.69, 0.64, 0.6]", fr.Calculate());
    }
}