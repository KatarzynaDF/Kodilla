package order2;

public class OrderRequest {
    private String user;
    private String item;
    private String description;

    public OrderRequest(String user, String item, String description) {
        this.user = user;
        this.item = item;
        this.description = description;
    }

    public String getUser() {
        return user;
    }

    public String getItem() {
        return item;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "OrderRequest{" +
                "user='" + user + '\'' +
                ", item='" + item + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

