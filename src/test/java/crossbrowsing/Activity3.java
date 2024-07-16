package crossbrowsing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity3 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("https://retail.tekschool-students.com/");

        By signinLocator=By.linkText("Sign in");
        WebElement signinElement = driver.findElement(signinLocator);
        signinElement.click();

        By creataccoount =By.linkText("Create New Account");
        WebElement accountElement = driver.findElement(creataccoount);
        accountElement.click();

       By nameLocator=By.id("nameInput");
       WebElement nameElement= driver.findElement(nameLocator);
       nameElement.sendKeys("Nasiba");

       By emailLocator=By.id("emailInput");
       WebElement emailElement=driver.findElement(emailLocator);
       emailElement.sendKeys("nasibamenraban@gmail.com");

       driver.findElement(By.id("passwordInput")).sendKeys("Nasiba@123");

driver.findElement(By.id("confirmPasswordInput")).sendKeys("Nasiba@123");
driver.findElement(By.className("signup__btn")).click();
driver.quit();
    }
}
