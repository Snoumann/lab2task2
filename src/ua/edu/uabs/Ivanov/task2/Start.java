package ua.edu.uabs.Ivanov.task2;

public class Start {

    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student("Pavlo");
        Student s3 = new Student("Volodumur");
        Lecturer l1 = new Lecturer();
        Lecturer l2 = new Lecturer("Roman", "Bogdanovich");
        Dean d1 = new Dean("Ivanov", "Viktor", "Serhijovich");

        s1.setFirstname("Andriy");
        s1.setSurname("Pankiv");
        s1.setLastname("Oleksijovich");
        s1.setAge(21);
        s1.setGroupnum("AK-15-3");

        s2.setSurname("Samuliak");
        s2.setLastname("Petrovich");
        s2.setAge(20);
        s2.setGroupnum("M-15-1");

        s3.setSurname("Vasulushun");
        s3.setLastname("Aslanovich");
        s3.setAge(22);
        s3.setGroupnum("IP-18-1");

        l1.setFirstname("Andriy");
        l1.setSurname("Semenchuk");
        l1.setLastname("Volodumurovich");
        l1.setAge(42);
        l1.setSubject("Math");

        l2.setSurname("Vovk");
        l2.setAge(39);
        l2.setSubject("Databases");

        d1.setAge(58);
        d1.setUniversity("IFNTUNG");

        s1.introduce_form1();
        s1.introduce_form2();
        s2.introduce_form1();
        s2.introduce_form2();
        s3.introduce_form1();
        s3.introduce_form2();
        l1.introduce_form1();
        l1.introduce_form2();
        l2.introduce_form1();
        l2.introduce_form2();
        d1.introduce_form1();
        d1.introduce_form2();

    }
}
