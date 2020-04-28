	package runner;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.BeforeClass;

import com.cucumber.listener.ExtentCucumberFormatter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin = {"json:target/RunCuke/cucumber.json", "pretty", "html:target/RunCuke/cucumber","com.cucumber.listener.ExtentCucumberFormatter:target/Extent_Reports/reprt.html"},
		features = "src/test/resources/features/", 
		glue = "steps",
		//tags = {"@Used-Search-Cars"},
		monochrome = true
		)

public class RunCuke extends AbstractTestNGCucumberTests {

	@BeforeClass
	public static void setUp() {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("ddMMyyyy_hhmmss");
		Date curDate = new Date();
		String strDate = simpleDateFormat.format(curDate);
		String fileName = "C:\\Users\\Anuj Gupta\\JavaProjects\\CucumberPageObjectModel\\target\\Extent_Reports\\"+strDate+".html";
		File file = new File(fileName);
		ExtentCucumberFormatter.initiateExtentCucumberFormatter(file, false);
		ExtentCucumberFormatter.loadConfig(new File("src/test/resources/ExtentReportsConfig.xml"));
		ExtentCucumberFormatter.addSystemInfo("Browser Name", "Chrome");
		ExtentCucumberFormatter.addSystemInfo("Browser version", "v81.0.4044.113");
		ExtentCucumberFormatter.addSystemInfo("Selenium version", "v3.141.59");
	}
	
}
