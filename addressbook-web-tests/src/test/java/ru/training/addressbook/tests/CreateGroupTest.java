package ru.training.addressbook.tests;

import org.testng.annotations.*;
import ru.training.addressbook.model.GroupFormParameters;


public class CreateGroupTest extends TestBase {

  // Creation new group
  @Test
  public void testCreateGroup() throws Exception {
    app.openGroupPage();
    app.pressButtonNewGroup();
    app.fillGroupForm(new GroupFormParameters("TestName", "TestHeader", "TestFooter"));
    app.submitCreationGroup();
    app.returnToGroupPage();
  }

}

