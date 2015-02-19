package ac.za.cput.karl;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/02/18.
 */
public class calcTest {

        CalculatorInterface calc = new CalculatorServiceImpl();
        int result = calc.add(10, 20);


    @Before
    public void setUp() throws Exception {



    }

    @Test
    public void testName() throws Exception {

            Assert.assertEquals("Add 2+3", 30, result);

    }

    @After
    public void tearDown() throws Exception {


    }
}
