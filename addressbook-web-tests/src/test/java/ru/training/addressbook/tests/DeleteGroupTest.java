package ru.training.addressbook.tests;


import org.testng.annotations.Test;

public class DeleteGroupTest extends TestBase {

  @Test
  public void testDeleteGroup() throws Exception {
    app.openGroupPage();
    app.selectGroup();
    app.deleteSeletedGroups();
    app.returnToGroupPage();
  }

}
