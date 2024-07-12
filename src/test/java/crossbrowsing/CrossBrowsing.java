package crossbrowsing;

import org.openqa.selenium.edge.EdgeDriver;

public class CrossBrowsing {
    public static void main(String[] args) {
        EdgeDriver edge = new EdgeDriver();
        edge.manage().window().fullscreen();
        edge.get("https://google.com");
        String title = edge.getTitle();
        System.out.println(title);
    }
}
