package Day9_05092020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Reusable_Library {

    static int timeout = 20;


    //method to re use chrome driver and chrome options
    public static WebDriver setDriver(){
        //set the chrome path
        System.setProperty("webdriver.chrome.driver","src//resource//chromedriver.exe");
        //set some pre conditions using ChromeOptions
        ChromeOptions options = new ChromeOptions();
        //set the arguments you want for the driver
        options.addArguments("start-maximized","incognito");
        //now simply define your chrome driver
        WebDriver driver = new ChromeDriver(options);

        return driver;
    }

    //method to compare expected with actual title
    public static void verifyTitle(WebDriver driver,String expectedTitle){
        String actualTitle = driver.getTitle();
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Expected title matches with Actual " + expectedTitle);
        } else {
            System.out.println("Expected doesn't match actual title. Actual title is " + actualTitle);
        }
    }//end of verify title method


    //method to select a drop down value by visible text
    public static void dropdownByText(WebDriver driver,String locator, String userInput, String elementName){
        WebDriverWait wait = new WebDriverWait(driver,timeout);
        try{
            System.out.println("Selecting a value on element " + elementName);
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
            Select dDown = new Select(element);
            dDown.selectByVisibleText(userInput);
        } catch (Exception e) {
            System.out.println("Unable to select element " + elementName + " " + e);
        }
    }//end of drop down by text method

    //method to enter user input on send keys
    public static void userKeys(WebDriver driver,String locator, String userInput, String elementName){
        WebDriverWait wait = new WebDriverWait(driver,timeout);
        try{
            System.out.println("Entering a value on element " + elementName);
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
            element.clear();
            element.sendKeys(userInput);
        } catch (Exception e) {
            System.out.println("Unable to enter element " + elementName + " " + e);
        }
    }//end of sendkeys method

    //method to click on an element
    public static void click(WebDriver driver,String locator,String elementName){
        WebDriverWait wait = new WebDriverWait(driver,timeout);
        try{
            System.out.println("Clicking a value on element " + elementName);
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
            element.click();
        } catch (Exception e) {
            System.out.println("Unable to click element " + elementName + " " + e);
        }
    }//end of click method

    //method to submit on an element
    public static void submit(WebDriver driver,String locator,String elementName){
        WebDriverWait wait = new WebDriverWait(driver,timeout);
        try{
            System.out.println("Submitting a value on element " + elementName);
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
            element.submit();
        } catch (Exception e) {
            System.out.println("Unable to submit element " + elementName + " " + e);
        }
    }//end of click method

    //method to return text from an element
    public static String captureText(WebDriver driver,String locator,String elementName){
        WebDriverWait wait = new WebDriverWait(driver,timeout);
        String result = null;
        try{
            System.out.println("Capturing a text from element " + elementName);
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
            result = element.getText();
            System.out.println("My Text result is " + result);
        } catch (Exception e) {
            System.out.println("Unable to capture text on element " + elementName + " " + e);
        }

        return result;
    }//end of click method

    //method to use mouseHover
    public static void mouseHover(WebDriver driver,String locator, String elementName){
        WebDriverWait wait = new WebDriverWait(driver,timeout);
        Actions mouseHover = new Actions(driver);
        try{
            System.out.println("hovering the mouse to select " + elementName);
            WebElement element= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));

            mouseHover.moveToElement(element).perform();
        } catch (Exception e) {
            System.out.println("Unable to hover " + mouseHover + elementName + " " + e);
        }
    }//end of mouseHover method

    //method to use mouseClick
    public static void mouseClick(WebDriver driver,String locator, String userInput, String elementName){
        WebDriverWait wait = new WebDriverWait(driver,timeout);

        Actions mouseClick = new Actions(driver);
        try{
            System.out.println("click the mouse to select " + elementName);
            WebElement element= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
            mouseClick.moveToElement(element).click().perform();
        } catch (Exception e) {
            System.out.println("Unable to click " + mouseClick + elementName + " " + e);
        }
    }//end of method




}//end of java class
