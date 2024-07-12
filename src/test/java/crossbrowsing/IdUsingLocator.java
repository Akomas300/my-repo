package crossbrowsing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdUsingLocator {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("https://retail.tekschool-students.com/");
        //Locate the element.
        //By searchInputLocator= By.id("searchInput");
        By searchInputLocator = By.id("signinLink");
        //find the element
       WebElement searchInputElement=driver.findElement(searchInputLocator);
        //perform the action
       searchInputElement.sendKeys("TV");

          //  By searchBtnLocator=By.id("searchBtn");
    //WebElement searchBtnElement=driver.findElement(searchBtnLocator);
   // searchBtnElement.click();
        searchInputElement.click();
    }
}
