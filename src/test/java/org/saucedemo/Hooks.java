package org.saucedemo;

import org.junit.After;
import org.junit.Before;
import org.saucedemo.Pages.BaseClass;

public class Hooks extends BaseClass {
@Before
    public void setUp(){
    startBrowser();
    //closeBrowser();
}
@After
 public void teardown(){
    closeBrowser();
 }


}
