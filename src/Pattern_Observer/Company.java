package Pattern_Observer;


import java.util.Random;

public class Company {
    Random random = new Random();
    private String name;
    private Publisher jobAgency; // связь через интерфейс по принципам солид
    private int maxSalary;

    public Company(String name, Publisher jobAgency, int maxSalary) {
        this.name = name;
        this.jobAgency = jobAgency;
        this.maxSalary = maxSalary;
    }
    public void needEmployee(){
        int salary = random.nextInt(maxSalary);
        jobAgency.sendOffer(name, salary);
    }
}
