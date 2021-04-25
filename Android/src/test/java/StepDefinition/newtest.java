package StepDefinition;

import java.net.URL;
import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import PageFactory.pagenew;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class newtest {
	static AppiumDriver<MobileElement> driver;
	static String parent = null;
	pagenew pge;

	@After
	public void embedScreenshotOnFail(Scenario scenario) {

		if (scenario.isFailed()) {

			TakesScreenshot ts = (TakesScreenshot) driver;
			byte[] src = ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(src, "image/png", "screenshot");
			driver.close();

		}

	}
	

	@Given("^open the Posbytz app$")
	public void open_the_posbytz_app() throws Throwable {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "T1 ");
		cap.setCapability("udid", "192.168.1.6:5555");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "6.0.1");
		cap.setCapability("appPackage", "com.posbytz.complete.staging");
		cap.setCapability("appActivity", "com.smartbytz.pos.SplashScreen");
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(cap);
		Thread.sleep(5000);
		MobileElement allow1 = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[2]"));
		allow1.click();
		MobileElement allow2 = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[2]"));
		allow2.click();

		Thread.sleep(20000);

		// Switching to webview
		Set<String> contextNames = driver.getContextHandles();
		for (String contextName : contextNames) {
			System.out.println(contextName);
		}
		// set context to WEBVIEW_<APP_PKG_NAME>
		driver.context((String) contextNames.toArray()[1]);
		driver.navigate().refresh();
		parent = driver.getWindowHandle();
