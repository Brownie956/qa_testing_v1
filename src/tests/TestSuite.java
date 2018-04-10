package tests;

import config.Conf;
import config.Driver;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        WikiHomeTest.class
})

public class TestSuite {
    @BeforeClass
    public static void setUp(){
        Conf.driver = new Driver(Conf.BROWSER);
        Conf.driver.getWebDriver().manage().window().maximize();
        System.out.println("Start of the suite");
    }

    @AfterClass
    public static void tearDown() {
//        Conf.driver.getWebDriver().quit();
        System.out.println("End of the suite");
    }
}
