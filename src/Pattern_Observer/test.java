package Pattern_Observer;
// Observer
// добавить новый тип соискателя
// добавить сущность вакансия (наименование, зп), разбить вакансии по типам
// компания дает вакансию, агенство рассылает по типу вакансий информацию соискателям

public class test {
    public static void main(String[] args) {
        Publisher publisher = new JobAgency();
        Company google = new Company("Google", publisher, 3500);
        Company yahoo = new Company("Yahoo", publisher, 1500);
        Company seneg = new Company("Seneg", publisher, 300);
        Student student1 = new Student("Reek");
        Student student2 = new Student("Nikolay");
        Master master1 = new Master("Vasiliy");
        Master master2 = new Master("Ivan");
        publisher.registerObserver(student1);
        publisher.registerObserver(student2);
        publisher.registerObserver(master1);
        publisher.registerObserver(master2);
        for (int i = 0; i < 4; i++) {
            google.needEmployee();
            yahoo.needEmployee();
            seneg.needEmployee();

        }

    }
}
