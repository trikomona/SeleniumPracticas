import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class InteractWithElements {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();  //Se debe abrir un navagador
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");  //obtener página solicitada
        driver.manage().window().maximize();   // comando para maximizar


        //ejemplo de click
        //localización de elementos

        WebElement showBtn = driver.findElement(By.id("show-textbox"));
        WebElement hideBtn = driver.findElement(By.xpath("//input[@id='hide-textbox']"));

        //click de elementos
        showBtn.click();
        hideBtn.click();

        Thread.sleep(3000);    // pequeña pausa con fines academicos

        //click de nuevo
        showBtn.click();
        hideBtn.click();

        //Ejemplo de send keys

        //1 buscar elemento
        WebElement countryTxtbox = driver.findElement(By.id("autocomplete"));
        //2 escribir usando sendkeys
        countryTxtbox.sendKeys("Mexico");

        //ingresa tu nombre
        Thread.sleep(2000); //con fines academicos
        WebElement enterName = driver.findElement(By.xpath("//input[@name=\"enter-name\"]"));
        enterName.sendKeys("Tania");  //nota, tambien se le pueden enviar variables previamente declaradas

        Thread.sleep(2000); //con fines academicos

        // borrar los text box
        countryTxtbox.clear(); //borrar lo que se escribio previamente
        enterName.clear();

        //comandos GET
        //getTitle()
//        System.out.println(driver.getTitle());  //traer el titulo en consola
//        System.out.println(driver.getCurrentUrl());//traer el url de la página
//
//        //traernos el texto del siguient elemento
//
//        //encontrat el elemento
//        WebElement radioBtn = driver.findElement(By.xpath("//legend[text()='Radio Button Example']"));
//        WebElement suggestionBtn = driver.findElement(By.xpath("//legend[text()='Suggession Class Example']"));
//
//
//        //imprimir en consola
//
//        System.out.println(radioBtn.getText());
//        System.out.println(suggestionBtn.getText());
//
//        //comandos condicionaes
//        WebElement hideshowTxtbx = driver.findElement(By.xpath("//input[@id='displayed-text']"));
//        System.out.println("El estatus del textbox isDisplayes es " + hideshowTxtbx.isDisplayed());
//        showBtn.click();
//        System.out.println("ahora el estatus del textbox isDisplayed es " + hideshowTxtbx.isDisplayed());
//        Thread.sleep(2000);
//
//        //buscar radio button
//        WebElement radioBtn1 = driver.findElement(By.xpath("//input[@value='radio1']"));
//
//        //Verificar si esta seleccionad e imprimir el status
//        System.out.println("El estatus del radio botton 1 isDisplayes es " + radioBtn1.isSelected()); //false
//
//        //dar clic en el raddio button
//        radioBtn1.click();
//        System.out.println("ahora el estatus del radio botton 1 isDisplayed es " + radioBtn1.isSelected()); //true
//
//            Thread.sleep(2000);
//
//        //buscar check box 2
//        WebElement checkBox = driver.findElement(By.xpath("//input[@id='checkBoxOption2']"));
//
//        //Verificar si esta seleccionad e imprimir el status
//        System.out.println("El estatus del checkbox 2 isDisplayed es " + checkBox.isSelected()); //false
//
//        //clck para checkbox
//        checkBox.click();
//        System.out.println("ahora el estatus del checkbox 2 isDisplayed es " + checkBox.isSelected()); //true
//
//        //seleccionar el siguiente botóin y validar que este este deshabilitado
//
//
//
//        //encontrar elemento
//        WebElement radioBtn2 = driver.findElement(By.xpath("//input[@value='radio2']"));
//
//        //verificar si esta seleccionado e imprimir status
//        System.out.println("El estatus del radiobutton 2 isDisplayes es " + radioBtn2.isSelected()); //false
//
//        //dar clic en el raddio button 2
//        radioBtn2.click();
//        System.out.println("ahora el estatus del radio botton 2 isDisplayed es " + radioBtn2.isSelected()); //true
//
//        //validar en estado del radio button 1 en conjunto al seleccionar el 2
//
//        System.out.println("ahora el estatus del radio botton 1 isDisplayed es " + radioBtn1.isSelected()); //false
//
//        //dar click en el check box 3 y validar que esten seleccionados checkbox 2 y 3
//
//        //encontrat elemento
//        WebElement checkBox3 = driver.findElement(By.xpath("//input[@id='checkBoxOption3']"));
//
//        //verificar si esta seleccionado e imprimir status
//        System.out.println("El estatus del checkbox3 isDisplayes es " + checkBox3.isSelected()); //false
//
//
//        //dar clic en el checkBox 3
//        checkBox3.click();
//        System.out.println("ahora el estatus del checkBox3 isDisplayed es " + checkBox3.isSelected()); //true
//
//        //validar en estado del checkBox2 y que esten seleccionados 2 y 3
//
//        System.out.println("ahora el estatus del checkBox 2 isDisplayed es " + checkBox.isSelected()); //true
//

        //Manejo de alertas

        //encontrar el boton de alerta
        WebElement btnAlerta =driver.findElement(By.xpath("//input[@id='alertbtn']"));

        //Dar clic al boton de alerta
        btnAlerta.click();
        driver.switchTo().alert().accept(); //Dar clic para quitar la alerta

        Thread.sleep(2000);


        //buscar el boton confirm
        WebElement btnConfirm =driver.findElement(By.xpath("//input[@id='confirmbtn']"));

        //click boton confirm
        btnConfirm.click();

        //Aceptar alerta
        driver.switchTo().alert().accept(); //Dar clic para quitar la alerta

        //volver a hacer clic en confirm
        btnConfirm.click();

        //Declinar alerta
        driver.switchTo().alert().dismiss(); //Dar clic para quitar la alerta

        //Manejo de dropdown

//        //buscar el elemento de dropdown
//        WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
//
//        //hacer una instancia de select
//        Select select = new Select(dropdown);
//
//        //seleccionmos el valor que queremos. hay 3 formas:
//        //por index
//        select.selectByIndex(0);
//        Thread.sleep(2000);  //para ver
//        //por valor
//        select.selectByValue("option3");
//        Thread.sleep(2000);  //para ver
//        //por texto visible
//        select.selectByVisibleText("Option2");

//        Thread.sleep(2000);  //para ver

//        //uso de la clase accion mouse
//        WebElement mousehoverBtn = driver.findElement(By.id("mousehover"));
//        //hacer instancia
//        Actions actions = new Actions(driver);
//        //primero se muevan al elemento "iFrame Example"
//        WebElement iframeLbl = driver.findElement(By.xpath("//legend[text()='iFrame Example']"));
//        actions.moveToElement(iframeLbl).perform();
//        // hacer el hover
//        actions.moveToElement(mousehoverBtn).contextClick(mousehoverBtn).build().perform();
//        //actions.contextClick(mousehoverBtn).perform();
//        Thread.sleep(5000);

        //uso del findElements

        List<WebElement> encabezados = driver.findElements(By.xpath("//table[@name='courses']//th"));
        //for para recorrer cada uno de los encabezados
        for (int i=0; i<encabezados.size(); i++){
            System.out.println(encabezados.get(i).getText());
        }//for

        //foreach  este for trae el mismo resultado
        for (WebElement encabezado:encabezados){
            System.out.println(encabezado.getText());
        }//foreach




        Thread.sleep(2000);  //esperarse 5 segundos para ver lo que esta pasando
        driver.quit();  // va a cerrar todas las ventanas abiertas


    }//metodo main{

}//clase InteractWithElements
