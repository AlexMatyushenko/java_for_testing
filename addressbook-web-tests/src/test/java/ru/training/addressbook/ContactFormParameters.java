package ru.training.addressbook;

public class ContactFormParameters {
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private final String nikName;
    private final String title;
    private final String company;
    private final String adress;
    private final String home;
    private final String mobile;
    private final String work;
    private final String fax;
    private final String email;
    private final String homepage;
    private final String day;
    private final String mounth;
    private final String year;
    private final String groupName;

    public ContactFormParameters(String firstName, String middleName, String lastName, String nikName, String title, String company, String adress, String home, String mobile, String work, String fax, String email, String homepage, String day, String mounth, String year, String groupName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.nikName = nikName;
        this.title = title;
        this.company = company;
        this.adress = adress;
        this.home = home;
        this.mobile = mobile;
        this.work = work;
        this.fax = fax;
        this.email = email;
        this.homepage = homepage;
        this.day = day;
        this.mounth = mounth;
        this.year = year;
        this.groupName = groupName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNikName() {
        return nikName;
    }

    public String getTitle() {
        return title;
    }

    public String getCompany() {
        return company;
    }

    public String getAdress() {
        return adress;
    }

    public String getHome() {
        return home;
    }

    public String getMobile() {
        return mobile;
    }

    public String getWork() {
        return work;
    }

    public String getFax() {
        return fax;
    }

    public String getEmail() {
        return email;
    }

    public String getHomepage() {
        return homepage;
    }

    public String getDay() {
        return day;
    }

    public String getMounth() {
        return mounth;
    }

    public String getYear() {
        return year;
    }

    public String getGroupName() {
        return groupName;
    }
}
