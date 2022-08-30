package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot
{ 
	public static void takeScreenShot(WebDriver driver, String screnshotname) throws IOException 
	{
		TakesScreenshot sc = ((TakesScreenshot)driver);//upcast driver to TakesScreenshot
		File Source = sc.getScreenshotAs(OutputType.FILE);
		File destination = new File("D:\\Eclipse-workplace\\kiteZerodha\\Screenshots\\"+screnshotname+".jpg");
		FileHandler.copy(Source, destination);		
     }	
}
