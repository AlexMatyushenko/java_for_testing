package ru.training.addressbook;

import org.testng.annotations.*;


public class CreateGroupTest extends TestBase {

  // Creation new group
  @Test
  public void testCreateGroup() throws Exception {
    openGroupPage();
    pressButtonNewGroup();
    fillGroupForm(new GroupFormParameters("TestName", "TestHeader", "TestFooter"));
    submitCreationGroup();
    returnToGroupPage();
  }

}

