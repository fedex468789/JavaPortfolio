package OnlineShopManager;
import java.util.ArrayList;
public class OnlineShop {
    
    ArrayList<Client> clientList = new ArrayList<Client>();
    ArrayList<Order> orderList = new ArrayList<Order>();

    public void addOrder(Order order){
        this.orderList.add(order);
    }
    public void addClient(Client client){
        this.clientList.add(client);
    }

    public void showClientList(){
        for (Client client : clientList) {
            System.out.println(client.getClientInfo());
        }
    }

    public void getSpecificClientInfo(String name){
        int i = 0;
        while(i < clientList.size()){
            Client clientRef = clientList.get(i);
            if (clientRef.getName().equalsIgnoreCase(name)){
                System.out.println("User found, getting all data....");
                System.out.println(clientRef.getClientInfo());
            }
            i++;
        }
    }
}
