import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaseStudy1 {

	

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/fatimakauser/Desktop/selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.edureka.co/");
		driver.manage().window().fullscreen();
		
		/* attributes of search box
		* css - #search-inp
		* xpath - /html[1]/body[1]/div[2]/header[1]/section[1]/nav[1]/div[1]/ul[1]/li[1]/span[1]/form[1]/div[1]/span[1]/input[1]
		* relxpath - //input[@placeholder='Enter Course, Category or keyword']
		* id - search-inp
		* name - user_v1[query]
		* class - 
		*/
			
		
		if(driver.findElement(By.id("search-inp"))!= null)
		{
			System.out.println("Search button is present when searched by ID");
		}
		else
		{
			System.out.println("Search button is absent when searched by ID");
		}
		 
		if(driver.findElement(By.name("user_v1[query]"))!= null)
		{
			System.out.println("Search button is present when searched by name");
		}
		else
		{
			System.out.println("Search button is absent when searched by name");
		}
		
		if(driver.findElement(By.xpath("//input[@placeholder='Enter Course, Category or keyword']"))!= null)
		{
			System.out.println("Search button is present when searched by xpath");
		}
		else
		{
			System.out.println("Search button is absent when searched by xpath");
		}
		
		if(driver.findElement(By.cssSelector("#search-inp"))!= null)
		{
			System.out.println("Search button is present when searched by css Selector");
		}
		else
		{
			System.out.println("Search button is absent when searched by css Selector");
		}
		
		if(driver.findElement(By.xpath("/html[1]/body[1]/div[2]/header[1]/section[1]/nav[1]/div[1]/ul[1]/li[1]/span[1]/form[1]/div[1]/span[1]/input[1]"))!= null)
		{
			System.out.println("Search button is present when searched by absolutexpath");
		}
		else
		{
			System.out.println("Search button is absent when searched by absolutexpath");
		}
		
	
		
		/* attributes for LogIn
		 * link text - Log In
		 * partial link text - Log
		 */
		
		if(driver.findElement(By.partialLinkText("Log"))!=null)
		{
			System.out.println("LogIn button is present when searched by partial link text");
		}
		else
		{
			System.out.println("LogIn button is absent when searched by partial link text");
		}
		
		if(driver.findElement(By.linkText("Log In"))!=null)
		{
			System.out.println("LogIn button is present when searched by link text");
		}
		else
		{
			System.out.println("LogIn button is absent when searched by link text");
		}
		
		if(driver.findElement(By.tagName("a"))!=null)
		{
			System.out.println("LogIn button is present when searched by tag name");
		}
		else
		{
			System.out.println("LogIn button is absent when searched by tag name");
		
		}
		driver.close();
	}
}
