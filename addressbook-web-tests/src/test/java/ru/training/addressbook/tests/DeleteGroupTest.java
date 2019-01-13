package ru.training.addressbook.tests;


import org.testng.annotations.Test;

public class DeleteGroupTest extends TestBase {

  @Test
  public void testDeleteGroup() throws Exception {
    app.getNavigationHelper().openGroupPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deleteSeletedGroups();
    app.getGroupHelper().returnToGroupPage();
  }

}
