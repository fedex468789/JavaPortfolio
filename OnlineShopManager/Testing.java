package OnlineShopManager;
public class Testing {
    public static void main(String[] args){
    
    OnlineShop shop = new OnlineShop();
    
    Client client1 = new Client("Alex" , "Marshall" , "+54 1124855317" , "Steak Street 450" , 00000001);
    Client client2 = new Client("Joe" , "Stewars" , "+54 1856020298" , "Ocean Drive 1856" , 00000002);
    Client client3 = new Client("Robert" , "Stine" , "+54 1627413825" , "The Strip 900" , 00000003);
    Client client4 = new Client("John" , "Magnum" , "+54 4644497848" , "Fifth Avenue 5645" , 00000004);
    
    client1.makeOrder();
    client2.makeOrder();
    client3.makeOrder();
    client4.makeOrder();

    shop.addShip(client1.makeOrder());



        

    





    }
    
}
