package project.logic;

import java.time.LocalDate;
import java.time.Period;
import java.time.Year;

import project.logic.model.Address;
import project.logic.model.User;
import project.logic.model.age;

public class UserMain {
	static LocalDate DOB; // calculating the age from date of birth
	static LocalDate currentDate;
	static int age;
	
	
	
    public static void main(String[] args){
        User user1=new User();
        user1.setfName("Rahul");
        user1.setlName("Singh");
        user1.setyear(1990);
        user1.setmonth(1);
        user1.setday(20);
         DOB = LocalDate.of(user1.getyear(), user1.getmonth(), user1.getday()); 
         currentDate = LocalDate.now(); 
         age =Period.between(DOB, currentDate).getYears();// calculating the age from date of birth
        user1.setAge(age);
        user1.setSalary(3500.00);
        Address address=new Address();
        address.setCity("Montreal");
        address.setCountry("CA");
        address.setProvince("Quebec");
        address.setStreetName("Saint Mark");
        user1.setAddress(address);



        User user2=new User();
        user2.setfName("Nikita");
        user2.setlName("John");
        user2.setyear(1980);
        user2.setmonth(1);
        user2.setday(20);
         DOB = LocalDate.of(user2.getyear(), user2.getmonth(), user2.getday());
         currentDate = LocalDate.now(); 
        age =Period.between(DOB, currentDate).getYears();
        user2.setAge(age);
        user2.setSalary(2500.00);
       Address address2=new Address();
        address2.setCity("Ottawa");
        address2.setCountry("CA");
        address2.setProvince("Ontario");
        address2.setStreetName("Saint Matheiu");
        user2.setAddress(address2); // changed the parameter from address to address2


        User user3=new User();
        user3.setfName("George");
        user3.setlName("Thomas");
        user3.setyear(1995);
        user3.setmonth(1);
        user3.setday(20);
         DOB = LocalDate.of(user3.getyear(), user3.getmonth(), user3.getday());
        currentDate = LocalDate.now(); 
        age =Period.between(DOB, currentDate).getYears();
        user2.setAge(age);
        user3.setSalary(1800.00);
        Address address3=new Address();
        address3.setCity("Ottawa");
        address3.setCountry("CA");
        address3.setProvince("Ontario");
        address3.setStreetName("Saint Matheiu");
        user3.setAddress(address3); // added address to user3



        System.out.println(user1.toString());
        Double salaryAccumulatedUser1= UserDetails.SalaryAccumulated(user1);
        System.out.println("salaryAccumulated= " +salaryAccumulatedUser1);
        //TODO : WEB-4 user2 address was attached with the user1's address in setAddress method.
        System.out.println(user2.toString());
        Double salaryAccumulatedUser2= UserDetails.SalaryAccumulated(user2);
        System.out.println("salaryAccumulated= "+salaryAccumulatedUser2);

        //TODO : WEB-5
        Boolean isCanadian= UserDetails.VerifyCountry(user3); // user was not having an address to verify the country.
        System.out.println(UserDetails.FullName(user3)+" is "+isCanadian);


    }
}
