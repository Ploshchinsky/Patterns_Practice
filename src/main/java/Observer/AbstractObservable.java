package Observer;

import java.util.HashSet;
import java.util.Set;

public abstract class AbstractObservable {
    private Set<Observe> subscribers;

    public AbstractObservable() {
        subscribers = new HashSet<>();
    }

    public boolean addSubscriber(Observe subscriber) {
        return subscribers.add(subscriber);
    }

    public boolean deleteSubscriber(Observe subscriber) {
        return subscribers.remove(subscriber);
    }

    public void notifySubscribers() {
        subscribers.forEach(Observe::update);
    }

    public void notifyAllSubsWithInfo(String info) {
        subscribers.forEach(observe -> observe.update(info));
    }
}
