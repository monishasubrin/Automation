package Day4_04192020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google_test_with_loop {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src//resources//chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        String[] songs = new String[3];
        songs[0] = "rehnuma";
        songs[1] = "musafir";
        songs[2] = "dil kyun yeh mera";

        for(int i = 0; i<songs.length; i++)
        {

            driver.navigate().to("https://www.youtube.com");

            Thread.sleep(3000);

            driver.manage().window().maximize();

            Thread.sleep(3000);

            driver.findElement(By.name("search_query")).sendKeys(songs[i]);

            Thread.sleep(3000);


            driver.findElement(By.name("search_query")).submit();

            Thread.sleep(3000);

            System.out.println( " my fav song is " + songs[i]);

            driver.quit();







        }//end of for loop


    }//end of main method
}//end of java class
