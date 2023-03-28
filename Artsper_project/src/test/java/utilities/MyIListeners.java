package utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyIListeners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test case started: " + result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case passed: " + result.getMethod().getMethodName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case failed: " + result.getMethod().getMethodName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case skipped: " + result.getMethod().getMethodName());

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("onTestFailedButWithinSuccessPercentage");

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("onTestFailedWithTimeout");

	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test suite started: ");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test suite finished: ");
	}
}
