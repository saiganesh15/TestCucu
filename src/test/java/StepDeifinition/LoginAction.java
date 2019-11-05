package StepDeifinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginAction 
{ 
		WebDriver p;
		@Given("navigate to home page")
		public void navigate_to_homepage() throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "C:\\My Drivers\\chromedriver.exe");
			p = new ChromeDriver();
			p.get("http://demowebshop.tricentis.com/");
			//p.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
			//p.manage().window().maximize();
			Thread.sleep(3000);
			p.findElement(By.xpath("//a[text()='Log in']")).click();
			Thread.sleep(2000);
		}
		@When("user enters {string} and {string}")
		public void user_enters_and(String uname,String pwd) throws InterruptedException
		{
			p.findElement(By.className("email")).sendKeys(uname);
			Thread.sleep(1000);
			p.findElement(By.className("password")).sendKeys(pwd);
			Thread.sleep(1000);
			p.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
			Thread.sleep(2000);
		}
		
			
		
		@Then("Message login Successfully")
		public void message_login_Successfully() throws InterruptedException
		{
			
			
//			t=p.findElement(By.xpath("//a[@href='/logout']")).isDisplayed();
//			p.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).isDisplayed();
			String atitle=p.getTitle();
			String etitle="Demo Web Shop";
			if(atitle.equals(etitle))
				System.out.println("Successful Login");
			else 
				System.out.println("Unsuccessful Login");
			Thread.sleep(1000);
			p.close();
		}
}
