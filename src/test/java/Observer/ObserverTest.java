package Observer;

import org.junit.jupiter.api.Test;

public class ObserverTest {
    @Test
    public void test1() {
        Client client1 = new Client("Incognito");
        Client client2 = new Client("Streamer");
        Client client3 = new Client("Watcher2000@yahoo.com");

        Blog blog = new Blog();
        blog.addSubscriber(client1);
        blog.addSubscriber(client2);
        blog.addSubscriber(client3);
        System.out.println("----");
        blog.notifySubscribers();
        System.out.println("----");
        blog.notifyAllSubsWithInfo("BLOG UPDATED");
        blog.deleteSubscriber(client2);
        System.out.println("----");
        blog.notifySubscribers();
        System.out.println("----");
        blog.notifyAllSubsWithInfo("BLOG UPDATED");
    }
}
