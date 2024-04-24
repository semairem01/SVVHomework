//B211202028 Sema İrem Kardaş
//SWE 202 SOFTWARE VERIFICATION AND VALIDATION-Homework1
// Github address: github.com/semairem01/SVVHomework
package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {


    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    @ParameterizedTest
    @CsvSource(value = {
            "10,2,5",
            "10,4,2.5f",
            "12.5f,2.5f,5",
            "10,2.5f,4",
            "12.5f,5,2.5f"
    })
    public void testDivision(float numToDivide,float divisor, float expectedResult){
        assertEquals(expectedResult,Calculator.divide(numToDivide,divisor));
    }

    @Test
    void testDivision6() {
        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> Calculator.divide(12.5f, 0),
                "IllegalArgumentException expected."
        );

        // Optional. To check whether the error messages match.
        assertEquals("Illegal Argument Exception.", exception.getMessage());
    }
}
