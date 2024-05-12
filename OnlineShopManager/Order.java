package OnlineShopManager;
import java.util.ArrayList;
public class Order {

    String orderOwner;
    String originalOwner;
    ArrayList <String> productList = new ArrayList<String>();
    int orderID;
    ShipStatusEnum.ShipStatus status;

    public Order() {
    }

    public Order(String orderOwner, int orderID, ShipStatusEnum.ShipStatus status , String originalOwner) {
        this.orderOwner = orderOwner;
        this.orderID = orderID;
        this.status = status;
        this.originalOwner = originalOwner;
    }

    public String getOrderOwner() {
        return orderOwner;
    }
    public void setOrderOwner(String orderOwner) {
        this.orderOwner = orderOwner;
    }
    public int getOrderID() {
        return orderID;
    }
    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }
    public ShipStatusEnum.ShipStatus getStatus() {
        return status;
    }
    public void setStatus(ShipStatusEnum.ShipStatus status) {
        this.status = status;
    }

    public void addProduct(String product){
        productList.add(product);
    }

    public void deleteProduct(String product){
        productList.remove(product);
    }

    public String getOriginalOwner(){
        return originalOwner;
    }

    public void setOriginalOrder(String owner){
        this.originalOwner = owner;
    }

    public void showProductList(){
        for (String string : productList) {
            System.out.println(string);
        }
    }

    @Override
    public String toString() {
        return "Order Owner: " + this.orderOwner + " , ship status: " + this.status + " , original owner is: " + this.originalOwner + " , product list: " + this.productList;
    }
}
