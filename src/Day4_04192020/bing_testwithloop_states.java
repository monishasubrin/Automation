package Day4_04192020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bing_testwithloop_states {


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src//resources//chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        String[]state  = new String[5];
        state[0] = "NewYork";
        state[1] = "Ohio";
        state[2] = "California";
        state[3] = "Texas";
        state[4] = "Florida";

        for(int i=0; i<state.length; i++) {

            //opening the browser automatically to go to bing home page
            driver.navigate().to("https://www.bing.com");

            //wait for 2 sec
            Thread.sleep(2000);


            //now it maximize the bing page
            driver.manage().window().maximize();

            //take a 2 sec pause
            Thread.sleep(2000);

            //locate the search field by inspecting is first and then enter a key let's say states
            driver.findElement(By.name("q")).sendKeys(state[i]);

           //this will submit the key words
            driver.findElement(By.name("q")).submit();

            //this will capture the element
            String message = driver.findElement(By.id("b_tween")).getText();

            //this will extract the info
            String[]arrayresult = message.split(" ");

            //print out the result
            System.out.println( "I live in " + state[i] + " and the search number is " + arrayresult[0]);







        }//end of for loop
       //to quit the bing page
        driver.quit();


    }//end of main method
}//end of java class
