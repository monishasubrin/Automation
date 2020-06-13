package Practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class anisha_ai {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src//resource//chromedriver.exe");
        //set some pre conditions using chrome options
        ChromeOptions options = new ChromeOptions();
        //set the arguments you want for the driver
        options.addArguments("start-maximized","incognito");
        //define your chrome driver
        WebDriver driver= new ChromeDriver(options);

        //array variables for zipcode
        ArrayList<String> zipcode = new ArrayList<>();
        zipcode.add("11218");
        zipcode.add("11214");
        zipcode.add("11201");
        //array variable for referral code
        ArrayList<String>referralCode = new ArrayList<>();
        referralCode.add("2243345");
        referralCode.add("2233478");
        referralCode.add("2233452");
        //array variable for dental program
        ArrayList<String>dentalProgram= new ArrayList<>();
        dentalProgram.add("PPO-LOW");
        dentalProgram.add("PPO-MEDIUM");
        dentalProgram.add("PPO-HIGH");
        //for loop
        for (int i=0; i<3;i++) {
            //navigate to met =life
            driver.navigate().to("https://metlife.com/");
            //wait for 2 seconds
            Thread.sleep(2000);

            //verify the title
            String actualTitle = driver.getTitle();
            if (actualTitle.contains("Insurance")) {
                System.out.println("Title matches with expected ");
            } else {

                System.out.println("Title doesnt match " + actualTitle);
            }

            // click on solutions

            try {

                driver.findElement(By.xpath("//*[contains(text(),'SOLUTIONS')]")).click();
            } catch (Exception e) {
                System.out.println("Unable to click on Solutions" + e);
            }// end of search icon exception

            // click on Metlife TakeAlong Dental
            try {

                driver.findElement(By.xpath("//*[contains(text(),'MetLife TakeAlong Dental')]")).click();
            } catch (Exception e) {
                System.out.println("Unable to click on MetLife TakeAlong Dental" + e);
                Thread.sleep(4000);
            }// end of search icon exception

            Thread.sleep(4000);
            // verify the title for Met Life
            String realTitle = driver.getTitle();
            if (realTitle.contains("Dental")) {
                System.out.println("Title matches with expected ");
            } else {

                System.out.println("Title doesnt match " + actualTitle);
            }//end

            Thread.sleep(3000);
            // click on Enroll Now
            try {

                driver.findElement(By.xpath("//*[contains(text(),'Enroll Now')]")).click();
            } catch (Exception e) {
                System.out.println("Unable to click on Enroll Now" + e);
            }//end

            // defining the tabs
            ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
            driver.switchTo().window(tabs.get(1));

            Thread.sleep(4000);

            try {

                WebElement search = driver.findElement(By.xpath("//*[@id='txtZipCode']"));
                search.clear();
                Thread.sleep(3000);
                search.sendKeys(zipcode.get(i));
            } catch (Exception e) {
                System.out.println("Unable to enter the zipcode " + e);
            }// end
            //Wait for 3 seconds
            Thread.sleep(3000);
            // click on GO
            try {
                driver.findElement(By.xpath("//*[text()='GO']")).click();
                Thread.sleep(6000);
            } catch (Exception e) {
                System.out.println("Unable to submit GO" + e);
            }// end of exception

        }
    }//end of psvm
}//end of java class
