package Day4_04192020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bing_test_with_forloops_cars {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src//resources//chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        String[]car  = new String[5];
        car[0] = "BMW";
        car[1] = "Toyota";
        car[2] = "Mercedes";
        car[3] = "Honda";
        car[4] = "Hyundai";

        for(int i=0; i<car.length; i++) {

            //opening the browser automatically to go to bing home page
            driver.navigate().to("https://www.bing.com");

            //wait for 2 sec
            Thread.sleep(2000);


            //now it maximize the bing page
            driver.manage().window().maximize();

            //take a 2 sec pause
            Thread.sleep(2000);

            //locate the search field by inspecting it first and then enter a key let's say car
            driver.findElement(By.name("q")).sendKeys(car[i]);

            //take a 1 sec pause
            Thread.sleep(1000);

            //this will submit the key word
            driver.findElement(By.name("q")).submit();

            //take a 1 sec pause
            Thread.sleep(1000);

            //this will capture the element
            String message = driver.findElement(By.id("b_tween")).getText();

            //take a 1 sec pause
            Thread.sleep(1000);

            //this will extract the info
            String[]arrayresult = message.split(" ");

            //take a 2 sec pause
            Thread.sleep(2000);

            //print out the result
            System.out.println( "My favorite car is " + car[i] + " and the search number is " + arrayresult[0]);







        }//end of for loop
        //to quit the bing page
        driver.quit();

    }//end of main method
}//end of java class
