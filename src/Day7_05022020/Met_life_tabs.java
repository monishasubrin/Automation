package Day7_05022020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Met_life_tabs{

    public static void main(String[] args) throws InterruptedException {
        //set the chrome path
        System.setProperty("webdriver.chrome.driver","src//resources//chromedriver.exe");

        //set some preconditions using ChromeOptions
        ChromeOptions options = new ChromeOptions();

        //set the arguments you want for the driver
        options.addArguments("start-maximized","incognito");

        //now simply define your chrome driver
        WebDriver driver = new ChromeDriver(options);

        //navigate to mlcalc.com
        driver.navigate().to("https://www.mlcalc.com");

        //take a pause
        Thread.sleep(2000);

        //click on solutions tab
        try{
            driver.findElement(By.xpath("//*[contains(text(),'SOLUTIONS')]")).click();
        } catch (Exception e) {
            System.out.println("Unable to click on SOLUTIONS " + e);
        }//end of SOLUTIONS exception

        //click on take along link
        try{
            driver.findElement(By.xpath("//*[contains(text(), 'MetLife TakeAlong Dental')]")).click();
        } catch (Exception e){

            System.out.println("Unable to click on MetLife TakeAlong Dental " + e);
        }//end of MetLife TakeAlong Dental exception



    }//end of main method
}//end of java class
