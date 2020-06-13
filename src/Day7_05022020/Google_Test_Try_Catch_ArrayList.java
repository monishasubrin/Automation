package Day7_05022020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class Google_Test_Try_Catch_ArrayList{public static void main(String[] args) throws InterruptedException {

    //set the system chrome driver path atleast once in one of your main method
    //webdriver.chrome.driver needs to be in lower case string

    System.setProperty("webdriver.chrome.driver","src//resource//chromedriver.exe");

    //you declare and define the driver
    WebDriver driver = new ChromeDriver();

    //set the Arraylist for the cars
    //dont need to define the size/length and also dont need to define the index numbers
    //its a resizeable array

    ArrayList<String> cars = new ArrayList<>();
    cars.add("BMW");
    cars.add("Audi");
    cars.add("Lexus");
    for(int i = 0; i < cars.size(); i++) {


        //opening the browser automatically to go to google home page
        //driver.get("https://www.google.com"); or

        driver.navigate().to("https://www.google.com");


        Thread.sleep(2000);
        //maximize your browser
        driver.manage().window().maximize();


        //wait few seconds after navigating to page
        //put some timeout
        //sleep statements handles in milliseconds so example 1 sec = 1000 millisec.
        Thread.sleep(2000);

        //locate the search field by inspecting is first and then enter a key let's say cars
        try {
            WebElement search = driver.findElement(By.name("q"));
            search.sendKeys(cars.get(i));
        } catch (Exception e) {
            System.out.println("Unable to submit on Search Icon " + e);
        }//end of search field exception


        //click on google search
        try {
            driver.findElement(By.name("btnK")).submit();
        } catch (Exception e) {
            System.out.println("Unable to submit on Search Icon " + e);
        }//end of search icon exception

        Thread.sleep(2000);
        //close vs quit the session
        //quit will kill the driver from your task memory
        //close will only close the driver but not from your memory
        //i prefer to use quit
        //driver.quit();


        try {

            //to capture a text from website you need to
            String message = driver.findElement(By.id("result-stats")).getText();
            //using array variable to split above message
            String[] arrayResult = message.split(" ");
            System.out.println("my search number is " + arrayResult[1]);


        } catch (Exception e) {

            System.out.println("Unable to capture on Search Result " + e);
        }//end of search result exception

    //i prefer to use quit
    } driver.quit();//your last statement


}//end of main method
}//end of java class
