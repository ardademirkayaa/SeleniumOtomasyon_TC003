import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
    public final WebDriver driver;
    public final By createaccountButon=By.xpath("//div[@class=\"nav-signin-tooltip-footer\"]/child::a");
     public final By expectedMessage= By.xpath("//div[@class=\"a-box-inner a-alert-container\"][1]");
    public final By nameSurname=By.xpath("//input[@id=\"ap_customer_name\"]");
    public final By setEmail=By.xpath("//input[@id=\"ap_email\"]");
    public final By setPassword=By.xpath("//input[@id=\"ap_password\"]");
    public final By setVerifyPassword=By.xpath("//input[@id=\"ap_password_check\"]");
    public final By CreateButton=By.xpath("//input[@id=\"continue\"]");
    public HomePage(WebDriver driver){
        super(driver);
        this.driver=driver;
    }

    public void setNameSurname(String nameAsString){
    WebElement namespace = driver.findElement(nameSurname);
    namespace.click();
    namespace.sendKeys(nameAsString);
    }
    public void setEmail(String emailAdress){
        WebElement namespace = driver.findElement(setEmail);
        namespace.click();
        namespace.sendKeys(emailAdress);
    }
    public void setPassword(String passwordAsString){
        WebElement namespace = driver.findElement(setPassword);
        namespace.click();
        namespace.sendKeys(passwordAsString);
    }
    public void setVerifyPassword(String verifyPasswordAsString){
        WebElement namespace = driver.findElement(setVerifyPassword);
        namespace.click();
        namespace.sendKeys(verifyPasswordAsString);
    }

    public String getName(){
        WebElement nameSpace=driver.findElement(nameSurname);
        return nameSpace.getAttribute("value");
    }
    public String getMail(){
        WebElement nameSpace=driver.findElement(setEmail);
        return nameSpace.getAttribute("value");
    }
    public String getPassword(){
        WebElement nameSpace=driver.findElement(setPassword);
        return nameSpace.getAttribute("value");
    }
    public String getverifyPassword(){
        WebElement nameSpace=driver.findElement(setPassword);
        return nameSpace.getAttribute("value");
    }
    public void CreateButton(){
        click(CreateButton);
    }
    public void click_accountButon(){
        click(createaccountButon);
    }
    public boolean getErrorMessage(){
         WebElement errormesage=driver.findElement(expectedMessage);
        return errormesage.isDisplayed();
    }






}
