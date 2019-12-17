import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SeleniumSimpleFormProject {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hilal\\TechnoStudy\\Selenium\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        driver.findElement(By.name("firstname")).sendKeys("Hilal");
        driver.findElement(By.name("lastname")).sendKeys("Kaynak");
        List<WebElement> gender = driver.findElements( By.name( "sex" ) );
        WebElement secondElementOfGender = gender.get( 1 );
        secondElementOfGender.click();
        List<WebElement> experience = driver.findElements(By.name("exp"));
        experience.get(6).click();
        WebElement date =driver.findElement(By.id("datepicker"));
        date.sendKeys("12.16.2019");
        WebElement checkbox = driver.findElement(By.id("tool-2"));
        checkbox.click();
        WebElement continent = driver.findElement(By.name("continents"));
        Select dropdown = new Select(continent);
        dropdown.selectByIndex(5);
        Select select = new Select(driver.findElement(By.id("selenium_commands")));
        List<WebElement> select31Options = select.getOptions();
        for (WebElement option : select31Options) {
            select.selectByVisibleText(option.getText());
        }




    }

}
