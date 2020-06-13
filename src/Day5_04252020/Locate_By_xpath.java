package Day5_04252020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locate_By_xpath {

    public static void main(String[] args) throws InterruptedException {


       // String imagePath = "//img[contains(@class,'s-image')]";


        //define your property
        System.setProperty("webdriver.chrome.driver","src//resource//chromedriver.exe");

        //define the driver
        WebDriver driver = new ChromeDriver();

        //navigate to amazon home page
        driver.navigate().to("https://www.amazon.com");

        //maximize the window
        driver.manage().window().maximize();

        //wait for few seconds
        Thread.sleep(2000);

        //enter a keyword laptop on amazon search field by using xpath
        driver.findElement(By.xpath("//*[@name='field-keywords' or @id='twotabsearchtextbox']")).sendKeys("laptop");

        //click on search icon
        driver.findElement(By.xpath("//*[@value='Go']")).click();


        //click on second image item of the same elements within the page using index number
        //use contains when you have to carry out the process so that it shows everything with the particular property values
        //driver.findElements(By.xpath("//[contains(@class,'s-image')]")).get(1).click();
        //click on second image item of the same elements within that page using index number
        //driver.findElements(By.xpath("//img[contains(@class,'s-image')]")).get(1).click(); or go to the next command after psvm and for that write: driver.findElements(By.xpath("imagePath")).get(1).click();
        ///driver.findElements(By.xpath("//img[contains(@class,'s-image')]")).get(1).click()
        //use findElements for links and images


        //click on second image item of the same elements within the page using index number
        driver.findElements(By.xpath("//img[contains(@class,'s-image')]")).get(3).click();


        //renavigate back to home page
        //driver.navigate().to("https://www.amazon.com");


        //add the product in the cart
        driver.findElement(By.xpath("//*[@id='add-to-cart-button']")).click();



    }//end of main method

}//end of java class
