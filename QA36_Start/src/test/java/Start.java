import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Start {
    WebDriver wd;

    @Test
    public void startTrello() {
        wd = new ChromeDriver();
        wd.navigate().to("https://trello.com/");
        wd.manage().window().maximize();
        wd.navigate().back();
        wd.navigate().forward();
        wd.navigate().refresh();

        wd.close();
        wd.quit();

    }

    WebElement el1 = wd.findElement(By.tagName("div"));
    WebElement el2 = wd.findElement(By.tagName("a"));
    WebElement el3 = wd.findElement(By.id("user"));
    WebElement el4 = wd.findElement(By.id("login-form"));
    //WebElement el5= wd.findElement(By.className("username-readonly hidden"));
    WebElement el6= wd.findElement(By.className("username-readonly"));
    WebElement el7= wd.findElement(By.className("css-164r41r"));
    WebElement el8 = wd.findElement(By.linkText("Log in"));
    WebElement el9 = wd.findElement(By.className("m2N684FcksCyfT"));

    WebElement el10 = wd.findElement(By.cssSelector("#user"));
    WebElement el11 = wd.findElement(By.cssSelector(".username-readonly"));


    WebElement log1 = wd.findElement(By.cssSelector("[href='/login']"));
    WebElement log_1 = wd.findElement(By.xpath("//*[@href='/login']"));

    WebElement log2 = wd.findElement(By.cssSelector("#user"));
    WebElement log_2 = wd.findElement(By.xpath("//*[@id='user']"));
    WebElement log3 = wd.findElement(By.cssSelector("#login"));
    WebElement log_3 = wd.findElement(By.xpath("//*[@id='login']"));
    WebElement log4 = wd.findElement(By.cssSelector("#already-have-an-account"));
    WebElement log_4 = wd.findElement(By.xpath("//*[@id='already-have-an-account']"));

    WebElement log5 = wd.findElement(By.cssSelector("#password"));
    WebElement log_5 = wd.findElement(By.xpath("//*[@id='password']"));
    WebElement log6 = wd.findElement(By.cssSelector("#login-submit"));
    WebElement log_6 = wd.findElement(By.xpath("//*[@id='login-submit']"));
    WebElement log7 = wd.findElement(By.cssSelector(".m2N684FcksCyfT"));
    WebElement log_7 = wd.findElement(By.xpath("//*[@class='m2N684FcksCyfT']"));



    WebElement log11 = wd.findElement(By.cssSelector("[aria-label='Trello']"));
    WebElement log_11 = wd.findElement(By.xpath("//*[@aria-label='Trello']"));
    WebElement log121 = wd.findElement(By.cssSelector("[aria-label $='llo']"));//ends

    WebElement log31 = wd.findElement(By.cssSelector("[aria-label ^='Tr']"));//starts
    WebElement log_31 = wd.findElement(By.xpath("//*[starts-with(@aria-label,'Tr')]"));//starts
    WebElement log41 = wd.findElement(By.cssSelector("[aria-label *='rell']"));//contains
    WebElement log_121 = wd.findElement(By.xpath("//*[contains(@aria-label,'rell')]"));//contains


    //xpath
    WebElement el1x = wd.findElement(By.xpath("//*[@id='user']"));
    WebElement el2x = wd.findElement(By.xpath("//*[@class='username-readonly']"));
    WebElement el3x = wd.findElement(By.xpath("//*[@data-testid='header-member-menu-button']"));

    WebElement ellogc1= wd.findElement(By.cssSelector("[data-testid='header-member-menu-logout']"));
    WebElement ellogx1= wd.findElement(By.xpath("//*[@data-testid='header-member-menu-logout']"));


}