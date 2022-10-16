package FirstTask;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class FirstTask {

    //V1
    WebDriver driver;
    protected WebElement getWebElClickable(String xpath) {
        driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.ignoring(StaleElementReferenceException.class).until(
                ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(By.xpath(xpath))));
    }

    //V2
    public void catchMethod(Integer t){
        try {
            throw new StaleElementReferenceException("бан");
        }
        catch (StaleElementReferenceException e){
           e.printStackTrace();
        }
    }

    //V3
    public void throwsMethod(Integer t) throws StaleElementReferenceException{
        if (t == null) {
            throw new StaleElementReferenceException("бан");
        }
    }



}

