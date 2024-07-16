package crossbrowsing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class activity4 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("https://google.com");

        driver.findElement(By.id("APjFqb")).sendKeys("TekSchool");
       Thread.sleep(1000);
        driver.findElement(By.name("btnK")).click();
       // Thread.sleep(3000);
        driver.findElement(By.partialLinkText("TEK SCHOOL")).click();

    }
}
