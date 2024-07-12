package crossbrowsing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Scanner;

public class Activity1 {
    public static void main(String[] args) {
        System.out.println("Enter the browser to use: ");
        var sc = new Scanner(System.in);
        String browserType = sc.nextLine();
        WebDriver driver;
        if(browserType.equals("chrome")){
            driver=new ChromeDriver();
        }
        else if(browserType.equals("edge")){
            driver=new EdgeDriver();
        }
        else if (browserType.equals("firefox")){
            driver=new FirefoxDriver();
        }
        else {
            throw new RuntimeException();
        }
        driver.get("https://google.com");
    }
}
