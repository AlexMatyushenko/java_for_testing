package ru.training.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.training.addressbook.model.GroupFormParameters;

public class GroupHelper extends HelperBase{

    public GroupHelper(WebDriver driver) {
        super(driver);
    }

    public void submitCreationGroup() {
        click(By.name("submit"));
    }

    public void fillGroupForm(GroupFormParameters groupFormParameters) {
        type(By.name("group_name"), groupFormParameters.getGroupName());
        type(By.name("group_header"), groupFormParameters.getGroupHeader());
        type(By.name("group_footer"), groupFormParameters.getGroupFooter());
    }

    public void pressButtonNewGroup() {
        click(By.name("new"));
    }



    public void deleteSeletedGroups() {
        click(By.name("delete"));
    }

    public void selectGroup() {
        click(By.name("selected[]"));
    }

    public void returnToGroupPage() {
        click(By.linkText("group page"));
    }

    public void clickButtonUpdateGroup() {
        click(By.name("update"));
    }

    public void pressButtonEditGroup() {
        click(By.name("edit"));
    }
}
