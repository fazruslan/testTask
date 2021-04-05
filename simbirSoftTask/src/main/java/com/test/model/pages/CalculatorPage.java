package com.test.model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CalculatorPage {

    public CalculatorPage(WebDriver driver) {
        this.driver = driver;
    }

    private WebDriver driver;
    private By openBracketSelector = By.xpath("//div[text()='(']");
    private By closeBracketSelector = By.xpath("//div[text()=')']");
    private By numberOneSelector = By.xpath("//div[text()='1']");
    private By plusSelector = By.xpath("//div[text()='+']");
    private By numberTwoSelector = By.xpath("//div[text()='2']");
    private By multiplicationSelector = By.xpath("//div[text()='×']");
    private By numberThreeSelector = By.xpath("//div[text()='3']");
    private By minusSelector = By.xpath("//div[text()='−']");
    private By numberFourSelector = By.xpath("//div[text()='4']");
    private By numberZeroSelector = By.xpath("//div[text()='0']");
    private By divideSelector = By.xpath("//div[text()='÷']");
    private By numberFiveSelector = By.xpath("//div[text()='5']");
    private By equalSelector = By.xpath("//div[text()='=']");
    private By numberSixSelector = By.xpath("//div[text()='6']");
    private By sineCharacterSelector = By.xpath("//div[text()='sin']");
    private By memoryStringSelector = By.xpath("//span[@class='vUGUtc']");
    private By resultStringSelector = By.xpath("//span[@id='cwos']");
    

    public WebElement openBracket() {
        return driver.findElement(openBracketSelector);
    }

    public WebElement closeBracket() {
        return  driver.findElement(closeBracketSelector);
    }

    public WebElement numberOne() {
        return driver.findElement(numberOneSelector);
    }

    public WebElement plus() {
        return driver.findElement(plusSelector);
    }

    public WebElement numberTwo() {
        return driver.findElement(numberTwoSelector);
    }

    public WebElement multiplication() {
        return driver.findElement(multiplicationSelector);
    }

    public WebElement numberThree() {
        return driver.findElement(numberThreeSelector);
    }

    public WebElement minus() {
        return driver.findElement(minusSelector);
    }

    public WebElement numberFour() {
        return driver.findElement(numberFourSelector);
    }

    public WebElement numberZero() {
        return driver.findElement(numberZeroSelector);
    }

    public WebElement divide() {
        return driver.findElement(divideSelector);
    }

    public WebElement numberFive() {
        return driver.findElement(numberFiveSelector);
    }

    public WebElement equal() {
        return driver.findElement(equalSelector);
    }

    public WebElement numberSix() { return driver.findElement(numberSixSelector); }

    public WebElement sineCharacter() { return driver.findElement(sineCharacterSelector); }

    public void clickOpenBracket (WebElement openBracket) {
        openBracket.click();
    }

    public void clickCloseBracket (WebElement closeBracket) {
        closeBracket.click();
    }

    public void clickNumberOne (WebElement numberOne) {
        numberOne.click();
    }

    public void clickPlus (WebElement plus) {
        plus.click();
    }

    public void clickNumberTwo (WebElement numberTwo) {
        numberTwo.click();
    }

    public void chooseMultiplication (WebElement multiplication) {
        multiplication.click();
    }

    public void clickNumberThree (WebElement numberThree) { numberThree.click(); }

    public void clickMinus (WebElement minus) {
        minus.click();
    }

    public void clickNumberFour (WebElement numberFour) {
        numberFour.click();
    }

    public void clickNumberZero (WebElement numberZero) {
        numberZero.click();
    }

    public void chooseDivide (WebElement divide) {
        divide.click();
    }

    public void clickNumberFive (WebElement numberFive) {
        numberFive.click();
    }

    public void clickEqual (WebElement equal) {
        equal.click();
    }

    public void clickNumberSix (WebElement numberSix) { numberSix.click(); }

    public void clickSineCharacter (WebElement sineCharacter) { sineCharacter.click(); }
}


