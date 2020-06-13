package Day9_05092020;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class statefarm_2_with_arraylist {
    public static void main(String[] args) throws InterruptedException {
        //set the chrome path
        System.setProperty("webdriver.chrome.driver","src//resource//chromedriver.exe");
        //set some pre conditions using ChromeOptions
        ChromeOptions options = new ChromeOptions();
        //set the arguments you want for the driver
        options.addArguments("start-maximized","incognito");
        //now simply define your chrome driver
        WebDriver driver = new ChromeDriver(options);

        //driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        //define the arrayList
        ArrayList<String> zipCode = new ArrayList();
        zipCode.add("11432");
        zipCode.add("11434");

        ArrayList<String> productType = new ArrayList();
        productType.add("Homeowners");
        productType.add("Auto");

        //define your forloop
        for(int i=0;i<zipCode.size();i++) {

            //navigate to mortgage calculator home page
            driver.navigate().to("https://www.statefarm.com");

            Thread.sleep(2500);

            //call my reusable method to compare title
            Reusable_Library.verifyTitle(driver, "Auto, Life Insurance");
            //call my reusable method to select product drop down
            Reusable_Library.dropdownByText(driver, "//*[@id='popDropdown']", productType.get(i), "Product Dropdown");
            //call my reusable method to enter a zipcode
            Reusable_Library.userKeys(driver, "//*[@id='quote-main-zip-code-input']", zipCode.get(i), "Zipcode");
            //call my reusable method to click on quote
            Reusable_Library.click(driver, "//*[text()='Start Quote']", "Start Quote");



        }



    }//end of main
}//end of java class
