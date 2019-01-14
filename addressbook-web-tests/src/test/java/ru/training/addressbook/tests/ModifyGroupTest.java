package ru.training.addressbook.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import ru.training.addressbook.model.GroupFormParameters;
import ru.training.addressbook.tests.TestBase;

public class ModifyGroupTest extends TestBase {

  //Modify group
  @Test
  public void testModifyGroup(){
    app.getNavigationHelper().openGroupPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().pressButtonEditGroup();
    app.getGroupHelper().fillGroupForm(new GroupFormParameters("NewName", "NewHeader", "NewFooter"));
    app.getGroupHelper().clickButtonUpdateGroup();
    app.getGroupHelper().returnToGroupPage();
  }

}
