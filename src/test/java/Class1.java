import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 {
    public static void main(String[] args) {
        ChromeDriver myDriver =new ChromeDriver();
        myDriver.manage().window().fullscreen();
        myDriver.get("https://www.linkedin.com/in/mathias-akowanou-74907326a");
        String title = myDriver.getTitle();
        System.out.println(title);
        myDriver.quit();
    }
}
