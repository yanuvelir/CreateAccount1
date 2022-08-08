import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class EmailConfirm {

    WebDriver driver2 = MainCode.driver;

   // WebElement confCode = driver2.findElement(By.xpath
           // ("///*[@id=\"__layout\"]/div/div[2]/div/div/div/div[2]/div/label/div/input[1]"));

    public void confirmation(String fromImail)
    {
        driver.get("https://mail.google.com");

        Thread.sleep(1500);

        // Развертывание страницы на весь экран
        driver.manage().window().maximize();

        //Ввод Email
        WebElement inpEmail = driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
        inpEmail.sendKeys("yanautomtest@gmail.com");
        //yanautomtest@gmail.com

        Thread.sleep(1500);
        //Нажатие кнопки "Next"
        WebElement btnNextEmail = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span"));
        btnNextEmail.click();

        Thread.sleep(1500);
        //Ввод пароля
        WebElement inpPass = driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
        inpPass.sendKeys("Vinnitsa2011");

        //Нажатие кнопки "Next"
        WebElement btnNextPass = driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button"));
        btnNextPass.click();

        Thread.sleep(1500);
        //Открытие письма с кодом доступу
        WebElement emailOpen = driver.findElement(By.id(":24"));
        emailOpen.click();

        Thread.sleep(1500);
        //Считывание кода
        WebElement verCode = driver.findElement(By.xpath
                ("//*[@id=\":6d\"]/div[1]/table/tbody/tr[2]/td/div/table/tbody/tr/td/p/code"));
        CopyedText = verCode.getText() ;

        System.out.println(CopyedText);



    }


}
