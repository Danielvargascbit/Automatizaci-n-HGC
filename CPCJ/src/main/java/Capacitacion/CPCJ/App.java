package Capacitacion.CPCJ;

import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;
//import org.w3c.dom.Text;
//import java.util.List;
//import java.util.Random;
//import java.util.concurrent.ThreadLocalRandom;
//import com.google.common.base.Function;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
//import javax.xml.xpath.XPath;
import org.openqa.selenium.By;
import java.awt.Robot;
//import java.awt.AWTException;
//import java.awt.event.KeyEvent;
import java.awt.event.KeyEvent;

public class App<webElement>  {

	WebDriver driver;
	String url="";   
	JavascriptExecutor js;
   

	public App(String url) {
	this.url=url;
	driverSet();
}

	public void driverSet() {
	System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
	
}
	
	
	/**
	 * @throws InterruptedException
	 */
	public void CrearREP() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("http://172.16.9.103:8080/xm-hgc/#!/login");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"usuario\"]")).sendKeys("ESBAPP2");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Redhat2019");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"frmLogin\"]/div[4]/button/b")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/header/div/div/ul/li[1]/form/div/div[5]/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/ul/li[1]/form/div/div[5]/ul/li[2]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div[1]/div/div/div[2]/div[2]/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"codigo\"]")).sendKeys("F03122019");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"nombre\"]")).sendKeys("Prueba_Automatizada");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"tipoRepositorioConexion\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"tipoRepositorioConexion\"]/option[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"urlConexion\"]")).sendKeys("QQQQ");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"usuario\"]")).sendKeys("ESBAPP");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"jndiName\"]")).sendKeys("EEEEE");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"maxPoolSize\"]")).sendKeys("9");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"timeOutQueryValidation\"]")).sendKeys("15");
		driver.findElement(By.xpath("//*[@id=\"timeOutQueryValidation\"]")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"driverClass\"]/option[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"clave\"]")).sendKeys("26592");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"initPoolSize\"]")).sendKeys("299");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"queryValidation\"]")).sendKeys("SELECT * FROM");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"autoCommit\"]/option[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"propertiesConnection\"]")).sendKeys("PROPIEDADES CONEXION ");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div/div/div[3]/div/button[1]")).click();
	}	
	public void editar() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div[1]/div/div/div[2]/div[3]/div/table/tbody/tr[8]/td[7]/div/a[1]")).click();
		//Parametros a editar
		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div/div/div[3]/div/button[1]")).click();
		}
	public void eliminar() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div[1]/div/div/div[2]/div[3]/div/table/tbody/tr[8]/td[7]/div/a[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"modalEliminarRepositorioConexion\"]/div/div/div[3]/button[1]")).click();
	}
		
	public static void main( String[] args )throws Exception{
   	App negro =new App("");
   	negro.CrearREP();
   	//negro.editar();
   //	negro.eliminar();
   	
   	
   }
} 