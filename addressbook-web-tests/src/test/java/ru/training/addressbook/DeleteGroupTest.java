package ru.training.addressbook;


import org.testng.annotations.Test;

public class DeleteGroupTest extends TestBase {

  @Test
  public void testDeleteGroup() throws Exception {
    openGroupPage();
    selectGroup();
    deleteSeletedGroups();
    returnToGroupPage();
  }

}
