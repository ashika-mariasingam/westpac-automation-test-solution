package nz.co.westpac.views;

import nz.co.westpac.controllers.BaseController;
import org.openqa.selenium.WebDriver;

public class BaseView {

    protected final WebDriver driver;
    private final BaseController baseController = new BaseController();

    public BaseView() {
        this.driver = baseController.getWebDriver();
    }
}
