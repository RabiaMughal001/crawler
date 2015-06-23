import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gen {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
            WebDriver fire=new FirefoxDriver();
            fire.navigate().to("http://www.shophive.com/apple/mac");
       
       
            List <WebElement> alllinks = fire.findElements(By.tagName("a"));

            //for(int i=0;i<alllinks.size();i++)//dats loop for showing the list 
                //System.out.println(alllinks.get(i).getText());

            for(int i=0;i<alllinks.size();i++){
            	java.util.List<WebElement> priceOfproduct = fire.findElements(By
    					.className("price-box"));
    			java.util.List<WebElement> Nameofproduct = fire.findElements(By
    					.className("product-name"));

    			try {
    				for (int j = 0; j<= priceOfproduct.size(); j++) {

    					System.out.println("Product ID: "+j + "\n   Product name = "
    							+ Nameofproduct.get(j).getText() + "  \nProduct Price = "
    							+ priceOfproduct.get(j).getText());

    				}

    			} catch (IndexOutOfBoundsException e) {
    				System.out.println("\t\t\t...Next Link of page");
    			}

                fire.navigate().forward();
            }
           
            fire.close();
            
            
	}

}
