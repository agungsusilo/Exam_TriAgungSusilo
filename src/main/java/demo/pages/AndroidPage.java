package demo.pages;

import demo.webdriver.AndroidDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AndroidPage {
    public boolean isOnPage() {
        WebDriverWait wait = new WebDriverWait(AndroidDriverInstance.androidDriver, 15);
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.id("fab_add_task"))).isDisplayed();
    }

    public void clickAddButton(){
        WebElement buttonAdd = AndroidDriverInstance.androidDriver.findElement(By.id("fab_add_task"));
        buttonAdd.click();
    }

    public void inputTitle(String keyword){
        WebElement inputJudul = AndroidDriverInstance.androidDriver.findElement(By.id("add_task_title"));
        inputJudul.sendKeys(keyword);
    }

    public void inputDesc(String keyword){
        WebElement inputDesc = AndroidDriverInstance.androidDriver.findElement(By.id("add_task_description"));
        inputDesc.sendKeys(keyword);
    }

    public void saveTask(){
        WebElement buttonSave = AndroidDriverInstance.androidDriver.findElement(By.id("fab_edit_task_done"));
        buttonSave.click();
    }

    public void checkComplete(){
        WebElement buttonCheck = AndroidDriverInstance.androidDriver.findElement(By.id("complete"));
        buttonCheck.click();
    }

    public boolean isChecked(){
        String tombol = AndroidDriverInstance.androidDriver.findElement(By.id("complete")).getAttribute("checked");
        boolean data = Boolean.valueOf(tombol);
        return data;
    }

    public void clickFilterButton(){
        WebElement filterButton = AndroidDriverInstance.androidDriver.findElement(By.id("menu_filter"));
        filterButton.click();
    }

    public void clickActiveFilter(){
        WebElement activeButton = AndroidDriverInstance.androidDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Active')]"));
        activeButton.click();
    }

    public void clickCompleteFilter(){
        WebElement completeButton = AndroidDriverInstance.androidDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Completed')]"));
        completeButton.click();
    }

    public boolean isOnActiveOnlyPage() {
        WebDriverWait wait = new WebDriverWait(AndroidDriverInstance.androidDriver, 15);
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[contains(@text, 'Active TO-DOs')]"))).isDisplayed();
    }

    public boolean isOnCompleteOnlyPage() {
        WebDriverWait wait = new WebDriverWait(AndroidDriverInstance.androidDriver, 15);
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[contains(@text, 'Completed TO-DOs')]"))).isDisplayed();
    }

    //android.widget.TextView[contains(@text, 'Statistics')]
    //android.widget.ImageView[@content-desc="More options"]
    public void clickThreeDot(){
        WebElement threeDotButton = AndroidDriverInstance.androidDriver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]"));
        threeDotButton.click();
    }

    public void clickRefresh(){
        WebElement refreshButton = AndroidDriverInstance.androidDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Refresh')]"));
        refreshButton.click();
    }

    public void clearCompleted(){
        WebElement clearButton = AndroidDriverInstance.androidDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Clear completed')]"));
        clearButton.click();
    }

    public void clickThreeBars(){
        WebElement threeBarsButton = AndroidDriverInstance.androidDriver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]"));
        threeBarsButton.click();
    }

    public void clickStatisticBtn(){
        WebElement statButton = AndroidDriverInstance.androidDriver.findElement(By.xpath("//android.widget.CheckedTextView[contains(@text, 'Statistics')]"));
        statButton.click();
    }

    public boolean isOnStatisticPage() {
        WebDriverWait wait = new WebDriverWait(AndroidDriverInstance.androidDriver, 15);
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[contains(@text, 'Statistics')]"))).isDisplayed();
    }




}
