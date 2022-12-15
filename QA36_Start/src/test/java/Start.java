import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Start {
    WebDriver wd;

    @Test
    public void startTrello() {
        wd = new ChromeDriver();
        //wd.navigate().to("https://trello.com/");
        wd.manage().window().maximize();
        wd.get("https://trello.com/");
        wd.navigate().back();
        wd.navigate().forward();
        wd.navigate().refresh();
        wd.manage().window().maximize();
        //wd.close();
        wd.quit();

    }
}
