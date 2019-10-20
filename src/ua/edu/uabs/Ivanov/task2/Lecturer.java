package ua.edu.uabs.Ivanov.task2;

public class Lecturer { //клас Викладач
    private String firstname;
    private String surname;
    private String lastname;
    private int age;
    private String subject; //предмет

    public Lecturer() {
        System.out.println("Hi, I'm Lecturer! ");
    }

    public Lecturer(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        System.out.println("Hi, I'm Lecturer! My name is " + firstname + " " + lastname);
    }

    public void introduce_form1(){
        System.out.print("Lecturer "+surname+" "+firstname+" "+lastname);
        System.out.println(" age: " + age + ", " + subject);
    }

    public void introduce_form2(){
        char firstname_char = firstname.charAt(0);
        char lastname_char = lastname.charAt(0);

        char firstname_char_Upper = Character.toUpperCase(firstname_char);
        char lastname_char_Upper = Character.toUpperCase(lastname_char);

        System.out.print("LECTURER " + surname.toUpperCase() + " ");
        System.out.print(firstname_char_Upper+"."+lastname_char_Upper+"., ");
        System.out.println("AGE: " + age + ", " + subject.toUpperCase());
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
        if(age >= 23 & age <= 70){
            this.age = age;
        } else {
            System.out.println("Age is incorrect for lecturer");
        }
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
