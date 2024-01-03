import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class posting_tweet {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.get("https://twitter.com/i/flow/login");
        Thread.sleep(5000);

        String username = "your_username";
        String password = "your_password";

        driver.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys(username);

        Thread.sleep(3000);

        driver.findElement(By.xpath("(//div[@role='button'])[3]")).click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@autocomplete='current-password']")).sendKeys(password);

        Thread.sleep(3000);

        driver.findElement(By.xpath("(//div[@role='button'])[3]")).click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//a[@data-testid='SideNav_NewTweet_Button']")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("(//div[@data-contents='true'])[1]")).click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("(//div[@data-contents='true'])[1]")).sendKeys("The Script Works! But has some scenarios that may need to be handled.");

        Thread.sleep(3000);

        driver.findElement(By.xpath("//div[@role='button']//span[contains(text(),'Post')]")).click();

        Thread.sleep(3000);
        driver.quit();
    }


}
