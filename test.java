package calculator;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class test {
    @Test
    public void shouldAddNumber(){
        typesOfEquations add = new typesOfEquations();
        assertEquals(3,add.addition(1,2));
    }
    @Test
    public void shouldSubNumber(){
        typesOfEquations add = new typesOfEquations();
        assertEquals(-1,add.substraction(1,2));
    }
    @Test
    public void shouldMultNumber(){
        typesOfEquations add = new typesOfEquations();
        assertEquals(2,add.multiplication(1,2));
    }
    @Test
    public void shouldDivNumber(){
        typesOfEquations add = new typesOfEquations();
        assertEquals(1,add.division(2,2));
    }


}
