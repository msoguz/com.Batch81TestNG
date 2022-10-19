package tests;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//TEST CLASS
//Test class'i Utility classa baglamak icin @Listeners annotation'a baglama icin kullanilir
@Listeners(utilities.Listeners.class)

public class ListenersTest1 {

    @Test
    public void test1(){
        System.out.println("Test case 1 - PASS");
        Assert.assertTrue(true); //pass

    }

    @Test
    public void test2(){
        System.out.println("Test case 2 - FAILED");
        Assert.assertTrue(false);//fail
    }

    @Test
    public void test3(){
        System.out.println("Test case 3 -SKIPPED");
        throw new SkipException("Skip Edilecek"); //skip

    }
}
