package Test.Java;
//import Junit for software testing
import Main.Maths;
import org.junit.*;
public class MathsTest {
    Maths maths;
    @Before
    public void setUpInstance(){
        maths=new Maths();
    }

    @Test
    //when writing the name of the test,it must be descriptive
    public void checkTheSumOfTwoNumbersEqualsThree(){
        //assert means to check
        Assert.assertEquals(3,maths.addTwoNumbers(1,2));
    }
    @Test
    public void checkIfNumberIsPrime(){
        Assert.assertTrue(maths.checkPrime(7));
    }
}
//it eliminates zero-downtime
//Integration test is at a larger level.
