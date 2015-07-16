import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gen {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
            WebDriver fire=new FirefoxDriver();
            fire.navigate().to("url of any website");
       
       
            List <WebElement> alllinks = fire.findElements(By.tagName("a"));   //get all links of webpage

            //for(int i=0;i<alllinks.size();i++)//dats loop for showing the list 
                //System.out.println(alllinks.get(i).getText());

            for(int i=0;i<alllinks.size();i++){
            	java.util.List<WebElement> priceOfproduct = fire.findElements(By   //in this i have extract price of product
    					.className("price-box"));
    			java.util.List<WebElement> Nameofproduct = fire.findElements(By //in this name of product
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

                fire.navigate().forward(); //for next page
            }
           
            fire.close();
            
            
	}

}
