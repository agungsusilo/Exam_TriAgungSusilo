package demo.pages;

import demo.webdriver.WebDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class GoogleHome {
    public void openHomePage(){
        WebDriverInstance.driver.get("https://www.google.com");
    }

    public void inputSearch(String keyword){
        WebElement inputSearch = WebDriverInstance.driver.findElement(By.xpath("//input[@name='q']"));
        inputSearch.sendKeys(keyword + Keys.ENTER);
    }
}
