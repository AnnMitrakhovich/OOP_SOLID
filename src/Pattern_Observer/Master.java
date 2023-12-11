package Pattern_Observer;


public class Master implements Observer{
    private String name;
    private int minSalary = 1000; // сразу сами указали для теста

    public Master(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(String companyName, int salary) {
        if (this.minSalary <= salary) {
            System.out.printf("Отлично, мне %s нужна такая работа в %s c зарплатой %d\n", name, companyName, salary);
        }
        else {
            System.out.printf("%d слишком маленькая, найду лучше\n", salary);
        }

    }
}
