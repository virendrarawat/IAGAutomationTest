package drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class DriverFactory {

    //private static final String USERNAME = System.getenv("BROWSERSTACK_USERNAME");
    //private static final String AUTOMATE_KEY = System.getenv("BROWSERSTACK_ACCESS_KEY");
    //private static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

    /*
    public static final String USERNAME = "virendrasinghraw1";
    public static final String AUTOMATE_KEY = "XNsKoKVumE3LUzyFEF7s";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
    */

    //private static WebDriver driver;

    // Get a new WebDriver Instance.
    // There are various implementations for this depending on browser. The required browser can be set as an environment variable.
    // Refer http://getgauge.io/documentation/user/current/managing_environments/README.html
    public static WebDriver getDriver() {

        //return driver;

        String browser = System.getenv("BROWSER");
        System.out.println("Browser in default property is = " +browser);

        if (browser == null) {
            //return new FirefoxDriver();
            System.setProperty("webdriver.chrome.driver", "C://Users//srawat//Desktop//Setup//chromedriver.exe");
            return new ChromeDriver();

        }
        switch (browser)
        {
            case "IE":
                return new InternetExplorerDriver();
            case "CHROME":
                System.setProperty("webdriver.chrome.driver", "C://Users//srawat//Desktop//Setup//driver//chromedriver.exe");
                return new ChromeDriver();
            default:
                return new FirefoxDriver();
        }


    }

    /*
    @BeforeSpec
    public void setUp() {
        try {
            DesiredCapabilities caps = new DesiredCapabilities();

            // Capabilities from environment
            //caps.setCapability("browser", System.getenv("BROWSER"));
            //caps.setCapability("browser_version", System.getenv("BROWSER_VERSION"));
            //caps.setCapability("build", System.getenv("BUILD"));
            //caps.setCapability("os", System.getenv("OS"));
            //caps.setCapability("os_version", System.getenv("OS_VERSION"));
            //caps.setCapability("browserstack.selenium_version", "3.14.0");

            caps.setCapability("os", "Windows");
            caps.setCapability("os_version", "10");
            caps.setCapability("browser", "Chrome");
            caps.setCapability("browser_version", "62.0");
            caps.setCapability("browserstack.local", "true");
            caps.setCapability("browserstack.debug", "true");
            caps.setCapability("browserstack.selenium_version", "3.14.0");



            // Hardcoded capabilities
            caps.setCapability("browserstack.debug", "true");

            URL remoteURL = new URL(URL);

            driver = new RemoteWebDriver(remoteURL, caps);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        } catch (MalformedURLException e) {

            System.out.println(e.toString());

        }
    }

    @AfterSpec
    public void tearDown() {
        driver.close();
        driver.quit();
    }
*/

}
