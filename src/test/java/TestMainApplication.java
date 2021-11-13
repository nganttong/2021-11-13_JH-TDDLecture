import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestMainApplication {

    MainApplication callMain = new MainApplication();


    @Test
    public void testsWithPositives() {
        //given: an array of number as string { "1", "5", "15", "9", "4"}
        //task: sort the numbers
        //restriction: numbers must stay strings, no conversions to int
        //null values should be removed prior to sorting
        //methods should be able to account for null arrays
        //empty strings should be sorted as if they were at 0
        //
        //return an array of string numbers in proper order 1,4,5,9,15
        //Expected: {"1","4","5","9","15"}

        //given or arrange
        String[] givenArray = {"1", "5", "15", "9", "4"};
        String[] expected = {"1","4","5","9","15"};
        //when or act
        String[] actual = callMain.sortArray(givenArray);
        //then or assert
        assertArrayEquals(expected,actual);

    }
    @Test
    public  void  testWithNegatives() {
        String[] givenArray = {"-2","1", "5", "15", "9", "4"};
        String[] expected = {"-2","1","4","5","9","15"};
        //when or act
        String[] actual = callMain.sortArray(givenArray);
        //then or assert
        assertArrayEquals(expected,actual);
    }

    @Test
    public  void  testWithDecimals() {
        String[] givenArray = {"c","1", "5", "15", "9", "4"};
        String[] expected = {"1", "c","4","5","9","15"};
        //when or act
        String[] actual = callMain.sortArray(givenArray);
        //then or assert
        assertArrayEquals(expected,actual);
    }

    @Test
    public  void  testWithLeadingZeros() {
        String[] givenArray = {"007","1", "5", "15", "9", "4"};
        String[] expected = {"1", "4","5","007","9","15"};
        //when or act
        String[] actual = callMain.sortArray(givenArray);
        //then or assert
        assertArrayEquals(expected,actual);
    }

    @Test
    public  void  testLowerCaseCharacters() {
        String[] givenArray = {"c","1", "5", "15", "9", "4"};
        String[] expected = {"1","4","5","9","15"};
        //when or act
        String[] actual = callMain.sortArray(givenArray);
        //then or assert
        assertArrayEquals(expected,actual);
    }
 //solvable?
//    @Test
//    public  void  testWithNumberWord() {
//        String[] givenArray = {"six","1", "5", "15", "9", "4"};
//        String[] expected = {"1","4","5","six","9","15"};
//        //when or act
//        String[] actual = callMain.sortArray(givenArray);
//        //then or assert
//        assertArrayEquals(expected,actual);
//    }

    @Test
    public  void  testWithEmptyString() {
        String[] givenArray = {"1", "", "15", "9", "4"};
        String[] expected = {"1","4","5","9","15"};
        //when or act
        String[] actual = callMain.sortArray(givenArray);
        //then or assert
        assertArrayEquals(expected,actual);
    }

    @Test
    public  void  testWithNullList() {
        String[] givenArray = null;
        String[] expected = null;
        //when or act
        String[] actual = callMain.sortArray(givenArray);
        //then or assert
        assertArrayEquals(expected,actual);
    }

    @Test
    public  void  testWithNullString() {
        String[] givenArray = {"1", null, "15", "9", "4"};
        String[] expected = {"1","4", "9","15"};
        //when or act
        String[] actual = callMain.sortArray(givenArray);
        //then or assert
        assertArrayEquals(expected,actual);
    }

    @Test
    public  void  testWithLengthOneArray() {
        String[] givenArray = {"42"};
        String[] expected = {"42"};
        //when or act
        String[] actual = callMain.sortArray(givenArray);
        //then or assert
        assertArrayEquals(expected,actual);
    }

    //figured this out when we can get it to compile
//    @Test
//    public  void  testWhenItsNotString() {
//        String[] givenArray = {42};
//        String[] expected = {42};
//        //when or act
//        String[] actual = callMain.sortArray(givenArray);
//        //then or assert
//        assertArrayEquals(expected,actual);
//    }

    @Test
    public  void  testLengthZeroArray() {
        String[] givenArray = {};
        String[] expected = {};
        //when or act
        String[] actual = callMain.sortArray(givenArray);
        //then or assert
        assertArrayEquals(expected,actual);
    }


    //sub-method test
    @Test
    public void currentIsLessThanPrevious_true() {
        //given
        String[] givenArray = {"5", "1"};
        Boolean expected = true;
        //when or act
        Boolean actual = callMain.currentIsLessThanPrevious(givenArray[1], givenArray[0]);
        //then or assert
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void currentIsLessThanPrevious_false() {
        //given
        String[] givenArray = {"1", "5"};
        Boolean expected = false;
        //when or act
        Boolean actual = callMain.currentIsLessThanPrevious(givenArray[1], givenArray[0]);
        //then or assert
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void currentIsLessThanPrevious_whenEqual() {
        //given
        String[] givenArray = {"1", "1"};
        Boolean expected = false;
        //when or act
        Boolean actual = callMain.currentIsLessThanPrevious(givenArray[1], givenArray[1]);
        //then or assert
        Assert.assertEquals(expected,actual);
    }
}
