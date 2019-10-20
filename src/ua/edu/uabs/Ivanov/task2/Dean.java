package ua.edu.uabs.Ivanov.task2;

public class Dean {  //клас декан
    private String firstname;
    private String surname;
    private String lastname;
    private int age;
    private String university; //університет

    public Dean(){
        System.out.println("Hi, I'm Dean!");
    }

    public Dean(String surname, String firstname, String lastname ) {
        this.surname = surname;
        this.firstname = firstname;
        this.lastname = lastname;
        System.out.println("Hi, I'm Dean! My name is " + surname + " " + firstname + " " + lastname);
    }

    public void introduce_form1(){
        System.out.print("Dean "+surname+" "+firstname+" "+lastname);
        System.out.println(" age: " + age + ", " + university);
    }

    public void introduce_form2(){
        char firstname_char = firstname.charAt(0);
        char lastname_char = lastname.charAt(0);

        char firstname_char_Upper = Character.toUpperCase(firstname_char);
        char lastname_char_Upper = Character.toUpperCase(lastname_char);

        System.out.print("DEAN " + surname.toUpperCase() + " ");
        System.out.print(firstname_char_Upper+"."+lastname_char_Upper+"., ");
        System.out.println("AGE: " + age + ", " + university.toUpperCase());
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 25 & age <= 70){
            this.age = age;
        } else {
            System.out.println("Age is incorrect for dean");
        }
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
}
