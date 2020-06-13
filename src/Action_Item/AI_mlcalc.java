package Action_Item;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class AI_mlcalc {

    public static void main(String[] args) throws InterruptedException {

        //Set the chrome path
        System.setProperty("webdriver.chrome.driver","src//resources//chromedriver.exe");

        //set some preconditions using ChromeOptions
        ChromeOptions options = new ChromeOptions();

        //set the arguments for the driver, which is maximizing in this case
        options.addArguments("start-maximized","incognito");

        //simply define the chrome driver
        WebDriver driver= new ChromeDriver(options);




        driver.navigate().to("https://www.mlcalc.com/");

        //get the title with if else command and printout the title
        String title = driver.getTitle();
        if(title.equals(" mlclc ")){
            System.out.println("Title matches with expected ");
        } else {

            System.out.println("Title doesn't match "+title);
        }

        Thread.sleep(3000);

         String[] pprice = new String[]{"500000","600000","450000"};
        int i = 0;
        while(i < pprice.length) {

            driver.findElement(By.xpath("//*[@name='ma']")).clear();
            Thread.sleep(3000);

            driver.findElement(By.xpath("//*[@name='ma']")).sendKeys(pprice[i]);

            i = i + 1;//incrementation and you put this at the end of your statements
        }

        Thread.sleep(3000);




        String[] dpayment = new String[]{"15","20","17"};
        int a = 0;
        while(a < dpayment.length) {


            driver.findElement(By.xpath("//*[@name='dp']")).clear();

            driver.findElement(By.xpath("//*[@name='dp']")).sendKeys(dpayment[a]);

            a = a + 1;//incrementation and you put this at the end of your statements
        }

        Thread.sleep(3000);




        String[] irate = new String[]{"4.2","2.6","3.4"};
        int b= 0;
        while(b < irate.length) {


            driver.findElement(By.xpath("//*[@name='ir']")).clear();

            driver.findElement(By.xpath("//*[@name='ir']")).sendKeys(irate[b]);

            b = b + 1;//incrementation and you put this at the end of your statements
        }
        Thread.sleep(3000);



        String[] pi = new String[]{"2000","3200","1500"};
        int c = 0;
        while(c < pi.length) {


            driver.findElement(By.xpath("//*[@name='pi']")).clear();

            driver.findElement(By.xpath("//*[@name='pi']")).sendKeys(pi[c]);


            c = c + 1;//incrementation and you put this at the end of your statements
        }




        String[] Months = new String[]{"Feb","Apr","Dec"};
        int m = 0;
        while(m< Months.length){


            WebElement month = driver.findElement(By.xpath("//*[@name='sm']"));
            Select MonthList = new Select(month);
            Thread.sleep(2000);
            MonthList.selectByVisibleText(Months[m]);


            m = m + 1;
        }


        Thread.sleep(3000);


        String[] Yr = new String[]{"2025","2030","2035"};
        int y = 0;
        while(y< Yr.length){


          WebElement year = driver.findElement(By.xpath("//*[@name='sy']"));
            Select YearList = new Select(year);
            Thread.sleep(2000);
            YearList.selectByValue(Yr[y]);


            y = y + 1;
        }


        driver.findElement(By.xpath("//*[@class = 'button-calculate action']")).click();


        String result0 = driver.findElements(By.xpath("//*[contains(@class,'big')]")).get(0).getText();
        String result2 = driver.findElements(By.xpath("//*[contains(@class,'big')]")).get(3).getText();

        System.out.println("The monthly payment is " + result0 + " and " + " the payoff date is " + result2);


























       }//end of main method
   }//end of java class
