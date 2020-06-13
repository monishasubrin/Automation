package Day8_05032020;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Actions_USPS {

    public static void main(String[] args) throws InterruptedException {

        //set the chrome path
        System.setProperty("webdriver.chrome.driver","src//resource//chromedriver.exe");
        //set some preconditions using ChromeOptions
        ChromeOptions options = new ChromeOptions();
        //set the arguments you want for the driver
        options.addArguments("start-maximized","incognito");
        //now simply define your chrome driver
        WebDriver driver = new ChromeDriver(options);
        //navigate to USPS
        driver.navigate().to("https://www.usps.com");

        //take a pause
        Thread.sleep(2000);

        //call your mouse actions
        Actions mouse = new Actions(driver);

        //hover to Mail & Ship tab
        try {
            WebElement MandS = driver.findElement(By.xpath("//*[text()='Mail & Ship']"));
            //call your Actions command to move to the element
            mouse.moveToElement(MandS).perform();
        }catch (Exception e){
            System.out.println("Unable to locate Mail & Ship " + e);
        }//end of Mail ans ship exception

        Thread.sleep(2000);


        //hover to Click N Ship tab
        try {
            //WebElement cNs = driver.findElement(By.xpath("//*[@class= 'tool-cns']/a[text()='Click-N-Ship']"));
            //use / to add a child properties
            WebElement cNs = driver.findElement(By.xpath("//a[text()='Click-N-Ship']/preceding::li[@class= 'tool-cns']"));
            //call your Actions command to move to the element
            //sendKeys(Keys.Enter) = submit
            //use sendKeys(Keys.) for other options
            //mouse.moveToElement(cNs).sendKeys(Keys.ENTER).perform();
            mouse.moveToElement(cNs).click().perform();

        }catch (Exception e){
            System.out.println("Unable to locate Click N Ship " + e);
        }//end of Click N Ship exception




    }//end of main method
}//end of java class
