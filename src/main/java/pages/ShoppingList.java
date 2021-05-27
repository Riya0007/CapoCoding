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
 * @classDescriptiom "Shopping List Page related methods are present."
 *
 */
public class ShoppingList extends BaseTest {
	
	public ShoppingList(AndroidDriver<AndroidElement> driver) {
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath="//android.widget.EditText[contains(@resource-id,'search_src_text')]")
	public MobileElement Search;
	

	@AndroidFindBy(xpath="//android.widget.button[contains(@resource-id,'AddButton')]")
	public MobileElement btn_Add;
	
	public String searchByText(String text) {
		return "//android.widget.TextView[contains(@text,'"+text+"')]";
		}
	
		  
		  /**
			 * @author RiyaBasak
			 * @MathodName addItems()
			 * @function "This method will create two lists "
			 */
			  public void addItems() {
				
				try {
				// Add Items in the  List 
					}
				catch(Exception e) 
				{
					e.printStackTrace();
				}
				}
			  
			  /**
				 * @author RiyaBasak
				 * @MathodName deleteItem(String itemName)
				 * @function "This method will delete itemName from List "
				 */
				  public void deleteItem(String itemName) {
					
					try {
					// Remove Item from List 
						}
					catch(Exception e) 
					{
						e.printStackTrace();
					}
					}
				  
				  /**
					 * @author RiyaBasak
					 * @MathodName sortList()
					 * @function "This method will sort list "
					 */
					  public void sortList() {
						
						try {
						// Sort the list 
							}
						catch(Exception e) 
						{
							e.printStackTrace();
						}
						}
		  
}
