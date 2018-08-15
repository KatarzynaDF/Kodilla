package order2;

public class OrderDto {

    private String user;
    private boolean login;

    public String getUser() {
        return user;
    }

    public boolean isLogin() {
        return login;
    }

    public OrderDto(String user, boolean login) {
        this.user = user;
        this.login = login;
    }

    @Override
    public String toString() {
        return "OrderDto{" +
                "user='" + user + '\'' +
                ", login=" + login +
                '}';
    }
}

