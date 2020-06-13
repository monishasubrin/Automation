package Action_Item;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;

public class ActionItem_05082020 {

    public static void main(String[] args) throws InterruptedException {


        //set the chrome path
        System.setProperty("webdriver.chrome.driver","src//resource//chromedriver.exe");

        //set some preconditions using ChromeOptions
        ChromeOptions options = new ChromeOptions();

        //set the arguments you want for the driver
        options.addArguments("start-maximized","incognito");

        //now simply define your chrome driver
        WebDriver driver = new ChromeDriver(options);

        //array variables fro zipcode
        ArrayList<String> zipcode = new ArrayList<>();
        zipcode.add("11432");
        zipcode.add("11434");
        zipcode.add("11433");

        //define ArrayList for dental program
        ArrayList<String>dentalProgram = new ArrayList<>();
        dentalProgram.add("PPO-LOW");
        dentalProgram.add("PPO-MEDIUM");
        dentalProgram.add("PPO-HIGH");

        //define ArrayList for referralcode
        ArrayList<String> referralcode = new ArrayList<>();
        referralcode.add("736574");
        referralcode.add("254789");
        referralcode.add("453421");

        //define for loop
        for(int i=0;i<3; i++) {

            //navigate to metlife.com
            driver.navigate().to("https://www.metlife.com");

            //take a pause
            Thread.sleep(2000);

            //get the title for met life
            String title = driver.getTitle();
            if (title.equals("Insurance and Employee Benefits | MetLife")) {
                System.out.println("my title is " + title);
            } else {
                System.out.println("title does not match " + title);
            }
            //Take a pause
            Thread.sleep(2000);

            //use try and catch to click on solutions
            try {
                driver.findElement(By.xpath("//*[contains(text(),'SOLUTIONS')]")).click();
            } catch (Exception e) {
                System.out.println("Unable to click on Solutions" + e);
            }// end of solutions icon exception


            //click on take along link
            try {
                driver.findElement(By.xpath("//*[contains(text(),'MetLife TakeAlong Dental')]")).click();
            } catch (Exception e) {
                System.out.println("Unable to click on MetLife TakeAlong Dental " + e);
                //Take a pause
                Thread.sleep(3000);
            }//end of MetLife TakeAlong Dental exception

            //get the title for metlife Take Along Dental using if else
            String Title = driver.getTitle();
            if (Title.equals("MetLife TakeAlong Dental | MetLife")) {
                System.out.println("my title is " + Title);
            } else {
                System.out.println("title does not match " + Title);
            }//end of if else method
            //Take a pause
            Thread.sleep(3000);

            //use try and catch to click on enroll now button
            try {
                driver.findElement(By.xpath("//*[@class='btn-brand-2nd table']")).click();
            } catch (Exception e) {
                System.out.println("Unable to click on the enroll button");
            }//end of exception

            //Define the ArrayList for new tab and to switch back to the new tab
            ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
            driver.switchTo().window(tabs.get(1));

            //Take a pause
            Thread.sleep(4000);

            //use try and catch to clear the search bar and enter the zipcode through webElement
            try {
                WebElement Zipcode = driver.findElement(By.xpath("//*[@id='txtZipCode']"));
                Zipcode.clear();
                Thread.sleep(3000);
                Zipcode.sendKeys(zipcode.get(i));
            }catch(Exception e) {
                System.out.println("Unable to enter the zipcodes" + e);
            }//end of exception

            //Take a pause
            Thread.sleep(4000);

            //Use try and catch to click the GO button
            try {
                driver.findElement(By.xpath("//*[text()='GO']")).click();
                //Take a pause
                Thread.sleep(6000);
            } catch (Exception e) {
                System.out.println("Unable to submit GO" + e);
            }// end of exception

            //use try and catch to select the dental program
            try{
                driver.findElement(By.xpath("//*[@class='"+ dentalProgram.get(i)+"']")).click();
                Thread.sleep(4000);
            }catch (Exception e){
                System.out.println("Unable to select the dental programs" + e);
            }//end of exception

            //use try and catch to click on enroll in program now
            try{
                driver.findElement(By.xpath("//*[@class='btn btn-success']")).click();
                //Take a pause
                Thread.sleep(3000);
            }catch (Exception e) {
                System.out.println("Unable to click on the enroll in program now " + e);
            }//end of exception

            //use try and catch to clear and enter the referral code
            try {
                WebElement RC = driver.findElement(By.xpath("//*[@id='txtBxPromocode']"));
                RC.clear();
                //Take a pause
                Thread.sleep(3000);
                RC.sendKeys(referralcode.get(i));
            }catch(Exception e) {
                System.out.println("Unable to enter the referral code" + e);
            }//end of exception

            //use try and catch to click on enroll
            try {
                driver.findElement(By.xpath("//*[@name='btnEnroll']")).click();
                //Take a pause
                Thread.sleep(6000);
            } catch (Exception e) {
                System.out.println("Unable to submit GO" + e);
            }// end of exception

            //use try and catch to capture and print the text "referral code was not recognized
            try{
               WebElement rc = driver.findElement(By.xpath("//*[text()='Referral Code was not recognized']"));
               rc.getText();
                System.out.println(rc.getText());
                //Take a pause
                Thread.sleep(2000);
            } catch (Exception e){
                System.out.println("Unable to print the text " + e);
            }//end of the exception

            //use try and catch to click on submit without referral code
            try {
                driver.findElement(By.xpath("//*[@class='btn btn-primaryborder']")).click();
                //Take a pause
                Thread.sleep(6000);
            } catch (Exception e) {
                System.out.println("Unable to submit enroll without referral code" + e);
            }// end of exception

            //use try and catch to capture the PPO text and print it out when the actual PPO matches the expected PPO
            try {
                WebElement ppo = driver.findElement(By.xpath("//div[@class='col-sm-8']"));
                //use if else method to match actual PPO with expected PPO
                if (ppo.getText().contains(dentalProgram.get(i))) {
                    System.out.println("Actual ppo matches with expected ppo " + ppo.getText());
                    //Take a pause
                    Thread.sleep(2000);
                } else {
                    System.out.println("Actual ppo doesn't match with the expected ppo " + ppo.getText());
                }//end of if else method
            } catch (Exception e) {
                System.out.println("Unable to print the ppo "+ e);
            }//end  of exceptions

            //Take a pause
            Thread.sleep(2000);
            //close the tabs
            driver.close();
            //Take a pause
            Thread.sleep(2000);

            //Switch back to the first tab
            driver.switchTo().window(tabs.get(0));

        }//end of for loop

        //close the website using quit so that it clears the memory and there is no record of using the website
        driver.quit();

    }//end of main method


}//end of java class
