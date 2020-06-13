package Practices;

import Day9_05092020.Reusable_Library;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class mouse_resuable_practice {
    public static void main(String[] args) throws InterruptedException, IOException, BiffException, WriteException {
        Workbook readableFile = Workbook.getWorkbook(new File("src/resource/Express_workbook.xls"));


        //STEP 2:
        //locate the readable worksheet by index
        Sheet readableSheet = readableFile.getSheet(0);

        //STEP 3:
        //we need to create a writable workbook to mimic readable file because we shouldn't be writing on readable file
        WritableWorkbook writableFile = Workbook.createWorkbook(new File("src/resource/Express_workbook_result.xls"), readableFile);
        //Create Writable sheet
        WritableSheet writableSheet = writableFile.getSheet(0);
        //get the total rows that are not empty
        int rows = writableSheet.getRows();


        //define the web driver using reusable library
        WebDriver driver = Reusable_Library.setDriver();

        //define the for loop
        for (int i = 1; i < rows; i++) {

            //navigate to the website
            driver.navigate().to("https://www.express.com/");


            String size = writableSheet.getCell(0, i).getContents();
            String quantity = writableSheet.getCell(1,i).getContents();
            String firstName = writableSheet.getCell(2,i).getContents();
            String lastName = writableSheet.getCell(3,i).getContents();
            String email = writableSheet.getCell(4,i).getContents();
            String reenterEmail= writableSheet.getCell(5,i).getContents();
            String phoneNumber = writableSheet.getCell(6,i).getContents();
            String streetAdd = writableSheet.getCell(7,i).getContents();
            String postalCode = writableSheet.getCell(8,i).getContents();
            String city = writableSheet.getCell(9,i).getContents();
            String state = writableSheet.getCell(10,i).getContents();
            String cardNumber = writableSheet.getCell(11,i).getContents();
            String month = writableSheet.getCell(12,i).getContents();
            String year = writableSheet.getCell(13,i).getContents();
            String cvv = writableSheet.getCell(14,i).getContents();



            Thread.sleep(2500);
            Reusable_Library.mouseHover(driver, "(//*[@class='_399XX MegaMenu_primaryNav__label__1s3d1']) [1]","Women tab");
            Reusable_Library.mouseClick(driver, "//*[text()='Dresses']", "Dresses", "Dresses");
            Thread.sleep(2500);
           Reusable_Library.click(driver,"(//*[@class='_1ddDj _136PD']) [1]","off the shoulder ruffle maxi dress");
           Reusable_Library.click(driver, "//button[@value='s']", "size");
            Reusable_Library.click(driver, "//*[text()='Add to Bag']","click on add to bag");
            Reusable_Library.mouseHover(driver,"(//*[@class='_2CsVP svg-icon--shopping-bag']) [2]","click to bag");
            Thread.sleep(2500);
            Reusable_Library.click(driver,"//*[text()='View Bag & Check Out']","VIEW BAG & CHECK OUT");
            Reusable_Library.dropdownByText(driver,"//*[@id='qdd-@-quantity']",quantity,"Quantity");
            Reusable_Library.click(driver,"//*[text()='Checkout']","Checkout");
            Reusable_Library.click(driver,"//*[text()='Continue as Guest']","continue as guest");
            Reusable_Library.userKeys(driver,"//*[@name='firstname']",firstName,"First Name" );
            Reusable_Library.userKeys(driver,"//*[@name='lastname']",lastName,"Last Name" );
            Reusable_Library.userKeys(driver,"//*[@name='email']",email,"email" );
            Reusable_Library.userKeys(driver,"//*[@name='reenterEmail']",reenterEmail,"reenter email" );
            Reusable_Library.userKeys(driver,"//*[@name='phoneNumber']",phoneNumber,"phoneNumber" );
            Reusable_Library.click(driver,"//*[text='Continue']","continue" );
            Reusable_Library.userKeys(driver,"//*[@name='shipping.line1']",streetAdd,"street add" );
            Reusable_Library.userKeys(driver,"//*[@name='shipping.postalCode']",postalCode,"postal code" );
            Reusable_Library.userKeys(driver,"//*[@name='shipping.city']",city,"city" );
            Reusable_Library.dropdownByText(driver,"//*[@name='shipping.state']",state,"state" );
            Thread.sleep(3000);
            Reusable_Library.click(driver,"//*[text='Continue']","press continue" );
            Reusable_Library.userKeys(driver,"//*[@name='creditCardNumber']",cardNumber,"credit card number");
            Reusable_Library.dropdownByText(driver,"//*[@name='expMonth']",month,"month" );
            Reusable_Library.dropdownByText(driver,"//*[@name='expYear']",year,"year" );
            Reusable_Library.userKeys(driver,"//*[@name='cvv']",cvv,"cvv");
            Reusable_Library.click(driver,"//*[text()='Place Order']","Place order");
            String errorMessage = Reusable_Library.captureText(driver,"//div[@id='rvn-note-NaN']","Error Message");
            Label label = new Label(15,i,errorMessage);
            writableSheet.addCell(label);
            driver.manage().deleteAllCookies();

        }//end of for loop

        //outside of the loop we need to write and close the excel
        writableFile.write();
        writableFile.close();
        readableFile.close();
        driver.quit();


    }//end of main method
}//end of java class
