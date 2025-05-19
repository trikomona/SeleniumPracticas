package ejerciciosSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class EjercicioLocalizacionDeElementos {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();  //Se debe abrir un navagador
        driver.get("https://www.google.com/");  //obtener la página solicitada
        driver.close(); // Cierra solo la pestaña actual del navegador
        driver = new ChromeDriver(); // Abrimos otra vez el navegador
        driver.get("https://rahulshettyacademy.com/AutomationPractice/"); // Abrimos otra página diferente

        //Encontrar elementos

        //buscar por id

        WebElement openWindowButton = driver.findElement(By.id("openwindow"));   //buscame este elemento que tenga el id name
        WebElement openTabButton = driver.findElement(By.id("opentab"));
        WebElement nameInput = driver.findElement(By.id("name"));
        WebElement alertButton = driver.findElement(By.id("alertbtn"));
        WebElement confirmButton= driver.findElement(By.id("confirmbtn"));
        WebElement hideInput = driver.findElement(By.id("hide-textbox"));
        WebElement showButton = driver.findElement(By.id("show-textbox"));
        WebElement displayedButton= driver.findElement(By.id("displayed-text"));

        //Encuentra por name los siguientes elementos

        WebElement nameInput2 = driver.findElement(By.name("enter-name")); //buscame este elemento por name
        WebElement showInput= driver.findElement(By.name("show-hide"));

        //Encuentra por className los siguientes elementos:
        WebElement radioButton1 = driver.findElement(By.className("radioButton"));

        //Encuentra por Link Text o Par]al Link Text los siguientes elementos
        WebElement greenLink = driver.findElement(By.linkText("QA Meetup with Rahul Shetty @Pune - Limited Seats! Book Now!"));
        WebElement endlink = driver.findElement(By.className("REST API"));
        WebElement endlink2 = driver.findElement(By.className("Broken Link"));


    }//main
}//clase EjercicioLocalizacionDeElementos
