package class03;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("The test case has passed successfully "+result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("The test has failed successfully: "+result.getName());
    }
}
