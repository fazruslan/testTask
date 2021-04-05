import com.test.model.pages.CalculatorPage;
import com.test.model.pages.GooglePage;
import com.test.utils.Webdriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

public class TestClass {


    @Test
    public void integerOperation() {
        WebDriver driver = Webdriver.getChromeDriver();

        GooglePage googlePage = new GooglePage(driver);
        CalculatorPage calculatorPage = new CalculatorPage(driver);

        driver.get(googlePage.pageUrl);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        googlePage.searchField().sendKeys("Калькулятор");
        googlePage.submitSearchButton(googlePage.searchField());

        // Калькулятор открыт, идем дальше

        calculatorPage.clickOpenBracket(calculatorPage.openBracket());
        calculatorPage.clickNumberOne(calculatorPage.numberOne());
        calculatorPage.clickPlus(calculatorPage.plus());
        calculatorPage.clickNumberTwo(calculatorPage.numberTwo());
        calculatorPage.clickCloseBracket(calculatorPage.closeBracket());
        calculatorPage.chooseMultiplication(calculatorPage.multiplication());
        calculatorPage.clickNumberThree(calculatorPage.numberThree());
        calculatorPage.clickMinus(calculatorPage.minus());
        calculatorPage.clickNumberFour(calculatorPage.numberFour());
        calculatorPage.clickNumberZero(calculatorPage.numberZero());
        calculatorPage.chooseDivide(calculatorPage.divide());
        calculatorPage.clickNumberFive(calculatorPage.numberFive());
        calculatorPage.clickEqual(calculatorPage.equal());

        String expectedMemoryStringText = "(1 + 2) × 3 - 40 ÷ 5 =";
        String receiveMemoryStringText = driver.findElement(By.xpath("//span[@class='vUGUtc']")).getText();

        Assert.assertEquals(expectedMemoryStringText, receiveMemoryStringText);

        driver.quit();

    }

    @Test
    public void divisionByZero() {
        WebDriver driver = Webdriver.getChromeDriver();

        GooglePage googlePage = new GooglePage(driver);
        CalculatorPage calculatorPage = new CalculatorPage(driver);

        driver.get(googlePage.pageUrl);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        googlePage.searchField().sendKeys("Калькулятор");
        googlePage.submitSearchButton(googlePage.searchField());

        calculatorPage.clickNumberSix(calculatorPage.numberSix());
        calculatorPage.chooseDivide(calculatorPage.divide());
        calculatorPage.clickNumberZero(calculatorPage.numberZero());
        calculatorPage.clickEqual(calculatorPage.equal());

        String expectedMemoryStringText = "6 ÷ 0 =";
        String receiveMemoryStringText = driver.findElement(By.xpath("//span[@class='vUGUtc']")).getText();


        String expectedResultStringText = "Infinity";
        String receiveResultStringText = driver.findElement(By.xpath("//span[@id='cwos']")).getText();

        Assert.assertEquals(expectedMemoryStringText, receiveMemoryStringText);
        Assert.assertEquals(expectedResultStringText, receiveResultStringText);

        driver.quit();
    }

    @Test
    public void checkError() {
        WebDriver driver = Webdriver.getChromeDriver();

        GooglePage googlePage = new GooglePage(driver);
        CalculatorPage calculatorPage = new CalculatorPage(driver);

        driver.get(googlePage.pageUrl);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        googlePage.searchField().sendKeys("Калькулятор");
        googlePage.submitSearchButton(googlePage.searchField());

        calculatorPage.clickSineCharacter(calculatorPage.sineCharacter());
        calculatorPage.clickEqual(calculatorPage.equal());

        String expectedMemoryStringText = "sin() =";
        String receiveMemoryStringText = driver.findElement(By.xpath("//span[@class='vUGUtc']")).getText();

        String expectedResultStringText = "Error";
        String receiveResultStringText = driver.findElement(By.xpath("//span[@id='cwos']")).getText();

        Assert.assertEquals(expectedMemoryStringText, receiveMemoryStringText);
        Assert.assertEquals(expectedResultStringText, receiveResultStringText);

        driver.quit();
    }

    }

