package model;

/**
 * @author devin
 */
public class Student {

    private String firstName;

    private  String lastName;
    
    private Integer age;

    private String gender;
    
    private String iDNo;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getiDNo() {
        return iDNo;
    }

    public void setiDNo(String iDNo) {
        this.iDNo = iDNo;
    }

    public String printInfo(){
        return "FirstName:"+firstName+
                ",LastName:"+lastName+
                ",Age:"+age+
                ",Gender:"+gender+
                ",idno.:"+iDNo;
    }
}
