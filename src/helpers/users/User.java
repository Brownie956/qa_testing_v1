package helpers.users;

import config.Conf;
import org.openqa.selenium.remote.RemoteWebDriver;

public abstract class User {

    private RemoteWebDriver webDriver;

    User(){
        this.webDriver = Conf.driver.getWebDriver();
    }

    RemoteWebDriver getWebDriver(){
        return this.webDriver;
    }

    public final void navigate_to(String url){
        webDriver.navigate().to(url);
    }

    public final String views_page_title(){
        return webDriver.getTitle();
    }
}
