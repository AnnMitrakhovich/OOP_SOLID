package Pattern_Observer;
// зависимость 1 ко многим: агенство одно, соискателей (мастер с опытом и студент без опыта) много
// связь идет через наблюдателя, поэтому в агентве мы храним коллекцию всех наблюдателей(соискателей).

import java.util.ArrayList;
import java.util.Collection;

public class JobAgency implements Publisher{
    Collection<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void sendOffer(String companyName, int salary) {
        for (Observer obs: observers) {
            obs.receiveOffer(companyName, salary);

        }

    }
}
