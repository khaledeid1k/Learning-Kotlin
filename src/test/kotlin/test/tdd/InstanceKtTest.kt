package test.tdd

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import java.time.Instant

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class InstanceKtTest{
    lateinit var instant: Instance
    @BeforeAll
    fun setup(){
        instant= Instance()
    }
    @Test
    fun should_ReturnSortedListOfLargestTwoNumber_When_EnterAListLargerThanTwo(){
        // given a list of 2 positive integers
        val arrayContainFourNumber= arrayOf(4,6,2,9)
        //when find the largest 2 numbers
        val largestThreeNumbers= instant.getLargestTwoNumber(arrayContainFourNumber)
        //then check the if the getting correct largest three numbers
        assertArrayEquals(arrayOf(9,6),largestThreeNumbers)
    }
}