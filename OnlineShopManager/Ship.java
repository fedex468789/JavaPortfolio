package OnlineShopManager;
import java.util.ArrayList;
public class Ship {
    ShipStatusEnum.ShipStatus shipStatus;
    Client client;
    double price;
    int ID;
    ArrayList<String> products = new ArrayList<String>();

    public Ship() {
    }

    public Ship(Client client, double price, int iD) {
        this.shipStatus = ShipStatusEnum.ShipStatus.IN_PROCESS;
        this.client = client;
        this.price = price;
        ID = iD;
    }

    // Getters and setters

    public ShipStatusEnum.ShipStatus getShipStatus() {
        return shipStatus;
    }

    public void setShipStatus(ShipStatusEnum.ShipStatus shipStatus) {
        this.shipStatus = shipStatus;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    // Methods

    public void addProducts(String products){
        this.products.add(products);
    }
}
