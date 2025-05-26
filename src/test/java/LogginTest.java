import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogginTest {
    public static void main(String[] args) throws InterruptedException {

        //abrir chrome
        WebDriver  driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");  //obtener página solicitada

        //agregar los elementos que se necesitan
        WebElement usernameTxtBox =driver.findElement(By.xpath("//input[@placeholder='Username']"));
        WebElement passwordTxtBox =driver.findElement(By.xpath("//input[@type='password']"));
        WebElement signBtn =driver.findElement(By.xpath("//button[text()='Sign In']"));

        //enviar texto a elemento usuario

        usernameTxtBox.sendKeys("tania@gmail.com");
        Thread.sleep(2000);
        passwordTxtBox.sendKeys("rahulshettyacademy");
        Thread.sleep(2000);
        signBtn.click();
        Thread.sleep(3000); // se le dio este sleep para ver la impresion del h1 de la sig pagina

        WebElement succesLogginTxt = driver.findElement(By.xpath("//h1"));
        System.out.println(succesLogginTxt.getText());  //para imprmir el texto que esta en el elemento WEB

        driver.quit();

    }//main
}//class LogginTest
