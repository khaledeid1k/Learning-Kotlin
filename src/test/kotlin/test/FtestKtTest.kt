package test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.platform.engine.support.hierarchical.ThrowableCollector

internal class FtestKtTest {

    @Test
    fun should_ReturnCorrectSummation_When_BothNumbersPositive() {
        // given two positive number
        val fNumber=3
        val sNumber=5
        // when find the summation of two numbers
        val sumResult = sum(fNumber, sNumber)
        //then
        assertEquals(8, sumResult)
    }

    @Test
    fun should_ReturnCorrectSummation_When_NumbersIsPositiveAndNumbersIsNegative () {
        // given two Negative number
        val fNumber=-3
        val sNumber=5
        // when find the summation of two numbers
        val sumResult = sum(fNumber, sNumber)
        //then
        assertEquals(8, sumResult)
    }



    @Test
    fun should_ReturnTrue_When_NumberIsEven(){
        // given an even number
        val number=4
        // when check number is even
        val result = isEven(number)
        //then
        assertTrue(result)
    }
    @Test
    fun should_ThrowException_When_SecondNumberIsZero(){
        // given two numbers the second number is Zero
        val fNumber=4
        val sNumber=2
        // when divide by zero
        val result = org.junit.jupiter.api.function.Executable { divide(fNumber, sNumber) }
        //then exception should be thrown
        assertThrows(Exception::class.java,result)
    }

}