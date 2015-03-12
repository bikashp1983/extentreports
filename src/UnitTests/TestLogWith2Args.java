package UnitTests;
import com.relevantcodes.extentreports.*;

public class TestLogWith2Args {
	static final ExtentReports extent = ExtentReports.get(TestLogWith2Args.class);
	
	public void test() {
		extent.log(LogStatus.INFO, "This step shows usage of log(logStatus, details)");
		extent.log(LogStatus.PASS, "Notice the StepName column missing for this test.");
		extent.log(LogStatus.FAIL, "This type of log provides details without specifying the stepName.");
	}
}