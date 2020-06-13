package Action_Item;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Action_Item_Weight_watchers {

    public static void main(String[] args) throws InterruptedException {

        //Set the chrome path
        System.setProperty("webdriver.chrome.driver","src//resource//chromedriver.exe");

        //set some preconditions using ChromeOptions
        ChromeOptions options = new ChromeOptions();

        //set the arguments for the driver, which is maximizing in this case
        options.addArguments("start-maximized","incognito");

        //simply define the chrome driver
        WebDriver driver= new ChromeDriver(options);



        //Write the String array with the variables and the length
        String[]zipCodes= new String[3];
        zipCodes[0]="11432";
        zipCodes[1]="11434";
        zipCodes[2]="11433";


        //write the for lopp
        for(int i=0;i<zipCodes.length;i++){

            //navigate to the website of weightwatchers
            driver.navigate().to("https://www.weightwatchers.com/");


            //get the title with if else command and printout the title
            String title = driver.getTitle();
            if(title.equals(" WEIGHT WATCHERS ")){
                System.out.println("Title matches with expected ");
            } else {

                System.out.println("Title doesn't match "+title);
            }

            //take 2 sec break
            Thread.sleep(2000);
            //click on "find a workshop" using xpath
            driver.findElement(By.xpath("//*[@class='last leaf menu-link-find-a-workshop']")).click();

            //take 2 sec pause
            Thread.sleep(2000);
            //enter the zipcodes
            driver.findElement(By.xpath("//*[@id='meetingSearch']")).sendKeys(zipCodes[i]);

            //take 2 sec pause
            Thread.sleep(2000);
            //submit the zipcodes
            driver.findElement(By.xpath("//*[@class='btn spice-translated']")).submit();



            //find the first location on the following zipcode using if condition
            if (i==0) {
                driver.findElements(By.xpath("//*[@class='location']")).get(1).click();
            }

            //find the first location on the following zipcode using if condition
            if (i==1) {
                driver.findElements(By.xpath("//*[@class='location']")).get(1).click();
            }

            //find the third location on the following zipcode using if condition
            if (i==2) {
                driver.findElements(By.xpath("//*[@class='location']")).get(3).click();
            }

            //take 2 sec pause
            Thread.sleep(2000);




            //Capture the addresses and print it out according to the locations
            String address = driver.findElement(By.xpath("//*[@class='location']")).getText();
            System.out.println("The location of the zipcode " + zipCodes[i] + " is " + address);

            //Capture the Virtual Studio schedule and print it according to the zipcode
            String virtualStudio = driver.findElement(By.xpath("//*[@class='meeting-detail-bottom-top']")).getText();
            System.out.println(virtualStudio + " -- is the schedule for the zipcode " + zipCodes[i]);





        }//end of for loop

    }//end of main method
}//end of java class
