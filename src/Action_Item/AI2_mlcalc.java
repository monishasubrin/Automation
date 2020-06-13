package Action_Item;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class AI2_mlcalc {

    public static void main(String[] args) throws InterruptedException {

        //Set the chrome path
        System.setProperty("webdriver.chrome.driver","src//resources//chromedriver.exe");

        //set some preconditions using ChromeOptions
        ChromeOptions options = new ChromeOptions();

        //set the arguments for the driver, which is maximizing in this case
        options.addArguments("start-maximized","incognito");

        //simply define the chrome driver
        WebDriver driver= new ChromeDriver(options);




        //go to the website
        driver.navigate().to("https://www.mlcalc.com/");

        //get the title with if else command and printout the title
        String title = driver.getTitle();
        if(title.contains("Mortgage")){
            System.out.println("Title matches as expected ");
        } else {

            System.out.println("Title doesn't matches and it is "+title);
        }//end of if else



        //write the different Strings with variables in one while loop
        String[] pp = new String[]{"200000","150000","400000"};
        String[] dp = new String[]{"15","16","17"};
        String[] ir = new String[]{"4.2","5.6","3.4"};
        String[] pi = new String[]{"2000","1200","1500"};
        String[] Months = new String[]{"Feb","Apr","Dec"};
        String[] Yr = new String[]{"2025","2030","2035"};




        //write the while loop format
        int i = 0;
        while(i < 3) {


            //take 3 sec pause
            Thread.sleep(3000);


            //Write the WebElement with its value
            WebElement PP = driver.findElement( By.xpath("//*[@name='ma']"));
            //clear the field first
            PP.clear();
            //enter your new data
            PP.sendKeys(pp[i]);



            //Write the WebElement with its value
            WebElement DP = driver.findElement( By.xpath("//*[@name='dp']"));
            //clear the field first
            DP.clear();
            //enter your new data
             DP.sendKeys(dp[i]);



            //take 3 sec pause
            Thread.sleep(3000);
            //Write the WebElement with its value
            WebElement IR = driver.findElement( By.xpath("//*[@name='ir']"));
            //clear the field first
            IR.clear();
            //enter your new data
            IR.sendKeys(ir[i]);






            //Write the WebElement with its value
            WebElement PI = driver.findElement( By.xpath("//*[@name='pi']"));
            //clear the field first
            PI.clear();
            //enter your new data
            PI.sendKeys(pi[i]);




            //take 3 sec pause
            Thread.sleep(3000);
            //write the webElement with it's value
            WebElement month = driver.findElement(By.xpath("//*[@name='sm']"));
            //write select command//it only works when the dropdown locator is under select tag
            Select MonthList = new Select(month);
            //Select months from the dropdown by visible text
            MonthList.selectByVisibleText(Months[i]);


            //take 3 sec pause
            Thread.sleep(3000);
            //write the webElement with it's value
            WebElement year = driver.findElement(By.xpath("//*[@name='sy']"));
            //write select command//it only works when the dropdown locator is under select tag
            Select YearList = new Select(year);
            //select years from the dropdown by value
            YearList.selectByValue(Yr[i]);



            //click on the calculate button using driver.findElement command
            driver.findElement(By.xpath("//*[@class = 'button-calculate action']")).click();



            //take 3 sec pause
            Thread.sleep(3000);
            //write the string to select and capture the first text
            String result0 = driver.findElements(By.xpath("//*[contains(@class,'big')]")).get(0).getText();
            //write the string to select and capture the fourth text
            String result2 = driver.findElements(By.xpath("//*[contains(@class,'big')]")).get(3).getText();



            //print out the monthly payment and the payoff date for all 3 values
            System.out.println("The monthly payment is " + result0 + " and " + " the payoff date is " + result2);



            i = i + 1;//incrementation to put this at the end of the statements
        }//end of the while loop


    }//end of main method
}//end of java class