//		Set<String> childwindow1 = driver.getWindowHandles();
//		for (String newWindows1 : childwindow1) {
//			driver.switchTo().window(newWindows1);
//		}
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
//		driver.switchTo().defaultContent();
		Thread.sleep(10000);
		driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div[1]/div/form/div[1]/fieldset/div/input"))
				.sendKeys("automation");
		driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div[1]/div/form/div[2]/fieldset/div/div/input"))
				.sendKeys("qwert@123");
		driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div[1]/div/form/div[3]/fieldset/div/input"))
				.sendKeys("01820DF8");
		driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div[1]/div/form/button")).click();

		Thread.sleep(5000);
		Set<String> childwindow11 = driver.getWindowHandles();
		for (String newWindows12 : childwindow11) {
			driver.switchTo().window(newWindows12);
		}
		driver.findElement(By.xpath("/html/body/div[3]/div/div[4]/div[2]/button")).click();
		driver.switchTo().defaultContent();

		Thread.sleep(20000);
		driver.findElement(By.xpath("//*[@id=\"__layout\"]/section/div/div[1]/div[2]/div[3]/div/p")).click();
		driver.findElement(By.xpath("//*[@id=\"__layout\"]/section/div[2]/div[2]/div/div/div/div[1]/div[1]/button"))
				.click();
		driver.findElement(By.xpath("//*[@id=\"__layout\"]/section/div[2]/div[2]/div/div/div/div[1]/div[2]/button"))
				.click();
		driver.findElement(By.xpath("//*[@id=\"__layout\"]/section/div[2]/div[2]/div/div/div/div[1]/div[3]/button"))
				.click();
		driver.findElement(By.xpath("//*[@id=\"__layout\"]/section/div[2]/div[2]/div/div/div/div[2]/div[1]/button"))
				.click();
		driver.findElement(By.xpath("//*[@id=\"__layout\"]/section/div[2]/div[2]/div/div/div/div[2]/div[2]/button"))
				.click();
		driver.findElement(By.xpath("//*[@id=\"__layout\"]/section/div[2]/div[2]/div/div/div/div[2]/div[3]/button"))
				.click();

		Thread.sleep(5000);

		Set<String> opencashWin = driver.getWindowHandles();
		for (String cashdrawer : opencashWin) {
			driver.switchTo().window(cashdrawer);
		}
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/div/footer/button")).click();

		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("/html/body/div[3]/div/div[4]/div/button")).click();
		Thread.sleep(5000);

	}

	@Given("^complete one order with cash sale$")
	public void complete_one_order_with_cash_sale() throws Throwable {
		pge = new pagenew(driver);
		pge.click_item_name();
		pge.click_checkout_button();
		pge.click_Confirm_button();
		pge.click_ok_button();
		driver.quit();
	}

	@Then("^complete one order with split sale$")
	public void complete_one_order_with_split_sale() throws Throwable {

		pge = new pagenew(driver);
		pge.click_item_name();
		pge.click_checkout_button();
		pge.click_split_button();
		pge.click_selectpayment_button();
		pge.select_payment_mode();
		pge.click_Confirm_button();
		pge.click_ok_button();
		driver.quit();
	}

	@And("^create customer with (.+) and (.+) and complete credit sale$")
	public void create_customer_with_and_and_complete_credit_sale(String customername, String phonenumber)
			throws Throwable {

		pge = new pagenew(driver);
		pge.click_item_name();
		pge.click_checkout_button();
		pge.click_credit_button();
		pge.click_customer_add_button();
		pge.enter_customer_phonenumber(phonenumber);
		pge.enter_customer_name(customername);
		pge.enter_customer_credit();
		pge.enter_customer_save();
		pge.click_customer_success();
		pge.click_Confirm_button();
		pge.click_ok_button();
		Thread.sleep(5000);
		driver.quit();

	}

	@Given("^Complete discounted order with modifier and tips$")
	public void add_items_in_cart_with_modifiers_scenario() throws Throwable {

		pge = new pagenew(driver);
		pge.click_item_with_modifier();
		pge.add_tips();
		pge.add_discount();
		pge.click_checkout_button();
		Thread.sleep(3000);
		pge.click_Confirm_button();
		pge.click_ok_button();
		driver.quit();
	}

	@Given("^add one item to table$")
	public void add_one_item_to_table() throws Throwable {

		pge = new pagenew(driver);
		pge.add_order_in_table();

	}

	@Then("^again add another item to the same table$")
	public void again_add_another_item_to_the_same_table() throws Throwable {
		pge = new pagenew(driver);
		pge.add_another_order_in_table();

	}

	@And("^go to table edit the order by adding new item and complete order$")
	public void go_to_table_edit_the_order_by_adding_new_item_and_complete_order() throws Throwable {

		pge = new pagenew(driver);
		pge.edit_table_order();
		driver.quit();
	}

	@Given("^Open the waiter app in browser by using (.+) and place order with modifier$")
	public void open_the_waiter_app_in_browser_by_using_and_place_order_with_modifier(String ip) throws Throwable {

		// enable waiter app
		Thread.sleep(5000);
		TouchAction action = new TouchAction(driver);
		WebElement cash = driver
				.findElement(By.xpath("/html/body/div[1]/div/section/div/div[2]/div[1]/ul/li[6]/a/span"));
		cash.click();
		action.press(PointOption.point(90, 900)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
				.moveTo(PointOption.point(90, 600)).release().perform();
		WebElement settings = driver
				.findElement(By.xpath("/html/body/div[1]/div/section/div/div[2]/div[1]/ul/li[8]/a"));
		settings.click();
		WebElement showorderconfm = driver.findElement(By.xpath(
				"/html/body/div[1]/div/section/div/div[2]/div[2]/div/div/div[2]/div/div[2]/div[10]/div/div/label/span"));
		showorderconfm.click();
		action.press(PointOption.point(1795, 971)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
				.moveTo(PointOption.point(1795, 570)).release().perform();
		showorderconfm.click();
		WebElement waiterapp = driver.findElement(By.xpath(
				"/html/body/div[1]/div/section/div/div[2]/div[2]/div/div/div[2]/div/div[2]/div[13]/div/div/label/span"));
		waiterapp.click();
		cash.click();
		action.press(PointOption.point(90, 637)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
				.moveTo(PointOption.point(90, 935)).release().perform();
		WebElement sell = driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div[2]/div[1]/ul/li[1]/a"));
		sell.click();
		Thread.sleep(3000);

		// place order in waiter app
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\VIJAY\\git\\Android-Complete\\Android\\newchrome version driver\\chromedriver.exe");
		WebDriver drivernew = new ChromeDriver();
		drivernew.navigate().to(ip);
		drivernew.manage().window().maximize();
		drivernew.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(3000);
		WebElement employeelogin = drivernew.findElement(By.xpath("/html/body/ul/li"));
		employeelogin.click();
		Thread.sleep(3000);
		WebElement one = drivernew.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/a"));
		one.click();
		WebElement two = drivernew.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/a"));
		two.click();
		WebElement three = drivernew.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[3]/a"));
		three.click();
		WebElement four = drivernew.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/a"));
		four.click();
		WebElement five = drivernew.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/a"));
		five.click();
		WebElement six = drivernew.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[3]/a"));
		six.click();
		Thread.sleep(5000);
		WebElement tableselect = drivernew.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div"));
		tableselect.click();
		WebElement tablesubmit = drivernew.findElement(By.xpath("/html/body/div[5]/div/div/div[2]/form/div[3]/button"));
		tablesubmit.click();
		Thread.sleep(5000);
		WebElement addorange = drivernew
				.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div[1]"));
		addorange.click();
		WebElement clickmodifier = drivernew
				.findElement(By.xpath("/html/body/div[8]/div/div/div[2]/div/div[1]/div/input"));
		clickmodifier.click();
		WebElement addmodifier = drivernew.findElement(By.xpath("/html/body/div[8]/div/div/div[3]/div"));
		addmodifier.click();
		WebElement close1 = drivernew.findElement(By.xpath("/html/body/div[3]/nav/button/small"));
		close1.click();
		WebElement submit1 = drivernew.findElement(By.xpath("/html/body/div[2]/button[2]"));
		submit1.click();
		Thread.sleep(5000);
		WebElement clickadditems = drivernew.findElement(By.xpath("/html/body/div[7]/a"));
		clickadditems.click();
		WebElement addapple = drivernew
				.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[1]/div/div[2]/div/div[1]"));
		addapple.click();
		WebElement close2 = drivernew.findElement(By.xpath("/html/body/div[3]/nav/button/small"));
		close2.click();
		WebElement submit2 = drivernew.findElement(By.xpath("/html/body/div[2]/button[2]"));
		submit2.click();

	}

	@And("^complete the waiter app order in table$")
	public void complete_the_waiter_app_order_in_table() throws Throwable {

		pge = new pagenew(driver);
		pge.waiter_app_order_complete();
		driver.close();
	}

	@Given("^open (.+) app and place one selfpickup order$")
	public void open_app_and_place_one_selfpickup_order(String customerweb) throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\VIJAY\\git\\Android-Complete\\Android\\newchrome version driver\\chromedriver.exe");
		WebDriver drivernew1 = new ChromeDriver();
		drivernew1.navigate().to(customerweb);
		drivernew1.manage().window().maximize();
		drivernew1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		JavascriptExecutor je = (JavascriptExecutor) drivernew1;
		WebElement baselogin = drivernew1
				.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/nav[1]/ul[2]/li[2]/a[1]"));
		baselogin.click();
		WebElement username = drivernew1.findElement(By.xpath("//input[@id='mobile-number']"));
		username.sendKeys("9841205708");
		WebElement next = drivernew1.findElement(By.xpath("//button[contains(text(),'Next')]"));
		next.click();
		Thread.sleep(3000);

		WebElement password = drivernew1.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]/span[2]/div[1]/div[1]/div[1]/input[1]"));
		password.sendKeys("qwert@123");
		WebElement login = drivernew1.findElement(By.xpath("//button[contains(text(),'Login')]"));
		login.click();
		Thread.sleep(2000);
		WebElement startshopping = drivernew1.findElement(
				By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]"));
		startshopping.click();
		WebElement applejuice = drivernew1.findElement(By.xpath(
				"//body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/button[1]"));
		applejuice.click();
		je.executeScript("window.scrollBy(0,1000)");
		WebElement orangejuice = drivernew1.findElement(By.xpath(
				"//body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[4]/div[1]/div[3]/div[1]/button[1]"));
		orangejuice.click();
		WebElement addingmodifier = drivernew1.findElement(By.xpath("//p[contains(text(),'Chaco Juice')]"));
		addingmodifier.click();
		WebElement addingitem = drivernew1.findElement(By.xpath("//button[contains(text(),'Add Item')]"));
		addingitem.click();
		WebElement cart = drivernew1.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/nav[1]/ul[2]/li[1]/a[1]"));
		cart.click();
		WebElement checkout = drivernew1.findElement(By.xpath("//button[contains(text(),'CHECKOUT')]"));
		checkout.click();
		WebElement selfpickup = drivernew1.findElement(By.xpath("//span[contains(text(),'Self Pickup')]"));
		je.executeScript("arguments[0].scrollIntoView();", selfpickup);
		selfpickup.click();
		Thread.sleep(5000);
		WebElement confirmandcheckout = drivernew1.findElement(By.xpath(
				"/html/body/div[1]/div/div/div[2]/div[1]/div[1]/div[3]/div/div/div/div/div[2]/div[1]/div/button/span"));
		confirmandcheckout.click();
		Thread.sleep(5000);
		drivernew1.close();

	}

	@Then("^complete the online order in pos$")
	public void complete_the_online_order_in_pos() throws Throwable {

		pge = new pagenew(driver);
		pge.online_order_complete();
		driver.quit();
		
	}
	
		   @Given("^Add item to cart and choose customer$")
		    public void add_item_to_cart_and_choose_customer() throws Throwable {
		        
			  pge = new pagenew(driver);
			  pge.add_items_to_cart();
			  
			  
		    }
		  
		  @Then("^click check for loyalty then apply discount and complete the order$")
		    public void click_check_for_loyalty_then_apply_discount_and_complete_the_order() throws Throwable {
		    
			  pge = new pagenew(driver);
			  pge.add_customer_add_loalty_order_complete();
			  driver.close();
			    
		    }

		  @Given("^Add order with notes in cart move to table$")
		    public void add_order_with_notes_in_cart_move_to_table() throws Throwable {
	        
			// enable waiter app
				Thread.sleep(5000);
				TouchAction action = new TouchAction(driver);
				WebElement cash = driver
						.findElement(By.xpath("/html/body/div[1]/div/section/div/div[2]/div[1]/ul/li[6]/a/span"));
				cash.click();
				action.press(PointOption.point(90, 900)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
						.moveTo(PointOption.point(90, 600)).release().perform();
				WebElement settings = driver
						.findElement(By.xpath("/html/body/div[1]/div/section/div/div[2]/div[1]/ul/li[8]/a"));
				settings.click();
				WebElement showorderconfm = driver.findElement(By.xpath(
						"/html/body/div[1]/div/section/div/div[2]/div[2]/div/div/div[2]/div/div[2]/div[10]/div/div/label/span"));
				showorderconfm.click();
				action.press(PointOption.point(1795, 971)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
						.moveTo(PointOption.point(1795, 570)).release().perform();
				showorderconfm.click();
				WebElement waiterapp = driver.findElement(By.xpath(
						"/html/body/div[1]/div/section/div/div[2]/div[2]/div/div/div[2]/div/div[2]/div[13]/div/div/label/span"));
				waiterapp.click();
				cash.click();
				action.press(PointOption.point(90, 637)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
						.moveTo(PointOption.point(90, 935)).release().perform();
				WebElement sell = driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div[2]/div[1]/ul/li[1]/a"));
				sell.click();
				Thread.sleep(3000);
				
			  pge = new pagenew(driver);
			  pge.add_items_to_cart_with_notes_move_to_table();
			  
		  }

		  @Then("^open (.+)take  and complete the order status$")
		    public void open_take_and_complete_the_order_status(String kitchendisplay) throws Throwable {

			  System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\VIJAY\\git\\Android-Complete\\Android\\newchrome version driver\\chromedriver.exe");
				WebDriver drivernew2 = new ChromeDriver();
				drivernew2.navigate().to(kitchendisplay);
				drivernew2.manage().window().maximize();
				drivernew2.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				WebDriverWait wait = new WebDriverWait(drivernew2,30);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'common kitchen')]")));
				WebElement commonkitchen = drivernew2.findElement(By.xpath("//a[contains(text(),'common kitchen')]"));
				commonkitchen.click();
				Thread.sleep(2000);
				WebElement accept = drivernew2.findElement(By.xpath("//div[contains(text(),'accept')]"));
				accept.click();
				Thread.sleep(3000);
				WebElement ready = drivernew2.findElement(By.xpath("//div[contains(text(),'ready')]"));
				ready.click();
				Thread.sleep(3000);
				WebElement dispatched = drivernew2.findElement(By.xpath("//div[contains(text(),'dispatched')]"));
				dispatched.click();
				Thread.sleep(3000);
				drivernew2.close();
		  
		  
		  }
		  
		  
		  @And("^back to poscomplete go to table and complete the order$")
		    public void back_to_poscomplete_go_to_table_and_complete_the_order() throws Throwable {

			  pge = new pagenew(driver);
			  pge.waiter_app_order_complete();
		  
		  }
		  
		  
		  
	
	
	}

	
	
	

