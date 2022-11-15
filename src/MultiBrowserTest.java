import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class MultiBrowserTest {
    static String browser = "chrome";
    static String baseUrl = "http://the-internet.herokuapp.com/login";
    static WebDriver driver;


    public static void main(String[] args) {

        // 1)Setup browsers
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gheko.driver", "drivers/geckodriver.exe");
            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("edge")) ;
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
        driver = new EdgeDriver();

        //2)Open Url
        driver.get(baseUrl);
        //We give implicit time to drive
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //3)Print the title of the page
        System.out.println("Title of the page is " + driver.getTitle());

        //4)Print the page current Url
        System.out.println("Current Url is "+ driver.getCurrentUrl());

        //5)Print the page source
        System.out.println("Page source is " + driver.getPageSource());

        //6)Enter the Username to Username field
        WebElement userfield  = driver.findElement(By.name("username"));
        userfield.sendKeys("wxyuy");


        //7)Find the password field element
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("pqr478658");

        //8)close the browser
        //driver.quit();




    }

}
