package OnlineShopManager;
import java.util.Scanner;
public class Client {
    final static Scanner input = new Scanner(System.in);
    String name;
    String surname;
    String phoneNumber;
    String addres;
    int clientID;
    Order clientOrder;

    public Client(String name, String surname, String phoneNumber, String addres, int clientID) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.addres = addres;
        this.clientID = clientID;
        this.clientOrder = new Order();
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getAddres() {
        return addres;
    }
    public void setAddres(String addres) {
        this.addres = addres;
    }
    public int getClientID() {
        return clientID;
    }
    public void setClientID(int clientID) {
        this.clientID = clientID;
    }
    public Order getClientOrder() {
        return clientOrder;
    }
    public void setClientOrder(Order clientOrder) {
        this.clientOrder = clientOrder;
    }

    public void makeOrder() {
        System.out.println("Welcome to Karefur");
    
        String userInput;
        do {
            System.out.println("Please enter the products you want to add to the order or press 'E' to exit and save the order:");
            userInput = input.nextLine();
            clientOrder.addProduct(userInput);
            clientOrder.showProductList();
            System.out.println("Added successfully");
        } while(!userInput.equalsIgnoreCase("E"));
        System.out.println("Now enter the order owner:");
        userInput = input.nextLine();
        clientOrder.setOrderOwner(userInput);
        clientOrder.setStatus(ShipStatusEnum.ShipStatus.IN_PROCESS);
        clientOrder.setOriginalOrder(this.name);
    }
    
    public String getClientInfo(){
        String info = "Name: " + this.name + " , adress: " + this.addres + " , ID: " + this.clientID + " , phonenumbre: " + this.phoneNumber + " and the order is: " + clientOrder;
    return info;}



    

    
}
