import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import task_2.Main;

public class Task8Test {
    Main main;

    @BeforeTest
    public void init() {
        main = new Main();
    }

    @Test(dataProvider = "compareProvider")
    public void testCompare(int v1, int v2, String expectedResult) {
        String actualResult = main.compare(v1, v2);
        Assert.assertEquals(actualResult, expectedResult, "Unexpected result in compare");
    }

    @Test(dataProvider = "evenOddProvider")
    public void testIsEven(int num, String expectedResult) {
        String actualResult = main.isEven(num);
        Assert.assertEquals(actualResult, expectedResult, "Unexpected result in isEven");
    }

    @Test(dataProvider = "maxOfThreeProvider")
    public void testMaxOfThree(int n1, int n2, int n3, int expectedResult) {
        int actualResult = main.maxOfThree(n1, n2, n3);
        Assert.assertEquals(actualResult, expectedResult, "Unexpected result in maxOfThree");
    }

    @Test(dataProvider = "wordCountProvider")
    public void testWordCount(String input, int expectedCount) {
        int actualCount = main.countWords(input);
        Assert.assertEquals(actualCount, expectedCount, "Unexpected result in countWords");
    }

    @DataProvider
    public Object[][] compareProvider() {
        return new Object[][]{
                {10, 20, "Variable 'v2' is greater than 'v1'"},
                {20, 10, "Variable 'v1' is greater than 'v2'"},
                {15, 15, "Both variables are equal"}
        };
    }

    @DataProvider
    public Object[][] evenOddProvider() {
        return new Object[][]{
                {4, "Even"},
                {7, "Odd"}
        };
    }

    @DataProvider
    public Object[][] maxOfThreeProvider() {
        return new Object[][]{
                {5, 9, 3, 9},
                {10, 10, 5, 10},
                {1, 1, 1, 1}
        };
    }

    @DataProvider
    public Object[][] wordCountProvider() {
        return new Object[][]{
                {"This is a test", 4},
                {"Hello World", 2},
                {"oneword", 1}
        };
    }

    @Test
    @Parameters({"num1", "num2", "expectedResult"})
    public void testCompareWithParams(int num1, int num2, String expectedResult) {
        String actualResult = main.compare(num1, num2);
        Assert.assertEquals(actualResult, expectedResult, "Unexpected result with parameters");
    }
}
