package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class CalculadoraTest
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public CalculadoraTest(String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( CalculadoraTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testSumar()
    {
        assertEquals(5, Calcuadora.sumar(3,2));
    }

    public void testRestar()
    {
        assertEquals(1, Calcuadora.sumar(3,2));
    }
}
