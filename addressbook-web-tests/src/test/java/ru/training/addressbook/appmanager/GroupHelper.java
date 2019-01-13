package ru.training.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.training.addressbook.model.GroupFormParameters;

public class GroupHelper {

    private WebDriver driver;

    public GroupHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void submitCreationGroup() {
        driver.findElement(By.name("submit")).click();
    }

    public void fillGroupForm(GroupFormParameters groupFormParameters) {
        driver.findElement(By.name("group_name")).click();
        driver.findElement(By.name("group_name")).clear();
        driver.findElement(By.name("group_name")).sendKeys(groupFormParameters.getGroupName());
        driver.findElement(By.name("group_header")).click();
        driver.findElement(By.name("group_header")).clear();
        driver.findElement(By.name("group_header")).sendKeys(groupFormParameters.getGroupHeader());
        driver.findElement(By.name("group_footer")).click();
        driver.findElement(By.name("group_footer")).clear();
        driver.findElement(By.name("group_footer")).sendKeys(groupFormParameters.getGroupFooter());
    }

    public void pressButtonNewGroup() {
        driver.findElement(By.name("new")).click();
    }



    public void deleteSeletedGroups() {
        driver.findElement(By.name("delete")).click();
    }

    public void selectGroup() {
        driver.findElement(By.name("selected[]")).click();
    }

    public void returnToGroupPage() {
        driver.findElement(By.linkText("group page")).click();
    }
}
