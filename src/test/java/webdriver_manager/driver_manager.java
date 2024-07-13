package webdriver_manager;

import com.lao.constants.constants;
import com.lao.step_definitions.Login;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class driver_manager {

    private static WebDriver driver= null;
    private static Logger logger = LogManager.getLogger(Login.class);

    public static void launch_browser() {
try{
            switch(constants.browser) {
                case "chrome":
//                    System.setProperty("webdriver.chrome.driver","C:\\Users\\SEDHU\\eclipse-workspace\\newbrowser\\drivers\\chromedriver.exe");
//                    ChromeOptions options = new ChromeOptions();
//                    options.setBinary("C:\\Users\\SEDHU\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
//                    driver = new ChromeDriver(options);
//                    ChromeOptions op = new ChromeOptions();
//                    op.setBrowserVersion("122");
//                     WebDriverManager.chromedriver().clearDriverCache().setup();
                    driver= new ChromeDriver();
                    logger.info("launching" + constants.browser);
                    break;
                case "firefox":
                    //WebDriverManager.firefoxdriver().setup();
                    logger.info("launching" + constants.browser);
                    break;
                default:
                    //WebDriverManager.chromedriver().setup();
                    //driver = WebDriverManager.chromedriver().create();
                    logger.info("launching" + constants.browser);
                    break;
            }
            }catch (Exception e){e.getMessage();
}
    }
        public static WebDriver getDriver() {
            return driver;
        }

    }
    //we can launch browsers using three different ways
//1.downloading the same chromedriver path from online and launching
//2.using webdrivermanager
//3.seleniummanager( if you want separate chrome you can specify that)( if the specified version is in your local directorythen it will
//launch that or else download from net)
//if you have 117 google chrome in your directory but if you want to use 117 cft you need to use options.setbinary in code


