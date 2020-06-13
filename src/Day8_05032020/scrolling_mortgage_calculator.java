package Day8_05032020;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class scrolling_mortgage_calculator {


    public static void main(String[] args) throws InterruptedException {

        //set the chrome path
        System.setProperty("webdriver.chrome.driver","src//resources//chromedriver.exe");

        //set some preconditions using ChromeOptions
        ChromeOptions options = new ChromeOptions();

        //set the arguments you want for the driver
        options.addArguments("start-maximized","incognito");

        //now simply define your chrome driver
        WebDriver driver = new ChromeDriver(options);

        //navigate to mortgage calculator
        driver.navigate().to("https://www.mortgagecalculator.org");

        //take a pause
        Thread.sleep(2000);

        //declare and define javascript
        JavascriptExecutor jse = (JavascriptExecutor)driver;

        //Scroll all the way to the bottom of the  page
        //jse.executeScript("scroll(0,5000);");

        Thread.sleep(1000);
        //Scroll all the way to the top of the  page
        //jse.executeScript("scroll(0,-5000);");

        //scrolling to an element view for loan term
        try{
            WebElement Iterm = driver.findElement(By.xpath("//*[@id='loanterm']"));
            jse.executeScript("arguments[0].scrollIntoView(true);",Iterm);
        } catch (Exception e){

            System.out.println("unable to locate loan term " + e);

        }



    }//end of main method
}//end of java class
