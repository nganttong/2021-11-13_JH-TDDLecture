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
