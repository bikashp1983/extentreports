package UnitTests;
import com.relevantcodes.extentreports.*;

public class TestDriver {
	static final ExtentReports extent = ExtentReports.get("FrameworkDriver");
	
	public static void main(String[] args) {
		String strPath = "C:\\Users\\Sai Baba\\Documents\\workspace\\Extent.html";
		
		extent.init(strPath, true);
		extent.config().reportHeadline("My first report.").useExtentFooter(false).documentTitle("MyNewTitle");
	
		extent.startTest("Tests Log with 2 Args", "This test creates logs with 2 args: log(LogStatus, details).");
		new TestLogWith2Args().test();
		
		extent.startTest("Test Log with 3 Args", "This test creates logs with 3 args: log(LogStatus, stepname, details)");
		new TestLogWith3Args().test();
		
		extent.startTest("Test Log with 4 Args, Attaches Screenshot", "This test creates logs with 4 args: log(LogStatus, stepName, details, screenCapturePath)");
		new TestWithSnapshot().test();
		
		extent.startTest("Attaches Screenshot only", "This test creates logs with only snapshots using attachScreenshot(screenCapturePath)");
		new AttachesScreenshot().test();
	}
}
