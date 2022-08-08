import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class MainCode {

    // Инициализируем Webdriver при помощи метода public Static, для автоматического использования в других классах
    public static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver2", "chromedriver.exe");

        // Переход на начальную страницу
        driver.get("https://dex-trade.com/");
        Thread.sleep(1500);
        // Развертывание страницы на весь экран
        driver.manage().window().maximize();

        Thread.sleep(1500);
        // Находим и нажимаем кнопку Login
        WebElement signinButton = driver.findElement(By.xpath
                ("//*[@id=\"__layout\"]/div/div[1]/div[1]/div/div/div[2]/div/div[2]/a[2]"));
        signinButton.click();

        CrAccInput crac = new CrAccInput();
        crac.CrAccount("yanautomtest@gmail.com", "Vinnitsa-2022");

        EmailConfirm imConf = new EmailConfirm();

        //imConf.confirmation();

    }
}