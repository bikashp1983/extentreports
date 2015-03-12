package UnitTests;
import com.relevantcodes.extentreports.*;

public class TestLogWith3Args {
	static final ExtentReports extent = ExtentReports.get(TestLogWith3Args.class);
	
	public void test() {
		extent.log(LogStatus.INFO, "Step 1", "Usage: log(logStatus, stepName, details)");
        extent.log(LogStatus.PASS, "Step 3", "Provide details along with the stepName.");
        extent.log(LogStatus.WARNING, "Warning!", "This step shows a warning");
	}
}
