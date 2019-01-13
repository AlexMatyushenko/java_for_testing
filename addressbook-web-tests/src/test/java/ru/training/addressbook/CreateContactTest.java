package ru.training.addressbook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class CreateContactTest {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new ChromeDriver();
    baseUrl = "https://www.katalon.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    login("admin", "secret");
  }

  private void login(String login, String password) {
    driver.get("http://localhost/addressbook/");
    driver.findElement(By.name("user")).click();
    driver.findElement(By.name("user")).clear();
    driver.findElement(By.name("user")).sendKeys(login);
    driver.findElement(By.name("pass")).clear();
    driver.findElement(By.name("pass")).sendKeys(password);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Password:'])[1]/following::input[2]")).click();
  }

  @Test
  public void testCreateContact() throws Exception {
    initContactCreation();
    fillContactForm(new ContactFormParameters("Александр", "Викторович", "Матюшенко", "Guevara", "Title", "Company", "Adress", "Home", "999999999", "Work", "Fax", "guevara@gmail.com", "localhost", "25", "January", "1991", "FirstGroup"));
    submitContactCreation();
  }

  private void submitContactCreation() {
    driver.findElement(By.name("new_group")).click();
  }

  private void fillContactForm(ContactFormParameters contactGroup) {
    driver.findElement(By.name("firstname")).click();
    driver.findElement(By.name("firstname")).clear();
    driver.findElement(By.name("firstname")).sendKeys(contactGroup.getFirstName());
    driver.findElement(By.name("middlename")).clear();
    driver.findElement(By.name("middlename")).sendKeys(contactGroup.getMiddleName());
    driver.findElement(By.name("lastname")).clear();
    driver.findElement(By.name("lastname")).sendKeys(contactGroup.getLastName());
    driver.findElement(By.name("nickname")).clear();
    driver.findElement(By.name("nickname")).sendKeys(contactGroup.getNikName());
    driver.findElement(By.name("title")).clear();
    driver.findElement(By.name("title")).sendKeys(contactGroup.getTitle());
    driver.findElement(By.name("company")).clear();
    driver.findElement(By.name("company")).sendKeys(contactGroup.getCompany());
    driver.findElement(By.name("address")).clear();
    driver.findElement(By.name("address")).sendKeys(contactGroup.getAdress());
    driver.findElement(By.name("home")).clear();
    driver.findElement(By.name("home")).sendKeys(contactGroup.getHome());
    driver.findElement(By.name("mobile")).clear();
    driver.findElement(By.name("mobile")).sendKeys(contactGroup.getMobile());
    driver.findElement(By.name("work")).clear();
    driver.findElement(By.name("work")).sendKeys(contactGroup.getWork());
    driver.findElement(By.name("fax")).clear();
    driver.findElement(By.name("fax")).sendKeys(contactGroup.getFax());
    driver.findElement(By.name("email")).clear();
    driver.findElement(By.name("email")).sendKeys(contactGroup.getEmail());
    driver.findElement(By.name("homepage")).clear();
    driver.findElement(By.name("homepage")).sendKeys(contactGroup.getHomepage());
    driver.findElement(By.name("bday")).click();
    new Select(driver.findElement(By.name("bday"))).selectByVisibleText(contactGroup.getDay());
    driver.findElement(By.name("bday")).click();
    driver.findElement(By.name("bmonth")).click();
    new Select(driver.findElement(By.name("bmonth"))).selectByVisibleText(contactGroup.getMounth());
    driver.findElement(By.name("bmonth")).click();
    driver.findElement(By.name("byear")).click();
    driver.findElement(By.name("byear")).clear();
    driver.findElement(By.name("byear")).sendKeys(contactGroup.getYear());
    driver.findElement(By.name("new_group")).click();
    new Select(driver.findElement(By.name("new_group"))).selectByVisibleText(contactGroup.getGroupName());
  }

  private void initContactCreation() {
    driver.findElement(By.linkText("add new")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }


}
