package crossbrowsing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("https://retail.tekschool-students.com/");

        By signLocator = By.id("signinLink");
       WebElement signLocatorElement= driver.findElement(signLocator);
       signLocatorElement.click();

       By signIn = By.id("newAccountBtn");
       WebElement sign= driver.findElement(signIn);
       sign.click();

       By name= By.id("nameInput");
       WebElement nameElement = driver.findElement(name);
       nameElement.sendKeys("Mathias");

       By email=By.id("emailInput");
       WebElement emailElement = driver.findElement(email);
       emailElement.sendKeys("akomas300@gmail.com");

       By password =By.id("passwordInput");
       WebElement passwordElement=driver.findElement(password);
       passwordElement.sendKeys("Mathias@123");

       By confirm =By.id("confirmPasswordInput");
       WebElement confirmPassword= driver.findElement(confirm);
       confirmPassword.sendKeys("Mathias@123");

       By signUp=By.id("signupBtn");
       WebElement SignIn =driver.findElement(signUp);
       SignIn.click();



    }
}
