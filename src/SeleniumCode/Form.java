package SeleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form {
    public static void main(String[] args) throws InterruptedException {
        String url="https://ganninvestments.com/register/?gclid=EAIaIQobChMI3MX9ssLM9wIVXpJmAh2GfAc5EAAYASAAEgLX__D_BwE";
        System.setProperty("webdriver.chrome.driver", "D:\\Automation Eclipse\\SeleniumWithJava\\Driver\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get(url);
        driver.manage().window().fullscreen();
        Thread.sleep(5000);
        driver.findElement(By.id("wt-cli-accept-all-btn")).click();
        driver.findElement(By.xpath("//input[@name='text-name']")).sendKeys("Ankit");
        driver.findElement(By.xpath("//input[@name='text-surname']")).sendKeys("Kumar");
        driver.findElement(By.xpath("//input[@name='email-228']")).sendKeys("Kumar@mail.com");
        driver.findElement(By.xpath("//div[@class='selected-flag']")).click();
        driver.findElement(By.xpath("//li[@class='country' ][@data-dial-code='91']/span[text()='India (भारत)']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Contact Number']")).sendKeys("9590634892");
        driver.findElement(By.xpath("//input[@name='acceptance-971']")).click();
        driver.findElement(By.xpath("//input[@name='acceptance-448']")).click();
        Thread.sleep(5000);
        driver.close();
    }

}
