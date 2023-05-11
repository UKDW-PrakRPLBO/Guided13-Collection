package org.rplbo.inttopos;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest
{

    @Test
    public void testApp()
    {
        String exp = "(9+8)*7^2";
        String hasil = new InToPos().infixToPostfix(exp);
        int h = new PosEval().evaluatePostfix(hasil.trim());
        assertEquals(833,h);

        exp = "9+8*(2^3-4)^(5+6*1)-7";
        hasil = new InToPos().infixToPostfix(exp);
        assertEquals("9823^4-561*+^*+7-",hasil);
    }
}
