package Day6_04262020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Chrome_options {

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
        Thread.sleep(4000);

        //if i want to capture the title of that page
        //System.out.println("My title is "+ driver.getTitle());
        //store your actual title as a sting variable on a variable and then compare with your expected

        String actualTitle = driver.getTitle();
        if(actualTitle.equals("MORTAGE CALCUATOR & LOAN CALCULATOR")){
            System.out.println("Title  matches with expected");
        } else {
            System.out.println("Title doesn't match " + actualTitle);
        }//end of if else

        //if same locator used more than once then store it as a WebElement variable to reuse it
        WebElement pPrice = driver.findElement( By.xpath("//*[@name='ma']"));

        //clear the field first
        pPrice.clear();
        //enter your new data
        pPrice.sendKeys("400000");

        //store your start month in WebElement variable and call it on your Select command
        WebElement sMonth = driver.findElement(By.xpath("//*[@name='sm']"));

        //call my select command and it only works when your dropdown locator is under select tag
        Select sMonthList = new Select(sMonth);
        //select the dropdown value by visible text and it must be exactly what you see in the dropdown options
        sMonthList.selectByVisibleText("Feb");

        //there are 3 ways you can select By value, index and visibletext
        //select by value or index
        //sMonthList.selectByValue("4");

        //whenever drop down is not under select tag then we must click on the dropdown and then
        //click on the value of the dropdown

       // driver.findElement(By.xpath("//*[@name='sy']")).click();
         //take a pause
       // Thread.sleep(1000);

        //driver.findElement(By.xpath("//*[text()='2025']")).click();

        //let's verify some of the start year to make sure it's matching on the drop down
        String[] yearArray = new String[]{"2005","2015","2035"};
        for(int i =0;i< yearArray.length;i++) {

            driver.findElement(By.xpath("//*[@name='sy']")).click();
            //take a pause
            Thread.sleep(1000);

            driver.findElement(By.xpath("//*[text()='" + yearArray[i] + "']")).click();



        }//end of loop









    }//end of main method
}//end of java class
