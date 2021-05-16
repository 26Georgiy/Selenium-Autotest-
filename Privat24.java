import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Privat24 {

    //Описываем UI элементы




    //Действия с UI элементами
    @Test
   public void testP2P(){
        //Здесь указываем расположение драйвера для определенного браузера

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://next.privat24.ua/money-transfer/card");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        By cardFrom = By.xpath("//input[@data-qa-node='numberdebitSource']");
        driver.findElement(cardFrom).sendKeys("4567739561253907");
By expDate = By.xpath("//input[@data-qa-node='expiredebitSource']");
        driver.findElement(expDate).sendKeys("09/24");
        //////
        By cvvFrom = By.xpath("//input[@data-qa-node='cvvdebitSource']");
        driver.findElement(cvvFrom).sendKeys("528");
        By firstName = By.xpath("//input[@data-qa-node='firstNamedebitSource']");
        driver.findElement(firstName).sendKeys("Denis");
        By lastName = By.xpath("//input[@data-qa-node='lastNamedebitSource']");
        driver.findElement(lastName).sendKeys("Chernikov");

        By receiver = By.xpath("//input[@data-qa-node='numberreceiver']");
        driver.findElement(receiver).sendKeys("4552331488138217");
        By amount = By.xpath("//input[@data-qa-node='amount']");
        driver.findElement(amount).sendKeys("10");
       By submit = By.xpath("//button[contains(text(),'Переказати')]");
       driver.findElement(submit).click();






    }


}
