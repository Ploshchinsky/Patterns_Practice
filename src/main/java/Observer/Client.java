package Observer;

public class Client implements Observe {
    private String name;

    public Client(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println("Client [" + name + "] has received updated data from the server");
    }

    @Override
    public void update(String info) {
        System.out.println("Client [" + name + "] has received updated data from the server");
        System.out.println("Server info: " + info);
    }
}
