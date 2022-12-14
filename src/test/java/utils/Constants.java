package utils;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class Constants {
    public static final String CONFIGURATION_FILEPATH =
            System.getProperty ( "user.dir" ) + "/src/test/resources/config/config.properties";
    public static final int EXPLICIT_WAIT = 20;
    public static final int IMPLICIT_WAIT = 20;
    public static final String TESTDATA_FILEPATH =
            System.getProperty("user.dir") + "/src/test/resources/testdata/batch14excel.xlsx";

    public static final String SCREENSHOT_FILEPATH =   System.getProperty("user.dir") + "/screenshots/";
}
