package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropTask18 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		WebElement demoframe = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(demoframe);
		WebElement element1 = driver.findElement(By.id("draggable"));
		WebElement element2 = driver.findElement(By.id("droppable"));
		System.out.println("Elements found");
		
		Actions act =  new Actions(driver);
		act.dragAndDrop(element1, element2);
		act.build().perform();
		String backgroundcolor = driver.findElement(By.id("droppable")).getCssValue("background-color");
        System.out.println(backgroundcolor);
        
        Color Actaulhexcolor = Color.fromString(backgroundcolor);
        String result = Actaulhexcolor.asHex();
        
        System.out.println(result);
        String ExpectedHexcolor = "#fffa90";
        if(result.equals(ExpectedHexcolor)) {
        	System.out.println("Validation successful");
        }
        System.out.println(driver.findElement(By.xpath("//p[text()='Dropped!']")).getText());

	}

}
