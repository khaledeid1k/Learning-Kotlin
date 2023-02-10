package test.tdd

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import test.divide

internal class AverageGrowthKtTest {

    @Test
    fun should_ReturnCorrectAverage_When_HaveCorrectInput() {
        // given correct age and height
        val age = 10
        val height = 110
        // when calculate the average
        val average = averageGrowth(age, height)
        //then check the result
        assertEquals(11,average)
    }

    @Test
    //@Disabled
    fun should_ReturnCorrectAverage_When_AverageCanBeRoundedToNextNumber() {
        // given correct age and height
        val age = 18
        val height = 192
        // when calculate the average
        val average = averageGrowth(age, height)
        //then check the result
        assertEquals(11,average)
    }

    @Test
    fun should_ReturnMinusOne_When_AgeLagerThan18() {
        // given correct height and wrong age
        val age = 25
        val height = 175
        // when calculate the average
        val average = averageGrowth(age, height)
        //then check the result
        assertNull(average)
    }

    @Test
    fun should_ReturnMinusOne_When_AgeLagerIsZero() {
        // given correct height and wrong age
        val age = 0
        val height = 175
        // when calculate the average
        val average = averageGrowth(age, height)
        //then check the result
        assertNull(average)
    }

    @Test
    fun should_ReturnMinusOne_When_AgeLagerIsNegative() {
        // given correct height and wrong age
        val age = -15
        val height = 175
        // when calculate the average
        val average = averageGrowth(age, height)
        //then check the result
        assertNull(average)
    }

    @Test
    fun should_ReturnMinusOne_When_HeightSmallerThan30() {
        // given correct age and wrong height
        val age = 15
        val height = 25
        // when calculate the average
        val average = averageGrowth(age, height)
        //then check the result
        assertNull(average)
    }

    @Test
    fun should_ReturnMinusOne_When_HeightLargerThan210() {
        // given correct age and wrong height
        val age = 4
        val height = 250
        // when calculate the average
        val average = averageGrowth(age, height)
        //then check the result
        assertNull(average)
    }


    @Test
    fun should_ReturnMinusOne_When_EnterWrongHeightAndAge() {
        // given wrong age and  height
        val age = 28
        val height = 3
        // when calculate the average
        val average = averageGrowth(age, height)
        //then check the result
        assertNull(average)
    }

    @Test
    fun should_ReturnSortedListOfLargestThreeNumber_When_EnterAListLargerThanThree(){
        // given a list of 3 positive integers
        val arrayContainFourNumber= arrayOf(4,6,2,9)
        //when find the largest 3 numbers
        val largestThreeNumbers= getLargestThreeNumber(arrayContainFourNumber)
        //then check the if the getting correct largest three numbers
        assertArrayEquals(arrayOf(9,6,4),largestThreeNumbers)
    }

}