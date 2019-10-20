package ua.edu.uabs.Ivanov.task2; //назва пакету

public class Student { //клас Студент
    //змінні класу
    private String firstname; //ім'я
    private String surname;   //прізвище
    private String lastname;  //по-батькові
    private int age;          //вік
    private String group;     //група

    //конструктор без параметрів
    public Student() {
        System.out.println("Hi. I'm student");
    }

    //конструктор з параметрами
    public Student(String firstname) {
        //присвоюємо змінній класу значення параметру
        this.firstname = firstname;
        System.out.println("Hi. I'm student! My name is " + firstname);
    }

    //метод називання себе у формі 1
    public void introduce_form1(){
        System.out.print("Student "+surname+" "+firstname+" "+lastname);
        System.out.println(" age: " + age + ", " + group);
    }

    //метод називання себе у формі 2 (верх регістр)
    public void introduce_form2(){
        //створюємо змінну firstname_char типу char та присвоюємо їй значення 1ого символу (за індексом 0)
        // значення змінної (firstname типу String), яке береться за допомогою методу charAt()
        char firstname_char = firstname.charAt(0);
        char lastname_char = lastname.charAt(0);

        //перетворення змінної firstname_char у верхній регістр та присвоєння змінній firstname_char_Upper
        char firstname_char_Upper = Character.toUpperCase(firstname_char);
        char lastname_char_Upper = Character.toUpperCase(lastname_char);

        System.out.print("STUDENT " + surname.toUpperCase() + " ");
        System.out.print(firstname_char_Upper+"."+lastname_char_Upper+"., ");
        System.out.println("AGE: " + age + ", " + group.toUpperCase());
    }

    //повертає значення змінної firstname типу String туди, де функція була викликана
    public String getFirstname() {
        return firstname;
    } //геттер імені

    //присвоює значення параметру firstname типу String змінній класу firstname
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    } //сеттер імені

    public String getSurname() {
        return surname;
    } //геттер прізвища

    public void setSurname(String surname) {
        this.surname = surname;
    } //сеттер прізвища

    public String getLastname() {
        return lastname;
    } //геттер по-батькові

    public void setLastname(String lastname) {
        this.lastname = lastname;
    } //сеттер по-батькові

    public int getAge() {
        return age;
    } //геттер віку

    //сеттер віку
    public void setAge(int age) {
        if(age >= 18 & age <= 70){ //умова перевірки параметру
            this.age = age;
        } else {
            System.out.println("Age is incorrect for student");
        }
    }

    public String getGroup() {
        return group;
    } //геттер назви групи

    public void setGroupnum(String group) {
        this.group = group;
    } //сеттер назви групи
}
