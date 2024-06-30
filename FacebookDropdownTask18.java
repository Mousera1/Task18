package seleniumjava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookDropdownTask18 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        System.out.println("Login page opened");
     
        WebElement element1 = driver.findElement(By.linkText("Create new account"));
        element1.click();
        System.out.println("Create new account clicked");
        Thread.sleep(3000);
        WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstname.sendKeys("Frank");
        WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
        lastname.sendKeys("Lina");
        WebElement emailadd = driver.findElement(By.xpath("//input[@name='reg_email__']"));
        emailadd.sendKeys("mfvijay14@gmail.com");
        WebElement emailadd1 = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
        emailadd1.sendKeys("mfvijay14@gmail.com");
        WebElement password = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
        password.sendKeys("testtest1");
        
        //List<WebElement> birthYear = driver.findElements(By.xpath("//select[@id='year']/option"));
		//System.out.println("Total dropdown:"  + birthYear.size());
		
		WebElement date = driver.findElement(By.xpath("//select[@id='day']"));
		//System.out.println("Total:"  + bm.getSize());
		Select var = new Select(date);
		var.selectByValue("11");
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		//System.out.println("Total:"  + bm.getSize());
		Select var1 = new Select(month);
		var1.selectByVisibleText("May");
		
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		//System.out.println("Total:"  + bm.getSize());
		Select var2 = new Select(year);
		var2.selectByValue("1985");
		
		driver.findElement(By.xpath("//input[@value='1']")).click();
		Thread.sleep(3000);
		
		WebElement element3 = driver.findElement(By.xpath("//button[@name='websubmit']"));
		element3.click();
		
		System.out.println("sign up button clicked");
        driver.get("https://www.facebook.com/recover/code/?em[0]=mfvijay14%40gmail.com&rm=send_email&cuid=AYjgBrZnNergiYawU1XBwiwmyMJQxfImtnGip3Bh0dubSjDW2jV5vUWSicuXAU7TTCPjE6uEF7C8rj5y0o1bdlq9-TjN3O_ydymP_FXVlPa3-39q0JsIq7ehlnMDG4RahfuJ257i5DEUXJhWU039wcjZXG_AAN62Bcs1WZQW5jEY1obg7pmMbsg9sAHnBEiFfkCxQvD1-jAwl_ngkfMWVRu8ZrzUXz_9gv--ZKdwk04Low&hash=AUZU-HTYM9hgtEOyS4M");

		WebElement element4 = driver.findElement(By.name("n"));
		element4.click();
		System.out.println("code given manually");
		
		if(driver.getTitle().contains("Facebook")){
			System.out.println("Successfully Registered on Facebook");
		}
		else
		{
			System.out.println("NotS uccessfully Registered on Facebook");
		}
	}

}
