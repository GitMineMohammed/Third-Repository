package baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass_Cucumber {

	public static WebDriver driver; // --> Here the Value of WebDriver is "null"
	// ------------------------------------------------------------------------------------------------------------------------------

	public static void chromeLaunch(String url) { // 1
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bismillah\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	// ------------------------------------------------------------------------------------------------------------------------------
	public static void firefoxLaunch(String url) { // 2
		System.setProperty("webdriver.gecko.driver", "E:\\Eclipse\\Selenium_Tasks\\Driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	// ------------------------------------------------------------------------------------------------------------------------------
	public static void ieLaunch(String url) {// 3
		System.setProperty("webdriver.ie.driver", "E:\\Eclipse\\Selenium_Tasks\\Driver\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	// ------------------------------------------------------------------------------------------------------------------------------
	public static void chromeNavigateTo(String url) {// 4
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bismillah\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
	}

	// ------------------------------------------------------------------------------------------------------------------------------
	public static void firefoxNavigateTo(String url) {// 5
		System.setProperty("webdriver.gecko.driver", "E:\\Eclipse\\Selenium_Tasks\\Driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
	}

	// ------------------------------------------------------------------------------------------------------------------------------
	public static void ieNavigateTo(String url) {// 6
		System.setProperty("webdriver.ie.driver", "E:\\Eclipse\\Selenium_Tasks\\Driver\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
	}

	// ------------------------------------------------------------------------------------------------------------------------------
	public static void navigateBack() {// 7
		driver.navigate().back();
	}

	// ------------------------------------------------------------------------------------------------------------------------------
	public static void navigateForward() {// 8
		driver.navigate().back();
	}

	// ------------------------------------------------------------------------------------------------------------------------------
	public static void navigateRefresh() {// 9
		driver.navigate().refresh();
	}

	// -------------------------------------------------------------------------------------------------------------------------------
	public static WebElement locatorBy(String type, String text) {// 10

		if (type.equals("id")) {
			WebElement findElement = driver.findElement(By.id(text));
			return findElement;
		}

		else if (type.equals("name")) {
			WebElement findElement = driver.findElement(By.name(text));
			return findElement;
		}

		else if (type.equals("class")) {
			WebElement findElement = driver.findElement(By.className(text));
			return findElement;
		}

		else {
			WebElement findElement = driver.findElement(By.xpath(text));
			return findElement;
		}
	}

	// -------------------------------------------------------------------------------------------------------------------------------
	public static void sendKeys(WebElement element, String text) {// 11
		element.sendKeys(text);
	}

	// ------------------------------------------------------------------------------------------------------------------------------
	public static void buttonClick(WebElement element) throws InterruptedException {// 12
		Thread.sleep(500);
		element.click();
	}

	// ------------------------------------------------------------------------------------------------------------------------------
	public static void MoveToElement(String xpath) {// 13
		WebElement link = driver.findElement(By.xpath(xpath));
		Actions actions = new Actions(driver);
		actions.moveToElement(link).perform();
	}

	// ------------------------------------------------------------------------------------------------------------------------------
	public static void DragandDrop(String xpath1, String xpath2) {// 14
		WebElement drag = driver.findElement(By.xpath(xpath1));
		WebElement drop = driver.findElement(By.xpath(xpath2));
		Actions actions = new Actions(driver);
		actions.dragAndDrop(drag, drop).perform();
	}

	// ------------------------------------------------------------------------------------------------------------------------------
	public static void DoubleClick(String xpath) {// 15
		WebElement link = driver.findElement(By.xpath(xpath));
		Actions actions = new Actions(driver);
		actions.doubleClick(link).perform();
	}

	// ------------------------------------------------------------------------------------------------------------------------------
	public static void RightClick(String xpath) {// 16
		WebElement link = driver.findElement(By.xpath(xpath));
		Actions actions = new Actions(driver);
		actions.contextClick(link).perform();
	}

	// ------------------------------------------------------------------------------------------------------------------------------
	public static void selectByIndex(WebElement element, int index) {// 17
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	// ------------------------------------------------------------------------------------------------------------------------------
	public static void selectByValue(WebElement element, String text) {// 18
		Select select = new Select(element);
		select.selectByValue(text);
	}

	// ------------------------------------------------------------------------------------------------------------------------------
	public static void selectByVisibleText(WebElement element, String text) {// 19
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	// ------------------------------------------------------------------------------------------------------------------------------

	public static void getAllSelectedOptions(WebElement element) {// 20
		Select select = new Select(element);
		select.getAllSelectedOptions();
	} // -->
		// ------------------------------------------------------------------------------------------------------------------------------

	public static void getFirstSelectedOption(WebElement element) {// 21
		Select select = new Select(element);
		select.getFirstSelectedOption();
	} // -->
		// ------------------------------------------------------------------------------------------------------------------------------

	public static void getTextByIndex(WebElement element, int index) {// 22
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		WebElement option = options.get(index);
		String text = option.getText();
	}

	// ------------------------------------------------------------------------------------------------------------------------------
	public static void isMultiple(WebElement element) {// 23
		Select select = new Select(element);
		select.isMultiple();
	} // -->
		// ------------------------------------------------------------------------------------------------------------------------------

	public static void deselectByIndex(WebElement element, int index) {// 24
		Select select = new Select(element);
		select.deselectByIndex(index);
	}

	// ------------------------------------------------------------------------------------------------------------------------------
	public static void deselectByValue(WebElement element, String text) {// 25
		Select select = new Select(element);
		select.deselectByValue(text);
	}

	// ------------------------------------------------------------------------------------------------------------------------------
	public static void deselectByVisibleText(WebElement element, String text) {// 26
		Select select = new Select(element);
		select.deselectByVisibleText(text);
	}

	// ------------------------------------------------------------------------------------------------------------------------------
	public static void deselectAll(WebElement element) {// 27
		Select select = new Select(element);
		select.deselectAll();
	}

	// ------------------------------------------------------------------------------------------------------------------------------

	public static void frames(String type, String text) {// 28

		if (type.equals("id")) {
			driver.switchTo().frame("id");
		}

		else if (type.equals("name")) {
			driver.switchTo().frame("name");
		}

		else {
			driver.switchTo().frame("className");
		}
	}

	// ------------------------------------------------------------------------------------------------------------------------------
	public static WebElement windowsHandling(WebElement type, String child1, String child2) {// 29

		// To Find ParentWindowId :
		String parentWindowId = driver.getWindowHandle();
		System.out.println("Parent Id :" + parentWindowId);

		// To Find AllWindowsId :
		Set<String> allWindowsId = driver.getWindowHandles();
		System.out.println("Parent Id + Child Id :" + allWindowsId);

		// To Find ChildWindowId : (Iterate allWindowsId -> SET -> Using ForEach)
		for (String eachWindowId : allWindowsId) {
			if (!parentWindowId.equals(eachWindowId))
				driver.switchTo().window(eachWindowId);
		} // eachWindowId = childWindowId

		if (type.equals("id")) {
			WebElement findElement = driver.findElement(By.id(child1));
			findElement.click();
			return findElement;
		}

		else if (type.equals("name")) {
			WebElement findElement = driver.findElement(By.name(child1));
			findElement.click();
			return findElement;
		}

		else if (type.equals("className")) {
			WebElement findElement = driver.findElement(By.className(child1));
			findElement.click();
			return findElement;
		}

		else {
			WebElement findElement = driver.findElement(By.xpath(child1));
			findElement.click();
			return findElement;
		}

		// driver.switchTo().window(parentWindowId);

		// WebElement lnkSearch2 = driver.findElement(By.xpath(child2));
		// lnkSearch2.click();

		// Set<String> chlldWindow2 = driver.getWindowHandles();
		// {
		// System.out.println("Child Id 2 :" + chlldWindow2);
		// }
	}

	// ------------------------------------------------------------------------------------------------------------------------------
	public static void WebTableToConsole() {// 30

		WebElement tableEntry = driver.findElement(By.tagName("table"));
		WebElement heading = tableEntry.findElement(By.tagName("thead"));
		WebElement headingRow = heading.findElement(By.tagName("tr"));
		List<WebElement> headings = headingRow.findElements(By.tagName("th"));

		for (int i = 0; i < headings.size(); i++) {
			WebElement headingElements = headings.get(i);
			String text = headingElements.getText();
			System.out.print(text + "   " + "\t");
		}

		WebElement content = tableEntry.findElement(By.tagName("tbody"));
		List<WebElement> multipleRows = content.findElements(By.tagName("tr"));

		for (int i = 0; i < multipleRows.size(); i++) {
			WebElement individualRow = multipleRows.get(i);

			List<WebElement> individualElements = individualRow.findElements(By.tagName("td"));

			for (int j = 0; j < individualElements.size(); j++) {
				WebElement element = individualElements.get(j);
				String text = element.getText();
				System.out.print(text + "\t");
			}
		}
	}

	// ------------------------------------------------------------------------------------------------------------------------------
	public static void readWriteSameExcel(String path,String fileName, String readSheet,String writeSheet) throws Throwable {// 31

		File file = new File(path+"\\"+fileName+".xlsx");
		FileInputStream input = new FileInputStream(file);
		Workbook w = new XSSFWorkbook(input);
		Sheet sheetRead = w.getSheet(readSheet);
		Sheet sheetCreate = w.createSheet(writeSheet);

		for (int i = 0; i < sheetRead.getPhysicalNumberOfRows(); i++) {
			Row row = sheetRead.getRow(i);
			Row createRow = sheetCreate.createRow(i);

			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell getCell = row.getCell(j);
				Cell createCell = createRow.createCell(j);
				int cellType = getCell.getCellType();

				if (cellType == 1) {
					String stringCellValue = getCell.getStringCellValue();
					createCell.setCellValue(stringCellValue);
				}

				else if (DateUtil.isCellDateFormatted(getCell)) {
					Date dateCellValue = getCell.getDateCellValue();
					SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
					dateFormat.format(dateCellValue);
					createCell.setCellValue(dateCellValue);
				}

				else {
					double numericCellValue = getCell.getNumericCellValue();

					long l = (long) numericCellValue;
					createCell.setCellValue(l);
				}
			}
		}

		FileOutputStream output = new FileOutputStream(file);
		w.write(output);
		System.out.println("Excel has been Read and Written Successfully");
		System.out.println("Written File Available in below Path" + "\n" + file);
	}

	// ------------------------------------------------------------------------------------------------------------------------------
	public static void readWriteDifferentExcel(String readPath,String readFile, String readSheet,
			String writePath,String writeFile, String writeSheet) throws IOException {// 32

		File fileRead = new File(readPath+"\\"+readFile+".xlsx");
		FileInputStream input = new FileInputStream(fileRead);
		Workbook readWorkbook = new XSSFWorkbook(input);
		Sheet sheetRead = readWorkbook.getSheet(readSheet);

		File fileWrite = new File(writePath+"\\"+writeFile+".xlsx");
		FileOutputStream output = new FileOutputStream(fileWrite);
		Workbook writeWorkbook = new XSSFWorkbook();
		Sheet sheetWrite = writeWorkbook.createSheet(writeSheet);

		for (int i = 0; i < sheetRead.getPhysicalNumberOfRows(); i++) {
			Row row = sheetRead.getRow(i);
			Row createRow = sheetWrite.createRow(i);

			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell getCell = row.getCell(j);
				Cell createCell = createRow.createCell(j);
				int cellType = getCell.getCellType();

				if (cellType == 1) {
					String stringCellValue = getCell.getStringCellValue();
					createCell.setCellValue(stringCellValue);
				}

				else if (DateUtil.isCellDateFormatted(getCell)) {
					Date dateCellValue = getCell.getDateCellValue();
					SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
					dateFormat.format(dateCellValue);
					createCell.setCellValue(dateCellValue);
				}

				else {
					double numericCellValue = getCell.getNumericCellValue();

					long l = (long) numericCellValue;
					createCell.setCellValue(l);
				}
			}
		}

		writeWorkbook.write(output);

		System.out.println("Excel has been Read and Written Successfully");
		System.out.println("Written File Available in below Path" + "\n" + fileWrite);
	}

	// ------------------------------------------------------------------------------------------------------------------------------
	public static String readExcelToWebPage(String readPath,String readFile, String readSheet, int rowNum, int cellNum) throws IOException {// 33

		File file = new File(readPath+"\\"+readFile+".xlsx");
		FileInputStream input = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(input);
		Sheet sheetRead = workbook.getSheet(readSheet);
		Row row = sheetRead.getRow(rowNum);
		Cell cell = row.getCell(cellNum);
		int cellType = cell.getCellType();

		if (cellType == 1) {
			String stringCellValue = cell.getStringCellValue();
			return stringCellValue;
		}

		else if (DateUtil.isCellDateFormatted(cell)) {
			Date dateCellValue = cell.getDateCellValue();
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			String format = dateFormat.format(dateCellValue);
			return format;
		}

		else {
			double numericCellValue = cell.getNumericCellValue();
			long l = (long) numericCellValue;
			String valueOf = String.valueOf(l);
			return valueOf;
		}
	}
	
	// ------------------------------------------------------------------------------------------------------------------------------
	public void enterText(WebElement element, String text) {// 34
		element.sendKeys(text);
	}

	// ------------------------------------------------------------------------------------------------------------------------------
	public static void writeExcelFromWebPage(String path, String sheetName, int rowNum, int cellNum, String text)
			throws IOException {// 35

		File file = new File(path);
		Workbook workbook = new XSSFWorkbook();
		Sheet writeSheet = workbook.createSheet(sheetName);
		Row row = writeSheet.createRow(rowNum);
		Cell cell = row.createCell(cellNum);
		cell.setCellValue(text);

		FileOutputStream output = new FileOutputStream(file);
		workbook.write(output);

	}

	// ------------------------------------------------------------------------------------------------------------------------------
	public static String getAttribute(WebElement element) {// 36

		String attribute = element.getAttribute("value");
		return attribute;

	}
	// ------------------------------------------------------------------------------------------------------------------------------
	public static String title() {// 38
		String title = driver.getTitle();
		return title;
	}

	// ------------------------------------------------------------------------------------------------------------------------------
	public static void getOptions(WebElement element) {// 39
		Select select = new Select(element);
		select.getOptions();
	} // --> get/print the Count of Total DropDown Options
	// ------------------------------------------------------------------------------------------------------------------------------

	public static void screenshot(String url) throws Throwable { // 40

		System.setProperty("webdriver.chrome.driver", "E:\\Eclipse\\Selenium_Tasks\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

		TakesScreenshot screenshot = (TakesScreenshot) driver;

		// temp File location (Actual Screenshot will be saved here by default)
		File source = screenshot.getScreenshotAs(OutputType.FILE);

		// Desired Location to save file
		String FileName = ("Test File.jpeg");
		File destination = new File("C:\\Users\\Bismillah\\Desktop\\Desktop Screenshots\\" + FileName);

		FileUtils.copyFile(source, destination);
	}

	// ------------------------------------------------------------------------------------------------------------------------------

}