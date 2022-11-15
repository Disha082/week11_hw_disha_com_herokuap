import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FireFoxBrowserTest {

    public static void main(String[] args) {
        //1)Setup Firefox browser
        String baseurl = "http://the-internet.herokuapp.com/login";
        System.setProperty("webdriver.gheko.driver" , "drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        //2)Open Url
        driver.get(baseurl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //3)print the title of the page
        System.out.println("Page title is: " + driver.getTitle());

        //4)Print the current Url
        System.out.println("Current Url: " + driver.getCurrentUrl());

        //5)Print the page source
        System.out.println("Page source: " + driver.getPageSource());

        //6)Enter the username to username field
        WebElement usernamefield = driver.findElement(By.name("username"));
        usernamefield.sendKeys("qpoitn");

        //7)Enter the password to password field
        WebElement passWordField = driver.findElement(By.name("password"));
        passWordField.sendKeys("wauejbd15478");

        //8)Close the Browser
        //driver.quit();


    }
}
