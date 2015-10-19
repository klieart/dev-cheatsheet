package ObserverPattern;

/**
 * Created by klieart on 3/4/15.
 */
public interface Subject {
    public void registerObserver(Object o);
    public void removeObserver(Object o);
    public void notifyObservers();
}