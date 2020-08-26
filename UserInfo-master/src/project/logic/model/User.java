package project.logic.model;

public class User {
    private String fName;
    // TODO : RQ - 1
    private int age;
    private int year;
    private int month;
    private int day;
    
    private String lName;
    private Address address;
    private Double salary;



    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public int getyear() {
        return year;
    }

    public void setyear(int year) {
        this.year = year;
    }
    
    public int getmonth() {
        return month;
    }

    public void setmonth(int month) {
        this.month = month;
    }
    
    public int getday() {
        return day;
    }

    public void setday(int day) {
        this.day = day;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "User{" +
                "fName='" + fName + '\'' +
                ", age=" + age +
                ", lName='" + lName + '\'' +
                ", address=" + address +
                ", salary=" + salary +
                '}';
    }
}
