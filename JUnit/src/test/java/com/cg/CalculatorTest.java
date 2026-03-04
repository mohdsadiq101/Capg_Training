package com.cg;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
//    Calculator cal;
    static Calculator cal;

    // BeforeEach creates a new object everytime a test case runs
    // AfterEach destroys that object after the test is over
//    @BeforeEach
//    public void init(){
//        cal = new Calculator();
//        System.out.println("Calculator Object Created");
//    }
//    @AfterEach
//    public void destroy(){
//        cal = null;
//        System.out.println("Calculator Object Destroyed");
//    }

    // BeforeAll creates a single object for all test case
    // AfterAll destroys that object after the test is over
    // since the all test case share the shame object therefore we have to use static

    @BeforeAll
    public static void init(){
        cal = new Calculator();
        System.out.println("Calculator Object Created");
    }
    @AfterAll
    public static void destroy(){
        cal = null;
        System.out.println("Calculator Object Destroyed");
    }

//    @Test
    @DisplayName(value = "Calculate Method")
    @ParameterizedTest
    @CsvSource({"2,4,6","6,5,11","10,15,25"})
    public void calTest(int num1,int num2,int result) {
//        Calculator cal = new Calculator();
        System.out.println("Testing calculate method");
//        assertEquals(10,cal.calculate(7,3));
        assertEquals(result,cal.calculate(num1,num2));
    }

//    @Test
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS) // checks if the test case is running in given time i.e. 1 ms
    // @Disabled // skips the test
    @ParameterizedTest
    @ValueSource(ints = {13,17,19,23,53})
    public void isPrimeTest(int num){
//        Calculator cal = new Calculator();
        System.out.println("Testing isPrime method");
        assertTrue(cal.isPrime(num));
//        assertFalse(cal.isPrime(15));
//        assertFalse(cal.isPrime(1));
    }
}
