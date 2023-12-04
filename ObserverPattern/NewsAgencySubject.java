package ObserverPattern;

public interface NewsAgencySubject {
    void subscribe(Subscriber subscriber);
    void unsubscribe(Subscriber subscriber);
    void notifySubscribers(String news);
}