package reporting;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting {

	public static void jvmReport(String jsonFile) {
		
		// 1.path of the Report to be stored
		File reportDirectory = new File("E:\\Eclipse\\Cucumber\\src\\test\\resources\\Reports");

		// 2.Create object for "Configuration(Class)" and add "Configurations(Method)"
		Configuration configuration = new Configuration(reportDirectory, "Adactin Automation With Customized Report");
		configuration.addClassifications("Operating System", "Windows");
		configuration.addClassifications("Browser", "Chrome");
		configuration.addClassifications("Version", "95");
		configuration.addClassifications("Sprint", "24");

		// 4. Create List and Pass jsonFiles configurations object
		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(jsonFile);

		// 5.Create object for "ReportBuilder(Class)" and generate report using "generateReports(Method)"
		ReportBuilder builder = new ReportBuilder(jsonFiles, configuration);
		builder.generateReports();

	}
}
