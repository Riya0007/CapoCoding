package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utilities.BaseTest;
import utilities.PageUtils;

/**
 * @author Riya Basak
 * @classDescriptiom "Home Page related methods are present."
 *
 */
public class Home extends BaseTest {
	
	public Home(AndroidDriver<AndroidElement> driver) {
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath="//android.widget.EditText[contains(@resource-id,'search_src_text')]")
	public MobileElement Search;
	
	
	@AndroidFindBy(xpath="//android.widget.button[contains(@resource-id,'CreateList')]")
	public MobileElement btn_createList;

	@AndroidFindBy(xpath="//android.widget.button[contains(@resource-id,'AddButton')]")
	public MobileElement btn_Add;
	
	public String searchByText(String text) {
		return "//android.widget.TextView[contains(@text,'"+text+"')]";
		}
	
	
	/**
	 * @author RiyaBasak
	 * @MathodName createList(String ListName1, String ListName2)
	 * @function "This method will create two lists "
	 */
	  public void createDoubleList(String ListName1, String ListName2) {
		
		try {
			btn_Add.sendKeys(ListName1);
			btn_Add.sendKeys(ListName2);
			btn_createList.click();
			}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		}
	  
	  /**
		 * @author RiyaBasak
		 * @MathodName createList(String ListName1)
		 * @function "This method will create one list"
		 */
		  public void createSingleList(String ListName1) {
			
			try {
				btn_Add.sendKeys(ListName1);
				btn_createList.click();
				}
			catch(Exception e) 
			{
				e.printStackTrace();
			}
			}
}
