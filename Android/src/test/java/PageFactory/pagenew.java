package PageFactory;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pagenew {

	@FindBy(xpath = "/html/body/div[1]/div/section/div/div[2]/div[2]/div/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div/h6")
	WebElement item_name1;

	@FindBy(xpath = "/html/body/div[1]/div/section/div/div[2]/div[2]/div/div/div[2]/div/div/div[2]/div[3]/div[4]/button")
	WebElement checkout_button;

	@FindBy(xpath = "/html/body/div[1]/div/section/div/div[2]/div[2]/div/div[2]/div[3]/div/button[1]")
	WebElement confrm_button;

	@FindBy(xpath = "/html/body/div[3]/div/div[4]/div/button")
	WebElement order_success_button;

	@FindBy(xpath = "/html/body/div[1]/div/section/div/div[2]/div[2]/div/div[2]/div[2]/div/div[1]/div/label[5]/span")
	WebElement other_button;

	@FindBy(xpath = "/html/body/div[1]/div/section/div/div[2]/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[1]/div/p")
	WebElement cheque_button;

	@FindBy(xpath = "/html/body/div[1]/div/section/div/div[2]/div[2]/div/div[2]/div[2]/div/div[1]/div/label[3]")
	WebElement split_button;

	@FindBy(xpath = "/html/body/div[1]/div/section/div/div[2]/div[2]/div/div[2]/div[2]/div/div[2]/div/div[1]/fieldset/div/div/div/div[1]/input")
	WebElement selectpayment_button;

	@FindBy(xpath = "//*[contains(text(),'Cash')] []")
	WebElement cashpayment_button;

	@FindBy(xpath = "//*[contains(text(),'Card')] [2]")
	WebElement cardpayment_button;

	@FindBy(xpath = "/html/body/div[1]/div/section/div/div[2]/div[2]/div/div[2]/div[2]/div/div[1]/div/label[2]/span")
	WebElement credit_button;

	@FindBy(xpath = "/html/body/div[1]/div/section/div/div[2]/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div/button")
	WebElement add_customer;

	@FindBy(xpath = "/html/body/div[4]/div[1]/div/div/div/div[2]/div[1]/span/fieldset/div/input")
	WebElement cust_number;

	@FindBy(xpath = "/html/body/div[4]/div[1]/div/div/div/div[2]/div[2]/div/div[1]/span/fieldset/div/input")
	WebElement cust_name;

	@FindBy(xpath = "/html/body/div[4]/div[1]/div/div/div/div[2]/div[2]/div/div[7]/span/fieldset/div/input")
	WebElement cust_credit;

	@FindBy(xpath = "/html/body/div[4]/div[1]/div/div/footer/button[2]")
	WebElement cust_save;

	@FindBy(xpath = "/html/body/div[3]/div/div[4]/div/button")
	WebElement cust_create_sucess;

	@FindBy(xpath = "/html/body/div[1]/div/section/div/div[2]/div[2]/div/div/div[1]/div/div/div/div[2]/div[2]/div/div[2]/div/div/div/h6")
	WebElement item_name2;

	@FindBy(xpath = "/html/body/div[4]/div[1]/div/div/div/div/div/div[5]/div/div[2]/div/label")
	WebElement modifier_name1;

	@FindBy(xpath = "/html/body/div[4]/div[1]/div/div/div/div/div/div[5]/div/div[3]/div/label")
	WebElement modifier_name2;

	@FindBy(xpath = "/html/body/div[4]/div[1]/div/div/div/div/div/div[4]/div/div/div[3]/button")
	WebElement cart_add_button;

	@FindBy(xpath = "/html/body/div[4]/div[1]/div/div/footer/div[2]/button")
	WebElement dialog_close_button;

	@FindBy(xpath = "/html/body/div[1]/div/section/div/div[2]/div[2]/div/div/div[2]/div/div/div[2]/div[3]/div[1]/div/button")
	WebElement cart_setting_button;

	@FindBy(xpath = "/html/body/div[1]/div/section/div/div[2]/div[2]/div/div/div[2]/div/div/div[2]/div[3]/div[1]/div/ul/li[1]/a")
	WebElement Add_tip_button;

	@FindBy(xpath = "/html/body/div[4]/div[1]/div/div/footer/button")
	WebElement tip_20_button;

	@FindBy(xpath = "/html/body/div[1]/div/section/div/div[2]/div[2]/div/div/div[2]/div/div/div[2]/div[3]/div[1]/div/ul/li[2]/a")
	WebElement Add_discount_button;

	@FindBy(xpath = "/html/body/div[4]/div[1]/div/div/div/div/button")
	WebElement select_discount_button;

	@FindBy(xpath = "/html/body/div[4]/div[1]/div/div/footer/button[2]")
	WebElement discount_apply_button;

	@FindBy(xpath = "/html/body/div[1]/div/section/div/div[2]/div[2]/div/div[2]/div[1]/div/div[2]/button[1]")
	WebElement assign_table_button;

	@FindBy(xpath = "/html/body/div[4]/div[1]/div/div/div/div[1]/div/div[1]/div[2]/div/div/div[1]/div/div/p")
	WebElement table_name_button;

	@FindBy(xpath = "/html/body/div[4]/div[1]/div/div/footer/button[2]")
	WebElement table_done_button;

	@FindBy(xpath = "/html/body/div[1]/div/section/div/div[2]/div[2]/div/div[2]/div[3]/div/button")
	WebElement send_kot_button;

	@FindBy(xpath = "/html/body/div[3]/div/div[3]/div/button")
	WebElement table_order_success_button;

	@FindBy(xpath = "/html/body/div[1]/div/section/div/div[2]/div[2]/div/div/div[1]/div/div/div/div[2]/div[2]/div/div[3]/div/div/div/h6")
	WebElement item_name3;

	@FindBy(xpath = "/html/body/div[1]/div/section/div/div[2]/div[2]/div/div/div[1]/div/div/div/div[2]/div[2]/div/div[4]/div/div/div/h6")
	WebElement item_name4;

	@FindBy(xpath = "/html/body/div[4]/div[1]/div/div/div/div[2]/div/div/div/table/tbody/tr/td[6]")
	WebElement table_order_continue_button;

	@FindBy(xpath = "/html/body/div[1]/div/section/div/div[2]/div[1]/ul/li[2]/a")
	WebElement table_tab;

	@FindBy(xpath = "/html/body/div[1]/div/section/div/div[2]/div[2]/div/div/div[3]/div[2]/div[3]/div[3]/button")
	WebElement table_complete;

	@FindBy(xpath = "/html/body/div[1]/div/section/div/div[2]/div[2]/div/div/div[3]/div[2]/div[3]/div[1]/div/button")
	WebElement table_setting_button;

	@FindBy(xpath = "/html/body/div[1]/div/section/div/div[2]/div[2]/div/div/div[3]/div[2]/div[3]/div[1]/div/ul/li[1]/a")
	WebElement table_edit_button;

	@FindBy(xpath = "/html/body/div[1]/div/section/div/div[2]/div[1]/ul/li[3]/a/span")
	WebElement online_order_tab;

	@FindBy(xpath = "/html/body/div[1]/div/section/div/div[2]/div[2]/div/div[3]/div[2]/div/div[2]/div[2]/div[3]/div[2]/button")
	WebElement online_order_confrm_button;

	@FindBy(xpath = "/html/body/div[1]/div/section/div/div[2]/div[2]/div/div[3]/div[2]/div/div[2]/div[2]/div[3]/div[2]/button")
	WebElement online_order_ready_button;

	@FindBy(xpath = "/html/body/div[1]/div/section/div/div[2]/div[2]/div/div[3]/div[2]/div/div[2]/div[2]/div[3]/div[2]/button")
	WebElement online_order_dispatch_button;
	
	@FindBy(xpath = "/html/body/div[1]/div/section/div/div[2]/div[2]/div/div[2]/div[1]/div/div[2]/button[2]")
	WebElement cart_add_cust_button;

	@FindBy(xpath = "/html/body/div[4]/div[1]/div/div/div/div[1]/div/div/input")
	WebElement search_cust_button;
	
	@FindBy(xpath = "/html/body/div[4]/div[1]/div/div/div/div[2]/div/div/div")
	WebElement select_cust_button;
	
	@FindBy(xpath = "/html/body/div[1]/div/section/div/div[2]/div[2]/div/div[2]/div[1]/div/div[2]/div/div/button")
	WebElement click_cust_button;
	
	@FindBy(xpath = "/html/body/div[1]/div/section/div/div[2]/div[2]/div/div[2]/div[1]/div/div[2]/div/div/ul/li[3]/a")
	WebElement check_loyalty_button;
	
	@FindBy(xpath = "/html/body/div[4]/div[1]/div/div/div/div/button")
	WebElement loyalty_discount_button;
	
	@FindBy(xpath = "/html/body/div[4]/div[1]/div/div/footer/button[2]")
	WebElement loyalty_apply_button;
	
	@FindBy(xpath ="/html/body/div[1]/div/section/div/div[2]/div[2]/div/div/div[2]/div/div/div[1]/div/div[1]/div/button")
	WebElement item_corner_button;
	
	@FindBy(xpath ="/html/body/div[1]/div/section/div/div[2]/div[2]/div/div/div[2]/div/div/div[1]/div/div[1]/div/ul/li[2]/a")
	WebElement add_notes_button;
	
	@FindBy(xpath ="/html/body/div[4]/div[1]/div/div/div/textarea")
	WebElement type_notes_area;
	
	@FindBy(xpath ="//button[@class='close']")
	WebElement close_notes_button;
	
	@FindBy(xpath ="/html/body/div[1]/div/section/div/div[2]/div[2]/div/div[3]/div[2]/div/div[2]/div[2]/div[3]/div[2]/button")
	WebElement online_order_status_change_button;
	

	WebDriver driver;
	Actions action = null;

	public pagenew(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void click_item_name() {

		item_name1.click();
	}

	public void click_checkout_button() {

		checkout_button.click();

	}

	public void click_Confirm_button() throws Exception {
        
		Thread.sleep(3000);
		confrm_button.click();
	}

	public void click_ok_button() {

		order_success_button.click();
	}

	public void click_other_button() {

		other_button.click();
	}

	public void click_cheque_button() {

		cheque_button.click();

	}

	public void click_split_button() {
		split_button.click();
	}

	public void click_selectpayment_button() {
		selectpayment_button.click();
	}

	public void select_payment_mode() throws Throwable {

		action = new Actions(driver);
		selectpayment_button.click();
		Thread.sleep(3000);
		action.sendKeys(Keys.chord(Keys.DOWN, Keys.ENTER)).perform();
		driver.findElement(By.xpath("/html/body/div[3]/div/div[4]/div/button")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/div/footer/div[2]/button")).click();
		selectpayment_button.click();
		Thread.sleep(3000);
		action.sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.ENTER)).perform();
		driver.findElement(By.xpath("/html/body/div[3]/div/div[4]/div/button")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/div/footer/div[2]/button")).click();
	}

	public void click_credit_button() {
		credit_button.click();
	}

	public void click_customer_add_button() {
		add_customer.click();
	}

	public void enter_customer_phonenumber(String phonenumber) {

		cust_number.sendKeys(phonenumber);
	}

	public void enter_customer_name(String customername) {

		cust_name.sendKeys(customername);
	}

	public void enter_customer_credit() {

		cust_credit.sendKeys("1000");
	}

	public void enter_customer_save() {

		cust_save.click();

	}

	public void click_customer_success() {

		cust_create_sucess.click();
	}

	public void click_item_with_modifier() {

		item_name2.click();

		Set<String> modifierwindow = driver.getWindowHandles();
		for (String newmodifierwindow : modifierwindow) {
			driver.switchTo().window(newmodifierwindow);
		}
		modifier_name1.click();
		modifier_name2.click();
		cart_add_button.click();
		dialog_close_button.click();
		driver.switchTo().defaultContent();
	}

	public void add_tips() {

		cart_setting_button.click();
		Add_tip_button.click();
		Set<String> tipswindow = driver.getWindowHandles();
		for (String newtipswindow : tipswindow) {
			driver.switchTo().window(newtipswindow);
		}
		tip_20_button.click();
		driver.switchTo().defaultContent();
	}

	public void add_discount() {

		cart_setting_button.click();
		Add_discount_button.click();
		Set<String> discountwindow = driver.getWindowHandles();
		for (String newdiscountwindow : discountwindow) {
			driver.switchTo().window(newdiscountwindow);
		}
		select_discount_button.click();
		discount_apply_button.click();
		driver.switchTo().defaultContent();
	}

	public void add_order_in_table() {

		item_name1.click();
		checkout_button.click();
		assign_table_button.click();
		Set<String> tablewindow = driver.getWindowHandles();
		for (String newtablewindow : tablewindow) {
			driver.switchTo().window(newtablewindow);
		}
		table_name_button.click();
		table_done_button.click();
		driver.switchTo().defaultContent();
		send_kot_button.click();
		table_order_success_button.click();
	}

	public void add_another_order_in_table() {

		item_name3.click();
		checkout_button.click();
		assign_table_button.click();
		Set<String> tablewindow = driver.getWindowHandles();
		for (String newtablewindow : tablewindow) {
			driver.switchTo().window(newtablewindow);
		}
		table_name_button.click();
		table_order_continue_button.click();
		table_done_button.click();
		send_kot_button.click();
		table_order_success_button.click();

	}

	public void edit_table_order() throws Throwable {

		table_tab.click();
		table_setting_button.click();
		table_edit_button.click();
		checkout_button.click();
		send_kot_button.click();
		table_order_success_button.click();
		table_tab.click();
		table_complete.click();
		Thread.sleep(3000);
		confrm_button.click();
		order_success_button.click();

	}

	public void waiter_app_order_complete() throws Throwable {

		table_tab.click();
		table_complete.click();
		Thread.sleep(3000);
		confrm_button.click();
		order_success_button.click();

	}

	public void online_order_complete() throws Throwable {
		online_order_tab.click();
		online_order_confrm_button.click();
		Thread.sleep(3000);
		online_order_ready_button.click();
		Thread.sleep(3000);
		online_order_dispatch_button.click();

	}

	 public void add_items_to_cart() {
		 
		 item_name1.click();
		 item_name4.click();
		 checkout_button.click();
		 
	   }

	    public void add_customer_add_loalty_order_complete() throws Throwable {
	    	
	    	cart_add_cust_button.click();
	   	   search_cust_button.sendKeys("sunitha");
	   	   select_cust_button.click();
	       click_cust_button.click();
	       Set<String> loyaltywindow = driver.getWindowHandles();
			for (String newloyaltywindow : loyaltywindow) {
				driver.switchTo().window(newloyaltywindow);
			} 
	       check_loyalty_button.click();
	       loyalty_discount_button.click();
	       loyalty_apply_button.click();
	       driver.switchTo().defaultContent();
	       Thread.sleep(3000);
	       confrm_button.click();
	       order_success_button.click();
	     
	    }
		
	     	public void add_items_to_cart_with_notes_move_to_table() throws Throwable {
			
			item_name1.click();
			item_corner_button.click();
			add_notes_button.click();
			Set<String> addnoteswindow = driver.getWindowHandles();
			for (String newaddnoteswindow : addnoteswindow) {
				driver.switchTo().window(newaddnoteswindow);
			} 
			type_notes_area.sendKeys("Add more Ice");
			Thread.sleep(2000);
			close_notes_button.click();
			driver.switchTo().defaultContent();
			checkout_button.click();
			assign_table_button.click();
			Set<String> tablewindow = driver.getWindowHandles();
			for (String newtablewindow : tablewindow) {
				driver.switchTo().window(newtablewindow);
			}
			table_name_button.click();
			table_done_button.click();
			driver.switchTo().defaultContent();
			send_kot_button.click();
			table_order_success_button.click();
		
		}

	     	public void zomato_online_order_complete() throws Throwable {
	    		Thread.sleep(10000);
	    		try {
	    		online_order_tab.click();
	    		online_order_status_change_button.click();
	    		Thread.sleep(3000);
	    		online_order_status_change_button.click();
	    		Thread.sleep(3000);
	    		online_order_status_change_button.click();
	    		Thread.sleep(3000);
	    		online_order_status_change_button.click();
	    		}
	    		catch(Exception e) {
	    	
	    			System.out.println("Exception received is" + e);
	    		}
	    		
	    	}
	    	
			
	
}
