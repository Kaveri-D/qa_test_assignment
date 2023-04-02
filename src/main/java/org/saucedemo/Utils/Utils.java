package org.saucedemo.Utils;

import org.saucedemo.Pages.BaseClass;

import static java.util.concurrent.TimeUnit.SECONDS;

public class Utils extends BaseClass {
    public static void waitForPageLoad(int time) {
        driver.manage().timeouts().pageLoadTimeout(time,SECONDS);
    }


}
