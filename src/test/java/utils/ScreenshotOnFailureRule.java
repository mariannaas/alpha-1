package utils;

import org.junit.Rule;
import org.junit.rules.MethodRule;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.Statement;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import java.io.File;
import java.io.FileOutputStream;


/**
 * Created by mariannas on 11.04.15.
 */
public class ScreenshotOnFailureRule  implements MethodRule {

    @Override
    public Statement apply(final Statement base, FrameworkMethod method, Object target) {
        return new Statement() {
            @Override
            public void evaluate() throws Throwable {
                try {
                    base.evaluate();
                }
                catch (Throwable t){}

            }

            public void takeScreenshot(WebDriver driver, String fileName){
                try {
                    new File("target/surefire-reports/").mkdirs();
                    FileOutputStream out = new FileOutputStream("target/surefire-reports/screenshot-" + fileName + ".png");
                    out.write(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES));
                    out.close();
                }catch (Exception e) { }
               }
            };
        }
}

