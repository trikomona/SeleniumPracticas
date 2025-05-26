import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class UsingFindElements {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();  //Se debe abrir un navagador
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");  //obtener página solicitada
        driver.manage().window().maximize();   // comando para maximizar


        //uso del findElements para el radiobuttons

        //agregamos el conjuto de radio botones a una lista
        List<WebElement> radioBtns = driver.findElements(By.xpath("//div[@class='left-align']//input[@name='radioButton']"));

        for (int i = 0; i < radioBtns.size(); i++) {  //repite mientras i sea menor a el tamaño de la lista
            radioBtns.get(i).click();

            //creando for dentro de for para el stado de cada radio boton
            for( int j =0; j < radioBtns.size(); j++){
              boolean btnState=   radioBtns.get(j).isSelected();   // se usa la j dentro para revisar uno a uno su estado
                System.out.println("    Estado del radio button " + j + ": " + btnState );

            }//Segundo for

        }//for

        System.out.println("*********************************************************************************************");

        //agregamos el conjunto de checkbox a una lista
        List<WebElement> checkBoxs = driver.findElements(By.xpath("//div[@class='right-align']//input[@type='checkbox']"));

        for (int i = 0; i < checkBoxs.size(); i++) {  //repite mientras i sea menor a el tamaño de la lista
            checkBoxs.get(i).click();

            //creando for dentro de for para el stado de cada radio boton
            for( int j =0; j < checkBoxs.size(); j++){
                boolean checkState=   checkBoxs.get(j).isSelected();   // se usa la j dentro para revisar uno a uno su estado
                System.out.println("    Estado del check button " + j + ": " + checkState );

            }//Segundo for

        }//for

        driver.quit();  // va a cerrar todas las ventanas abiertas

    }//main
}//class UsingFindelements
